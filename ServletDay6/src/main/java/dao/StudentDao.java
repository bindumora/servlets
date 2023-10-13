package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import dto.Student;

public class StudentDao {
EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("sharath");
EntityManager entityManager=entityManagerFactory.createEntityManager();
EntityTransaction entityTransaction=entityManager.getTransaction();


public void saveBoth(Student student)
{
	entityTransaction.begin();
entityManager.persist(student);
	entityTransaction.commit();
}
public Student fetch(int id)

{
	Student student=entityManager.find(Student.class, id);
    return student;
}
}
