package com.example.bookcatalogue;

public class Author {

    String fullName;
    String firstName;
    String lastName;

    public Author(String name) {
        setFullName(name);
    }

    public void setFullName(String name) {
        fullName = name.trim();

        String[] tempValues = name.trim().split(" ");

        firstName = tempValues[0];
        lastName = tempValues[1];

    }

    public String getFullName() {
        return fullName;
    }

}
