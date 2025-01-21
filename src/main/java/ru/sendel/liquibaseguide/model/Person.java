package ru.sendel.liquibaseguide.model;


import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private int age;

    @Column()
    private String surname;

    @Column()
    private String patronymic;

    @Column()
    private LocalDate creationDate;

    @Column()
    private String password;

    @Column()
    private String address;

    @Column()
    private String mobile;

    @OneToOne
    private Passport passport;

    @ManyToOne
    private Department department;



}
