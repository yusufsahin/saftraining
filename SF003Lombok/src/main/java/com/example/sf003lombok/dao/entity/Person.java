package com.example.sf003lombok.dao.entity;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Person {
    private String name;
    private int age;

}
