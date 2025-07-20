package com.example.librarymanagement.Repository;
import com.example.librarymanagement.Entity.*;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
