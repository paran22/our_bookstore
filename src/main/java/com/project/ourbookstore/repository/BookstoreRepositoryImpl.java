package com.project.ourbookstore.repository;

import com.project.ourbookstore.entity.Bookstore;
import com.project.ourbookstore.service.CreateBookstore;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class BookstoreRepositoryImpl implements BookstoreRepository {
    private final BookstoreJpaRepository jpaRepository;

    @Override
    public void saveBookstore(Bookstore bookstore) {
        jpaRepository.save(bookstore);
    }
}
