package com.project.ourbookstore.service;

import com.project.ourbookstore.entity.Bookstore;
import com.project.ourbookstore.repository.BookstoreJpaRepository;
import com.project.ourbookstore.repository.BookstoreRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import static org.mockito.ArgumentMatchers.any;

class CreateBookStoreServiceTest {

    private final CreateBookstore createBookStoreService = new CreateBookStoreService(
            new BookstoreRepository.Fake());


    @Test
    void createBookstoreSucess() {
        Assertions.assertThatCode(() -> {
            createBookStoreService.createBookstore(
                    CreateBookstore.DtoForCreateBookstore.builder().build()
            );
        }).doesNotThrowAnyException();
    }

}