package com.moteadev.Library_Management_API.books.dto;

public class BookBodyRequest {
    private String title;
    private String description;
    private String author;

    public BookBodyRequest(String author, String description, String title) {
        this.author = author;
        this.description = description;
        this.title = title;
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
}
