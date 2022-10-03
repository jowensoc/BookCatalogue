package com.example.bookcatalogue;

import com.example.bookcatalogue.services.*;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class BookCatalogue {

    private static IBookService bookService;

    public static void main(String[] args) {
        bookService = new BookService();
        List<Book> listOfBooks = generateBooks();

        for (Book book: listOfBooks) {
            bookService.AddBook(book);
        }

        Book randomBook = listOfBooks.get(2);

        displayBooks();

        randomBook.setBookTitle("Updated Book Title");

        bookService.UpdateBook(randomBook);
    }

    private static List<Book> generateBooks() {
        List<Book> listOfBooks = new ArrayList<Book>();

        listOfBooks.add(new Book(1,"The Crow Road", "Iain Banks"));
        listOfBooks.add(new Book(2,"King of Thorns", "Mark Lawerence", "Fantasy"));
        listOfBooks.add(new Book(3,"Widespread Panic", "James Ellroy"));
        listOfBooks.add(new Book(4,"Salem's Lot", "Stephen King", "Horror"));
        listOfBooks.add(new Book(5,"Twisted Bodies", "T.S Kingfisher"));

        return listOfBooks;
    }

    private static void displayBooks() {
        List<Book> listOfBooks = bookService.GetBooks();

        for (Book book: listOfBooks) {
            System.out.println(book.toBookDetails());
        }
    }

}
