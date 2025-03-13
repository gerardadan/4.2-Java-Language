package org.exercice1;

import java.util.Objects;

public class Book implements Comparable<Book> {
    private final int isbn;
    private final String title;

    public Book(int isbn, String title) {
        this.isbn = isbn;
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public int getIsbn() {
        return isbn;
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn, title);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Book book = (Book) obj;

        return isbn == book.isbn && Objects.equals(title, book.title);
    }

    @Override
    public int compareTo(Book other) {
        int result;
        if (this.title.equals(other.title)) {
            result = Integer.compare(this.isbn, other.isbn);
        } else {
            result = this.title.compareTo(other.title);
            if (result > 0)
                result = 1;
            else if (result < 0)
                result = -1;
        }

        return result;
    }
}
