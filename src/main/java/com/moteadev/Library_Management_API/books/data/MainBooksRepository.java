package com.moteadev.Library_Management_API.books.data;

import com.moteadev.Library_Management_API.books.models.Book;

import java.util.List;

public interface MainBooksRepository {

    public boolean addBook(Book book);
    public boolean editBook(Book book);
    public boolean deleteBook(Book book);
    public List<Book> getAllBooks();


}
