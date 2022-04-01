<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="rest/employee/addEmployee" method="post">
<h2>Add Employee Details</h2>
<table style="with: 50%">
	<tr>
			<td>Employee Id : </td>
			<td><input type="text" id="eid" name="eid" /></td>
	</tr>
	<tr>
			<td>Employee Name : </td>
			<td><input type="text" id="name" name="name" /></td>
	</tr>
	<tr>
			<td>Employee Age : </td>
			<td><input type="text" id="age" name="age" /></td>
	</tr>
	<tr>
			<td>Employee Salary : </td>
			<td><input type="text" id="salary" name="salary" /></td>
	</tr>
	
</table>

<input type="submit" class="GetAll" value="Submit">

</form>

<a href="/EmployeeRegistration/">
        <button class="GetAll">
            GO Back
        </button>
   </a>
</body>
</html>