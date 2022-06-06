package com.project.ourbookstore.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Getter
@Entity
@NoArgsConstructor
public class Bookstore extends Timestamped {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "bookstore_id")
    private Long bookstoreId;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String address;
    @Column(nullable = true)
    private String phoneNumber;
    @Column(nullable = true)
    private String homepageUrl;
    @Column(nullable = true)
    private String snsUrl;

    @Column(nullable = true)
    private String description;

    @Builder
    public Bookstore(String name, String address, String phoneNumber,
                     String homepageUrl, String snsUrl, String description) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.homepageUrl = homepageUrl;
        this.snsUrl = snsUrl;
        this.description = description;
    }
}
