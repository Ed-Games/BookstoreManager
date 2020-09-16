package com.edgames.BookstoreManager.Services;

import com.edgames.BookstoreManager.dto.BookDTO;
import com.edgames.BookstoreManager.dto.MessageResponseDTO;
import com.edgames.BookstoreManager.entity.Book;
import com.edgames.BookstoreManager.repository.BookstoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class BookService {
    private BookstoreRepository bookstoreRepository;

    @Autowired
    public BookService(BookstoreRepository bookstoreRepository) {
        this.bookstoreRepository = bookstoreRepository;
    }

    public MessageResponseDTO create(BookDTO bookDTO){
        Book bookToSave = Book.builder()
                .name(bookDTO.getName())
                .pages(bookDTO.getPages())
                .chapters(bookDTO.getChapters())
                .author(bookDTO.getAuthor())
                .build();
        Book savedBook =  bookstoreRepository.save(bookToSave);
        return MessageResponseDTO.builder().message("Book created with Id " +savedBook.getId()).build();
    }
}
