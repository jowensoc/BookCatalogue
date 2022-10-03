package com.example.bookcatalogue.services;

import com.example.bookcatalogue.Book;
import com.example.bookcatalogue.SearchParameters;

import java.util.*;

public class BookService implements IBookService {
    List<Book> listOfBooks;

    public BookService() {
        listOfBooks = new ArrayList<Book>();
    }

    @Override
    public void AddBook(Book book) {
        listOfBooks.add(book);
    }

    @Override
    public void DeleteBook(Book book) {
        listOfBooks.remove(book);
    }

    @Override
    public void UpdateBook(Book book) {
        Integer idx = 0;

        for (Book tempBook: listOfBooks) {
            if (book.getBookID().equals(tempBook.getBookID())) {

            }
            idx++;
        }

    }

    private List<Book> searchBooks(SearchParameters searchParameters) {
        List<Book> tempList;

        // NO SEARCH PARAMETERS? RETURN ALL BOOKS
        if(searchParameters == null) {
            tempList = new ArrayList<Book>(listOfBooks);
        } else {
            tempList = new ArrayList<Book>();

            for (Book book: listOfBooks) {
                if (searchParameters.ID != 0) {
                    if (book.getBookID() == searchParameters.ID) {
                        tempList.add(book);
                        continue;
                    }
                }

                if (!searchParameters.BookTitle.equals("")) {
                    if (book.getBookTitle().compareToIgnoreCase(searchParameters.BookTitle) >= 0) {
                        tempList.add(book);
                        continue;
                    }
                }

                if (!searchParameters.Genre.equals("")) {
                    if (book.getBookGenre().compareToIgnoreCase(searchParameters.Genre) >= 0) {
                        tempList.add(book);
                    }
                }
            }
        }

        Collections.sort(tempList, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getBookTitle().compareToIgnoreCase(o2.getBookTitle());
            }
        });

        return tempList;
    }

    @Override
    public List<Book> GetBooks() {
        return searchBooks(null);
    }

    @Override
    public List<Book> SearchBooks(SearchParameters search) {
        return searchBooks(search);
    }


}
