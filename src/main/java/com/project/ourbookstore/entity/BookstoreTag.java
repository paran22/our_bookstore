package com.project.ourbookstore.entity;

import lombok.Getter;

import javax.persistence.*;

@Getter
@Entity
public class BookstoreTag extends Timestamped {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long bookstoreTagId;

    @ManyToOne
    @JoinColumn(name = "bookstore_id")
    private Bookstore bookstore;

    @ManyToOne
    @JoinColumn(name = "tag_id")
    private Tag tag;
}
