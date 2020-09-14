package com.edgames.BookstoreManager.repository;
import com.edgames.BookstoreManager.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookstoreRepository extends JpaRepository<Book, Long>  {

}
