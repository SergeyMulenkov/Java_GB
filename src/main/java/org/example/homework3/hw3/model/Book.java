package org.example.homework3.hw3.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class Book {
    private String nameBook;
    private String surName;
    private Integer price;
    private Integer yearOfPublishing;
    private Integer numberOfPages;
}
