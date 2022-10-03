package com.example.bookcatalogue.services;

import com.example.bookcatalogue.Book;
import com.example.bookcatalogue.SearchParameters;

import java.util.List;

public interface IBookService {

    void AddBook(Book book);

    void DeleteBook(Book book);

    void UpdateBook(Book book);

    List<Book> GetBooks();

    List<Book> SearchBooks(SearchParameters search);
}
