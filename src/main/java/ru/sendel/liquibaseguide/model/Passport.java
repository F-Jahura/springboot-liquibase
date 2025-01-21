package ru.sendel.liquibaseguide.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
public class Passport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column()
    private String series;

    @Column()
    private String number;

    @Column()
    private LocalDate dateOfIssue;
}
