package com.project.ourbookstore.entity;

import lombok.Getter;

import javax.persistence.*;

@Getter
@Entity
public class BookstoreTag {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long bookstoreTagId;

    @ManyToOne
    private Bookstore bookstore;

    @ManyToOne
    private Tag tag;
}
