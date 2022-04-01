package com.Registration.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import com.Registration.model.Employee;
import com.Registration.model.module.PersistenceModule;
import com.google.inject.Guice;
import com.google.inject.Injector;




public class EmpService implements EmployeeServiceInt {

	private static EntityManagerFactory emf;
	private static EntityManager em;
	
	
	public EmpService() {
		Injector injector = Guice.createInjector(new PersistenceModule());
		emf = injector.getInstance(EntityManagerFactory.class);
	}
	public List<Employee> getAllEmployees(){
		em=emf.createEntityManager();
		em.getTransaction().begin();
		Query query=em.createQuery("SELECT emp FROM Employee emp");
		List<Employee> l=(List<Employee>)query.getResultList();
		return l;
	}
	
	public Employee addEmployee(Employee emp) {
		em=emf.createEntityManager();
		em.getTransaction().begin();
		if(em.find(Employee.class, emp.getId())==null) {
			em.persist(emp);
		}
		em.merge(emp);
		em.getTransaction().commit();
		em.close();
		return emp;
	}
	public Employee updateEmployee(Employee emp) {
		em=emf.createEntityManager();
		em.getTransaction().begin();
		em.merge(emp);
		em.getTransaction().commit();
		em.close();
		return emp;
	}
}
