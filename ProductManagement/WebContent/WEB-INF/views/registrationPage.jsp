<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration</title>
<style>
.error {
	color: red;
	font-weight: bold;
}
</style>
</head>
<body>
	<div align="center">
		<h2>Enroll Product Details Here</h2>
		<table>

			<form:form action="registerProduct" method="post" modelAttribute="product">

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
					<td>Product Price:</td>
					<td><form:input path="price" size="30" /></td>
					<td><form:errors path="price" cssClass="error" /></td>
				</tr>
				

				<tr>
					<td><input type="submit" value="Submit" /></td>
				</tr>
			</form:form>
		</table>
	</div>

</body>
</html>