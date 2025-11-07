package com.moteadev.Library_Management_API.books.rest;

import com.moteadev.Library_Management_API.books.dto.BookBodyRequest;
import com.moteadev.Library_Management_API.books.models.Book;
import com.moteadev.Library_Management_API.books.services.BooksServices;
import com.moteadev.Library_Management_API.util.response.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BooksRestController {

    private BooksServices booksServices;

    @Autowired
    public BooksRestController(BooksServices theBookService){
        booksServices=theBookService;
    }

    @PostMapping("/addbook")
    public ResponseUtil<Boolean> addBook(@RequestBody BookBodyRequest bookBodyRequest){
        boolean isAdded=booksServices.addBook(bookBodyRequest);
        return new ResponseUtil<Boolean>(isAdded,
                isAdded?"Book Added":"Fail in Adding book",
                isAdded
                );
    }

    @PutMapping("/editbook")
    public ResponseUtil<Boolean> editBook(@RequestBody Book book){

        boolean isBookEdited= booksServices.editBook(book);
        return new ResponseUtil<Boolean>(isBookEdited,
                isBookEdited?"Edit Book Done":"Failed in Editing Book",
                isBookEdited
                );
    }

    @DeleteMapping("/deletebook")
    public ResponseUtil<Boolean> deleteBook(@RequestBody  Book book){
        try {
            if(book==null){
                return new ResponseUtil<Boolean>(false,
                        "Failed in Deleting Book",
                        false
                );
            }
            boolean isBookDeleted= booksServices.deleteBook(book);
            return new ResponseUtil<Boolean>(isBookDeleted,
                    isBookDeleted?"Delete Book Done":"Failed in Deleting Book",
                    isBookDeleted
            );
        }catch (Exception e){

                return new ResponseUtil<Boolean>(false,
                        "Failed in Deleting Book",
                        false
                );

        }


    }

    @GetMapping("/allbooks")
    public List<Book> getAllBooks(){
        return booksServices.getAllBooks();
    }
}
