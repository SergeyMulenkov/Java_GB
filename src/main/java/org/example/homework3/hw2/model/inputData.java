package org.example.homework3.hw2.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class inputData {
    private String Name;
    private Integer price;
    private Integer grade;
    private Integer weight;
    private String manufacturerCountry;
}
