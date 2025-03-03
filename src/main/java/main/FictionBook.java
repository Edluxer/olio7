package main;

public class FictionBook extends Book {
    private int borrowedCount = 0;

    public FictionBook(String title, String author, int pages, int copies) {
        super(title, author, pages, copies);
    }
    
    @Override
    public String categorize() {
        return "Fiktiokirja";
    }

    
    public void borrow() {
        if (getCopies() > 0) {
            setCopies(getCopies() - 1);
            borrowedCount++;
            System.out.println("Kirja " + getTitle() + " on nyt lainattu.");
        } else {
            System.out.println("Kirjaa " + getTitle() + " ei enää ole lainattavissa!");
        }
    }

    
    public void returnBook() {
        if (borrowedCount > 0) {
            setCopies(getCopies() + 1);
            borrowedCount--;
            System.out.println("Kirja " + getTitle() + " on palautettu.");
        } else {
            System.out.println("Kirja " + getTitle() + " ei ole lainassa.");
        }
    }
}
