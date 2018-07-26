<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>update</title>
</head>
<body>
<div align="center">
		<h2>Update Product Details Here</h2>
		<table>
		
			<form:form action="../editsave" method="POST">
			
				<tr>  
        		<td></td>    
         		<td><form:hidden path="productID" /></td>  
         		</tr> 
				<tr>
					<td>Product Name:</td>
					<td><form:input path="productName" size="30" /></td>
					<td><form:errors path="productName" cssClass="error" /></td>
				</tr>
				<tr>
					<td>Product Details:</td>
					<td><form:input path="productDetails" size="30" /></td>
					<td><form:errors path="productDetails" cssClass="error" /></td>
				</tr>
				<tr>
					<td>Product price:</td>
					<td><form:input path="price" size="30" /></td>
					<td><form:errors path="price" cssClass="error" /></td>
				</tr>
				
				
				<tr>
					<td><input type="submit" value="Update" /></td>
				</tr>
			</form:form>
		</table>
	</div>

</body>
</html>