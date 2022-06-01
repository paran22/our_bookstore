package com.project.ourbookstore.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;


@Getter
@Entity
@NoArgsConstructor
public class Bookstore {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long bookstoreId;
    private String name;
    private String address;
    private String phoneNumber;
    private String homepageUrl;
    private String snsUrl;

    @Builder
    public Bookstore(String name, String address, String phoneNumber,
                     String homepageUrl, String snsUrl) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.homepageUrl = homepageUrl;
        this.snsUrl = snsUrl;
    }
}
