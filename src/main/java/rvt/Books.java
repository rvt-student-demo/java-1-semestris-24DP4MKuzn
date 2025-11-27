package rvt;

import java.util.ArrayList;
import java.util.Scanner;

class Book {
    String title;
    int pages;
    int year;

    Book(String bookTitle, int bookPages, int bookYear) {
        title = bookTitle;
        pages = bookPages;
        year = bookYear;
    }
}

public class Books {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        boolean stop = false;
        while (stop == false) {
            System.out.print("Title: ");
            String title = scanner.nextLine();

            if (title.equals("")) {
                stop = true;
                break;
            }

            System.out.print("Pages: ");
            int pages = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Publication year: ");
            int year = scanner.nextInt();
            scanner.nextLine();

            books.add(new Book(title, pages, year));
        }

        System.out.print("What information will be printed? ");
        String choice = scanner.nextLine();

        if (choice.equals("everything")) {
            for (int i = 0; i < books.size(); i++) {
                Book book = books.get(i);
                System.out.println(book.title + ", " + book.pages + " pages, " + book.year);
            }
        } else if (choice.equals("name")) {
            for (int i = 0; i < books.size(); i++) {
                Book book = books.get(i);
                System.out.println(book.title);
            }
        }
    }
}
