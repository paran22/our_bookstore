package com.project.ourbookstore.controller;

import com.project.ourbookstore.service.CreateBookstore;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/bookstore")
public class BookstoreRestController {
    private final CreateBookstore createBookstore;

    @PostMapping
    public void createBookstore(
            @RequestBody CreateBookstore.DtoForCreateBookstore dtoForCreateBookstore) {
        createBookstore.createBookstore(dtoForCreateBookstore);
    }
}
