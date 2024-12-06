package ru.mirea.task7.no7_8;

public interface Printable {
    void print();
}

class Book implements Printable {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    @Override
    public void print() {
        System.out.println("book's title: " + title);
    }

    public static void printBooks(Printable[] printable) {
        System.out.println("books:");
        for (Printable p : printable) {
            if (p instanceof Book) {
                p.print();
            }
        }
    }
}

class Magazine implements Printable {
    private String title;

    public Magazine(String title) {
        this.title = title;
    }

    @Override
    public void print() {
        System.out.println("magazine's title: " + title);
    }

    public static void printMagazines(Printable[] printable) {
        System.out.println("magazines:");
        for (Printable p : printable) {
            if (p instanceof Magazine) {
                p.print();
            }
        }
    }
}

class Main {
    public static void main(String[] args) {
        Printable[] printable = new Printable[4];
        printable[0] = new Book("Dune");
        printable[1] = new Book("1984");
        printable[2] = new Magazine("Vogue");
        printable[3] = new Magazine("Time");

        System.out.println("all objects:");
        for (Printable p : printable) {
            p.print();
        }
        System.out.println();
        Magazine.printMagazines(printable);
        System.out.println();
        Book.printBooks(printable);
    }
}