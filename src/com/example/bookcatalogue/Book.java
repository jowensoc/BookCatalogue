package com.example.bookcatalogue;

public class Book {

    String BookTitle;
    Author BookAuthor;
    Integer ID;
    Genre BooKGenre;

    public Book(String bookTitle, String authorName) {
        initialise(0, bookTitle, authorName, null);
    }

    public Book(String bookTitle, String authorName, String genreName) {
        initialise(0, bookTitle, authorName, genreName);
    }

    public Book(Integer id, String bookTitle, String authorName) {
        initialise(id, bookTitle, authorName, null);
    }

    public Book(Integer id, String bookTitle, String authorName, String genreName) {
        initialise(id, bookTitle, authorName, genreName);
    }

    private void initialise(Integer id, String bookTitle, String authorName, String genreName) {
        setBookID(id);
        setBookTitle(bookTitle);
        setAuthor(authorName);
        setBookGenre(genreName);
    }

    public void setBookID(Integer bookID) {
        ID  = bookID;
    }

    public Integer getBookID() {
        return ID;
    }

    public void setBookTitle(String bookTitle) {
        BookTitle  = bookTitle;
    }

    public String getBookTitle() {
        return BookTitle;
    }

    public void setAuthor(String authorName) {
        BookAuthor  = new Author(authorName);
    }

    public Author getBookAuthor() {
        return BookAuthor;
    }

    public String getBookAuthorName() {
        return BookAuthor.fullName;
    }

    public void setBookGenre(String genreName) {

        genreName = (genreName == null) ? "Fiction" : genreName.trim();

        BooKGenre  = new Genre(genreName);
    }

    public String getBookGenre() {
        return BooKGenre.GenreName;
    }

    public String toBookDetails() {
        return getBookTitle() + " by " + getBookAuthorName() + ". Genre: " + getBookGenre();
    }
}
