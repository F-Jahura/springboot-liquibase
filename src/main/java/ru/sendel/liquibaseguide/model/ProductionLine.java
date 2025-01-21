package ru.sendel.liquibaseguide.model;

import lombok.Data;

import javax.persistence.Embeddable;

@Data
@Embeddable
public class ProductionLine {
    private String name;
    private Integer equipmentsCount;
    private Integer square;
}
