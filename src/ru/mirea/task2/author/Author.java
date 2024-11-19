package ru.mirea.task2.author;

public class Author {
    private String name, email;
    private char gender;

    public Author(String name, String email, char gender){
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() { return name; }

    public String getEmail() { return email; }

    public void setEmail(String email) { this.email = email; }

    public char getGender() { return gender; }

    @Override
    public String toString() {
        return "Author's name: " + this.name + ", gender: " + this.gender + ", email: " + this.email;
    }
}