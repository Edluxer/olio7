package main;

public abstract class Book {
    private String title;
    private String author;
    private int pages;
    private int copies;

    public Book(String title, String author, int pages, int copies) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.copies = copies;
    }

    public abstract String categorize();

    public void displayInfo() {
        System.out.println("Nimi: " + title + ", Kirjailija: " + author + ", Sivut: " + pages + ", Määrä: " + copies);
    }

    public int getCopies() {
        return copies;
    }

    public void setCopies(int copies) {
        this.copies = copies;
    }
    public String getTitle() {
        return title;
    }
}

