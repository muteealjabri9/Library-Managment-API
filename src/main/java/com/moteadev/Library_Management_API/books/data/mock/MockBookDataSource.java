package com.moteadev.Library_Management_API.books.data.mock;

import com.moteadev.Library_Management_API.books.data.MainBooksRepository;
import com.moteadev.Library_Management_API.books.models.Book;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component
public class MockBookDataSource implements MainBooksRepository {

    List<Book> bookList=new ArrayList<>();

    @PostConstruct
    public void init(){
        this.bookList.add(new Book("Spring Boot Course","Sweet Spring boot Book","Motea Aljaberi"));
        this.bookList.add(new Book("Flutter Course","Sweet Flutter Book","Motea Aljaberi"));
    }

    @Override
    public boolean addBook(Book book) {

        this.bookList.add(book);
        return true;
    }

    @Override
    public boolean editBook(Book book) {

        int index=this.bookList.indexOf(book);
        if(index==-1)return  false;

        this.bookList.set(index,book);
        return true;
    }

    @Override
    public boolean deleteBook(Book book) {

        return this.bookList.remove(book);
    }

    @Override
    public List<Book> getAllBooks() {
        return this.bookList;
    }
}
