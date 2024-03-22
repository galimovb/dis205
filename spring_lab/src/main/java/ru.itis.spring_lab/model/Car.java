package ru.itis.spring_lab.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
@Getter
@Setter
@Entity
public class Car {
    @Id
    @SequenceGenerator(name = "car_gen", sequenceName = "car_seq")
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "car_gen")
    private Long id;
    private String carNumber;
}