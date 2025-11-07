package com.moteadev.Library_Management_API.books.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class Book {
    private String isbn;
    private String title;
    private String description;
    private String author;

    public Book(String title, String description, String author) {
        this.isbn= UUID.randomUUID().toString();
        this.title = title;
        this.description = description;
        this.author = author;
    }
    @JsonCreator
    public Book(
            @JsonProperty("isbn")
            String isbn,
            @JsonProperty("title")
            String title,
            @JsonProperty("description")
            String description,
            @JsonProperty("author")
            String author) {
        this.isbn = isbn;
        this.title = title;
        this.description = description;
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }



    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // نفس المرجع
        if (obj == null || getClass() != obj.getClass()) return false;
        Book other = (Book) obj;
        return isbn.equals(other.isbn);
    }
}
