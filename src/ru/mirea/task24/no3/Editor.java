package ru.mirea.task24.no3;

interface IDocument {
    void open();
    void save();
    String getContent();
}

class TextDocument implements IDocument {
    private String content;

    public TextDocument() {
        this.content = "";
    }

    @Override
    public void open() {
        this.content = "this is a new document";
        System.out.println("document is open: " + content);
    }

    @Override
    public void save() {
        System.out.println("document is saved: " + content);
    }

    @Override
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}

interface ICreateDocument {
    IDocument createNew();
    IDocument createOpen();
}

class CreateTextDocument implements ICreateDocument {
    @Override
    public IDocument createNew() {
        return new TextDocument();
    }

    @Override
    public IDocument createOpen() {
        TextDocument textDocument = new TextDocument();
        textDocument.open();
        return textDocument;
    }
}

public class Editor {
    private IDocument document;
    private ICreateDocument documentFactory;

    public Editor(ICreateDocument factory) {
        this.documentFactory = factory;
    }

    public void newDocument() {
        document = documentFactory.createNew();
        System.out.println("creating new document");
    }

    public void openDocument() {
        document = documentFactory.createOpen();
        System.out.println("document is opened");
    }

    public void saveDocument() {
        try{
            if (document == null){
                throw new NullPointerException("there is no document to save");
            }
            document.save();
        } catch (Exception e){
            System.out.println("error: " + e.getMessage());
        }
    }

    public void setDocumentContent(String content) {
        if (document instanceof TextDocument) {
            ((TextDocument) document).setContent(content);
        }
    }

    public IDocument getDocument() {
        return document;
    }
}


class Main {
    public static void main(String[] args) {
        ICreateDocument textFactory = new CreateTextDocument();

        Editor editor = new Editor(textFactory);

        editor.newDocument();
        editor.setDocumentContent("Rammstein");
        editor.saveDocument();
        editor.openDocument();
    }
}
