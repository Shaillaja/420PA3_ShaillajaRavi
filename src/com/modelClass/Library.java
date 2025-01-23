package com.modelClass;
import java.util.List;
import java.util.ArrayList;

public class Library {
    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }
    public boolean addBook(Book book) {
        for (Book b1 : books) {
            if (b1.getTitle().equals(book.getTitle())) {
                return false;
            }
        }
        books.add(book);
        return true;
    }
    public boolean removeBook(String title) {
        return books.removeIf(b -> b.getTitle().equals(title));
    }
    public Book searchBook(String title) {
        for (Book b3 : books) {
            if (b3.getTitle().equals(title)) {
                return b3;
            }
        }
        return null;
    }
}
