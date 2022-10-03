package com.example.bookcatalogue;

public class Genre {
    String GenreName;

    public Genre(String name) {
        setGenreName(name);
    }

    public void setGenreName(String name) {
        GenreName = name;
    }

    public void getGenreName(String name) {
        GenreName = name;
    }
}
