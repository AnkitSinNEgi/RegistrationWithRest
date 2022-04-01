package com.Registration.model.module;

import javax.persistence.Persistence;
import javax.persistence.EntityManagerFactory;

import com.Registration.service.EmpService;
import com.Registration.service.EmployeeServiceInt;
import com.google.inject.AbstractModule;

public class PersistenceModule extends AbstractModule {
	@Override
	protected void configure() {
		
		bind(EntityManagerFactory.class).toInstance(Persistence.createEntityManagerFactory("Eclipselink_JPA"));
		bind(EmployeeServiceInt.class).to(EmpService.class);
	}

}
