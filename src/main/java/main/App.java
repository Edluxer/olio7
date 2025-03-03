package main;

import java.util.Scanner;

public class App {
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        Library library = new Library();

        boolean exit = false;
        while(!exit) {
            System.out.println("1) Lisää kirja");
            System.out.println("2) Listaa kirjat");
            System.out.println("3) Lainaa fiktiokirja");
            System.out.println("4) Palauta fiktiokirja");
            System.out.println("0) Lopeta peli");

            try {
                int i = Integer.parseInt(sc.nextLine());

                switch(i) {
                    case 1:
                        library.addBook();
                        break;
                    case 2:
                        library.listBooks();
                        break;
                    case 3:
                        System.out.println("Anna lainattavan kirjan nimi:");
                        String borrowTitle = sc.nextLine();
                        Book bookToBorrow = library.findBook(borrowTitle);
                        if (bookToBorrow instanceof FictionBook) {
                            ((FictionBook) bookToBorrow).borrow();
                        } else {
                            System.out.println("Kirjaa ei löytynyt tai sitä ei voi lainata.");
                        }
                        break;
                    case 4:
                        System.out.println("Anna palautettavan kirjan nimi:");
                        String returnTitle = sc.nextLine();
                        Book bookToReturn = library.findBook(returnTitle);
                        if (bookToReturn instanceof FictionBook) {
                            ((FictionBook) bookToReturn).returnBook();
                        } else {
                            System.out.println("Kirjaa ei löytynyt tai sitä ei voi palauttaa.");
                        }
                        break;
                    case 0:
                        System.out.println("Kiitos ohjelman käytöstä.");
                        exit = true;
                        break;
                    default:
                        System.out.println("Syöte oli väärä.");
                        break;
                }
            }
            catch (NumberFormatException e) {
                System.out.println("Väärä syöte.");

            }
        }
        sc.close();
    }
}
