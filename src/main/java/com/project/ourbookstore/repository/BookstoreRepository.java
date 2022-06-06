package com.project.ourbookstore.repository;

import com.project.ourbookstore.entity.Bookstore;
import com.project.ourbookstore.service.CreateBookstore;

public interface BookstoreRepository {
    void saveBookstore(Bookstore bookstore);

    class Fake implements BookstoreRepository {
        @Override
        public void saveBookstore(Bookstore bookstore) {

        }
    }
}
