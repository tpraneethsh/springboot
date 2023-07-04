package com.sreeramtraders.cruddemo.dao;

import com.sreeramtraders.cruddemo.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentDAOImpl implements StudentDAO{

    //define field for entity manager
    private EntityManager entityManager;

    //inject entity manager using constructor injection
    @Autowired
    public StudentDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    //implement save method
    @Override
    @Transactional
    public void save(Student student){
        entityManager.persist(student);
    }

    @Override
    public Student findById(int id) {


        return entityManager.find(Student.class, id);
    }

    @Override
    public List<Student> findAll() {
        //Create query
        TypedQuery<Student> theQuery = entityManager.createQuery("FROM Student order by firstName asc",Student.class);

        return theQuery.getResultList();
    }
}
