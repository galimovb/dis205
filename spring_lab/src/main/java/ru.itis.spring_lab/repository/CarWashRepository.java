package ru.itis.spring_lab.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.itis.spring_lab.model.Car;
import ru.itis.spring_lab.model.CarWash;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

@Repository
public class CarWashRepository {
    @Autowired
    private EntityManagerFactory emf;

    private EntityManager entityManager;

    public CarWash save(CarWash trip) {
        entityManager = emf.createEntityManager();
        entityManager.getTransaction().begin();
        if (trip.getId() != null) {
            entityManager.merge(trip);
        } else {
            entityManager.persist(trip);
        }
        entityManager.getTransaction().commit();
        entityManager.close();


        return trip;
    }
}
