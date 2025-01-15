package ru.sendel.liquibaseguide.model;

import jdk.jfr.DataAmount;
import lombok.Data;

import javax.persistence.*;


@Data
@Entity
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(nullable = false)
    String name;

    @Column(nullable = false)
    Integer age;
}
