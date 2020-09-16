package com.edgames.BookstoreManager.Controllers;

import com.edgames.BookstoreManager.Services.BookService;
import com.edgames.BookstoreManager.dto.BookDTO;
import com.edgames.BookstoreManager.dto.MessageResponseDTO;
import com.edgames.BookstoreManager.entity.Book;
import com.edgames.BookstoreManager.repository.BookstoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("api/v1/books")
public class BooksController {
    private BookService bookService;

    @Autowired
    public BooksController(BookService bookService) {
        this.bookService = bookService;
    }
    @PostMapping
    public  MessageResponseDTO create(@RequestBody @Valid BookDTO bookDTO){
        return  bookService.create(bookDTO);
    }

}
