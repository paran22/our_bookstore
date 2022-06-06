package com.project.ourbookstore.repository;

import com.project.ourbookstore.entity.Bookstore;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookstoreJpaRepository extends JpaRepository<Bookstore, Long> {
}
