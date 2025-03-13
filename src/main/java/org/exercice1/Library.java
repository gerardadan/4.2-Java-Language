package org.exercice1;

import java.util.ArrayList;
import java.util.List;

class Library {
    private final List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        if (book != null && !books.contains(book)) {
            books.add(book);
            books.sort((b1, b2) -> b1.getTitle().compareTo(b2.getTitle()));
        }
    }

    public List<Book> getBookList() {
        return new ArrayList<>(books);
    }

    public Book getBookByIndex(int position) {
        if (position >= 0 && position < books.size()) {
            return books.get(position);
        }
        throw new IndexOutOfBoundsException("Position out of range");
    }

    public void addBookAtPosition(int position, Book book) {
        if (book != null && !books.contains(book)) {
            if (position >= 0 && position <= books.size()) {
                books.add(position, book);
                books.sort((b1, b2) -> b1.getTitle().compareTo(b2.getTitle()));
            } else {
                throw new IndexOutOfBoundsException("Position out of range");
            }
        }
    }

    public boolean removeBookByIsbn(int isbn) {
        return books.removeIf(book -> book.getIsbn() == isbn);
    }

    public boolean removeBookByTitle(String title) {
        return books.removeIf(book -> book.getTitle().equals(title));
    }

}