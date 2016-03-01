<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
 <head>
  <title>Spring MVC Form Handling</title>
 </head>
 &body>
<h2>
Employee Data Form</h2>
<form:form action="/employee/add" method="POST">
<table>
  <tbody>
    <tr>
      <td><form:label path="firstname">First Name :</form:label></td>
      <td><form:input path="firstname"></form:input></td>
    </tr>
    <tr>
      <td><form:label path="lastname">Last Name:</form:label></td>
      <td><form:input path="lastname"></form:input></td>
    </tr>
    <tr>
      <td><form:label path="age">Age:</form:label></td>
      <td><form:input path="age"></form:input></td>
    </tr>
    <tr>
      <td><form:label path="designation">Designation:</form:label></td>
      <td>
      	<form:select path="designation">
      		<form:option value="0" label="Select" />
      		<form:options items="${designationList}" itemValue="id" itemLabel="desg" />
      	</form:select>
      </td>
    </tr>
    <tr>
      <td colspan="2"><input type="submit" value="Submit"/></td>
    </tr>
  </tbody>
</table>
</form:form>
</body>
</html>