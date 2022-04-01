package com.Registration.servlets;


import java.io.IOException;
import java.util.List;
import com.Registration.service.EmployeeServiceInt;
import javax.servlet.http.HttpServlet;

import com.Registration.model.Employee;
import com.Registration.model.module.PersistenceModule;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;


public class GetAllEmp extends HttpServlet{

	 private static final long serialVersionUID = 784784152275054027L;
	  @Inject
	  private static EmployeeServiceInt es;
		
		public GetAllEmp() {
			Injector injector=Guice.createInjector(new PersistenceModule());
			es =injector.getInstance(EmployeeServiceInt.class);
		}
		
		protected void processRequest(HttpServletRequest request,HttpServletResponse response)
				throws ServletException, IOException {
			List<Employee> list=es.getAllEmployees();
			request.setAttribute("emps", list);
			RequestDispatcher rd = getServletConfig().getServletContext().getRequestDispatcher("/index.jsp");
			rd.forward(request, response);
		}
		@Override
	    protected void doGet(HttpServletRequest request,HttpServletResponse response)
	        throws ServletException, IOException
	    {
	        processRequest(request, response);
	    }
	    @Override
	    protected void doPost(HttpServletRequest request, HttpServletResponse response)
	        throws ServletException, IOException
	    {
	        processRequest(request, response);
	    }
		
}
