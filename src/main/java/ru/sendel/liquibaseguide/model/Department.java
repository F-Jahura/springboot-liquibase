package ru.sendel.liquibaseguide.model;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Data
@Entity
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column()
    private String title;

    @Column()
    private int buildingNum;

    @Column()
    private int staffsNum;

    @ElementCollection
    @CollectionTable(name = "department-production-line", joinColumns = @JoinColumn(name = "department_id"))
    private Set<ProductionLine> lines;

}
