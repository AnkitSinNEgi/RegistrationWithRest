<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ page import="java.util.*" %>
 <%@ page import="com.google.inject.Guice" %>
<%@ page import="com.google.inject.Injector" %>
<%@ page import="com.google.inject.Inject" %>
<%@ page import="com.Registration.model.module.PersistenceModule" %>
<%@ page import="com.Registration.servlets.GetAllEmp"%>
<%@ page import=" com.Registration.service.EmpService"%>
<%@ page import="com.Registration.model.Employee "%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<h1>-----------EMPLOYEE REGISTRATION-------------</h1>
<table border="4", margin: 10px 30px;>
   <tr>
        <td>Employee Id</td>
        <td>Name</td>
        <td>Age</td>
        <td>Salary</td>
        <td>Update Employee</td>
   </tr>
   <%
   try{ 
	   for(Employee emp: (List<Employee>) request.getAttribute("emps")){%>
	   	<tr>      
            <td><%=emp.getId()%></td><td><%=emp.getName()%></td><td><%=emp.getAge()%></td><td><%=emp.getSalary()%></td><td><a href='/RestEmployeeApp/addemployee.jsp'> Edit Employee</a></td>
        </tr>	   
	   <%}
   }
   catch(Exception e){	   
   }
   %>
</table>
</br></br></br>
<a href="/RestEmployeeApp/addemployee.jsp">
        <button class="GetAll">
            Add Employee
        </button>
   </a>
<br>
</body>
</html>