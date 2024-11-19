package ru.mirea.task2.author;

public class TestAuthor {
    public static void main(String[] args) {
        Author author = new Author("Isaac Asimov", "asimov@gmail.com", 'm');
        System.out.println("name: " + author.getName());
        System.out.println("gender: " + author.getGender());
        System.out.println(author.toString());
        author.setEmail("isaac@gmail.com");
        System.out.println("new email: " + author.getEmail());
    }
}
