package main;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Kirja lisätty kirjastoon!");

    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void listBooks() {
        int totalCopies = 0;
        for (Book book : books) {
            book.displayInfo();
            totalCopies += book.getCopies();
        }
        System.out.println("Kirjojen määrä kirjastossa on: " + totalCopies);
    }

    public Book findBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }
    

}
