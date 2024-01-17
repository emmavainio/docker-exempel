package com.example.dockerexempel.repo;

import com.example.dockerexempel.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
