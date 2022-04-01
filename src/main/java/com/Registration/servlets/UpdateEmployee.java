package com.Registration.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletContext;
import com.Registration.service.EmpService;
import com.Registration.model.Employee;


public class UpdateEmployee extends HttpServlet {

	  private static final long serialVersionUID = -8162613002432407062L;
	  @Override
	  protected void doGet(HttpServletRequest request, HttpServletResponse resp)throws ServletException, IOException {
		  EmpService es=new EmpService();
		  ServletContext servletcontext = getServletContext();
		  Employee emp=(Employee)servletcontext.getAttribute("emp");
		  servletcontext.setAttribute("emp", emp);
		  System.out.print(emp.toString());
		  resp.sendRedirect(request.getContextPath() + "/addemployee.jsp");
		  
	  }
}
