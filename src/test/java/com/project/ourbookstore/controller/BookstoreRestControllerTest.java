package com.project.ourbookstore.controller;

import com.project.ourbookstore.entity.Bookstore;
import com.project.ourbookstore.service.CreateBookStoreService;
import com.project.ourbookstore.service.CreateBookstore;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(SpringExtension.class)
class BookstoreRestControllerTest extends MockControllerSetUp {

    @Mock
    CreateBookStoreService createBookStoreService;

    @InjectMocks
    BookstoreRestController bookstoreRestController;

    private final String BASE_URL = "/api/bookstore";

    @Test
    void createBookstoreSuccess() throws Exception {
        CreateBookstore.DtoForCreateBookstore dtoForCreateBookstore = CreateBookstore.DtoForCreateBookstore.builder()
                .name("testBookstore")
                .build();

        doNothing().when(createBookStoreService).createBookstore(dtoForCreateBookstore);

        String content = objectMapper.writeValueAsString(dtoForCreateBookstore);

        mockMvcSet(bookstoreRestController)
                .perform(post(BASE_URL)
                        .content(content)
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andReturn();
    }
}