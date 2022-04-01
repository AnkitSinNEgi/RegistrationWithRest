package com.Registration.Rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.Registration.model.module.PersistenceModule;
import com.Registration.service.EmpService;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.Registration.model.Employee;



@Path("/Employee")
public class EmpResource {

	Injector injector = Guice.createInjector(new PersistenceModule());
	EmpService employeeService = injector.getInstance(EmpService.class);
	
	@GET
	@Path("/getall")
	@Produces(MediaType.APPLICATION_XML)
	public List<Employee> getAllEmp() {
		return employeeService.getAllEmployees();
	}
	
	@POST
	@Path("/addEmployee")
	@Consumes(MediaType.APPLICATION_XML)
	@Produces(MediaType.APPLICATION_XML)
	public Employee addEmp(Employee emp) {
		return employeeService.addEmployee(emp);
	}
	
	@PUT
	@Path("/updateEmployee")
	@Consumes(MediaType.APPLICATION_XML)
	@Produces(MediaType.APPLICATION_XML)
	public Employee updateEmp(Employee emp) {
		return employeeService.updateEmployee(emp);
	}
}
