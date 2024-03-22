package ru.itis.spring_lab.repository;

import org.springframework.beans.factory.annotation.Autowired;
import ru.itis.spring_lab.model.Client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

public class ClientRepository {

    @Autowired
    private EntityManagerFactory emf;

    private EntityManager entityManager;

    public Client save(Client trip) {
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