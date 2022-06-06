package com.project.ourbookstore.service;

import lombok.Builder;
import lombok.Getter;

@FunctionalInterface
public interface CreateBookstore {
    void createBookstore(DtoForCreateBookstore dtoForCreateBookstore);

    @Getter
    class DtoForCreateBookstore {
        private String name;
        private String address;
        private String phoneNumber;
        private String homepageUrl;
        private String snsUrl;
        private String description;

        @Builder
        public DtoForCreateBookstore(String name, String address, String phoneNumber,
                                     String homepageUrl, String snsUrl, String description) {
            this.name = name;
            this.address = address;
            this.phoneNumber = phoneNumber;
            this.homepageUrl = homepageUrl;
            this.snsUrl = snsUrl;
            this.description = description;
        }
    }
}
