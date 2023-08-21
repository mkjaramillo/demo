package com.example.demo;






import jakarta.enterprise.context.ApplicationScoped;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;

import java.util.List;

@ApplicationScoped
public class SingerRepository {
    @PersistenceContext(unitName ="demoPU")
    private EntityManager entityManager;

    public Singer save(Singer entity) {
        System.out.println(entityManager.toString());

        entityManager.persist(entity);

        return entity;
    }

    public List<Singer> findAll() {
        TypedQuery<Singer> query = entityManager.createQuery("SELECT s FROM Singer s", Singer.class);
        return query.getResultList();
    }







}
