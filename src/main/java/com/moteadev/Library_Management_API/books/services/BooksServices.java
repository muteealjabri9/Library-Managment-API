package com.moteadev.Library_Management_API.books.services;

import com.moteadev.Library_Management_API.books.data.MainBooksRepository;
import com.moteadev.Library_Management_API.books.dto.BookBodyRequest;
import com.moteadev.Library_Management_API.books.models.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BooksServices {

    private MainBooksRepository booksRepository;

    @Autowired
    public BooksServices(MainBooksRepository mainBooksRepository){
        booksRepository=mainBooksRepository;
    }

    public boolean addBook(BookBodyRequest bookBodyRequest){
        Book book=new Book(bookBodyRequest.getTitle(),bookBodyRequest.getDescription(),bookBodyRequest.getAuthor());
        return booksRepository.addBook(book);
    }

    public boolean editBook(Book book){
        return booksRepository.editBook(book);
    }

    public boolean deleteBook(Book book){
        return booksRepository.deleteBook(book);
    }
    public List<Book> getAllBooks(){
        return booksRepository.getAllBooks();
    }

}
