package org.exercice1;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        library.addBook(new Book(111, "Harry Potter"));
        library.addBook(new Book(222, "Moby dick"));
        library.addBook(new Book(333, "The lord of the rings"));

        System.out.println("Book list: " + library.getBookList());
    }
}