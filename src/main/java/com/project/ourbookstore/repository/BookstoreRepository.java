package com.project.ourbookstore.repository;

import com.project.ourbookstore.entity.Bookstore;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookstoreRepository extends JpaRepository<Bookstore, Long> {
}
