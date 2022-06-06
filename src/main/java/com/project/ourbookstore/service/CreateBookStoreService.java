package com.project.ourbookstore.service;

import com.project.ourbookstore.entity.Bookstore;
import com.project.ourbookstore.repository.BookstoreJpaRepository;
import com.project.ourbookstore.repository.BookstoreRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CreateBookStoreService implements CreateBookstore {

    private final BookstoreRepository bookstoreRepository;

    @Override
    public void createBookstore(DtoForCreateBookstore dtoForCreateBookstore) {
        Bookstore newBookstore = Bookstore.builder()
                .name(dtoForCreateBookstore.getName())
                .address(dtoForCreateBookstore.getAddress())
                .phoneNumber(dtoForCreateBookstore.getPhoneNumber())
                .homepageUrl(dtoForCreateBookstore.getHomepageUrl())
                .snsUrl(dtoForCreateBookstore.getSnsUrl())
                .description(dtoForCreateBookstore.getDescription())
                .build();
        bookstoreRepository.saveBookstore(newBookstore);
    }
}
