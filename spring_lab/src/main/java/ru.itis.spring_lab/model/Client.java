package ru.itis.spring_lab.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.List;

@Getter
@Setter
@Entity
public class Client extends Person {
    @ManyToMany
    private List<Car> car;
}