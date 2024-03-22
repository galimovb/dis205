package ru.itis.spring_lab.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.ManyToMany;
@Getter
@Setter

public class Client extends Person {
    @ManyToMany
    private Car car;
}