package main;

import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void addBook() {
        System.out.println("Minkä kirjan haluat lisätä kirjastoon? 1) Fiktiokirja, 2) Tietokirja");
        int bookType = Integer.parseInt(sc.nextLine());
        
        System.out.println("Anna kirjan nimi:");
        String title = sc.nextLine();

        System.out.println("Anna kirjailijan nimi:");
        String author = sc.nextLine();

        System.out.println("Anna sivumäärä:");
        int pages = Integer.parseInt(sc.nextLine());

        System.out.println("Anna kirjojen määrä:");
        int copies = Integer.parseInt(sc.nextLine());

        if (bookType != 1 && bookType != 2) {
            System.out.println("Virheellinen kirjatyyppi.");
            return;
        }

        if (bookType == 1) {
            books.add(new FictionBook(title, author, pages, copies));
        } else if (bookType == 2) {
            books.add(new NonFictionBook(title, author, pages, copies));
        }

        System.out.println("Kirja lisätty kirjastoon!");

    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void listBooks() {
        int totalCopies = 0;
        for (Book book : books) {
            book.displayInfo();
            System.out.println("Kirjan kategoria: " + book.categorize());
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
