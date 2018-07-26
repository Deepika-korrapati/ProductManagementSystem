<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Product List</title>
</head>
<body>
<h1>Product List</h1>  
<table border="2" width="70%" cellpadding="2">  
<tr><th>Id</th><th>Product Name</th><th>Product Details</th><th>Product</th></tr>  
   <c:forEach var="product" items="${list}">   
   <tr>  
   <td>${product.productID}</td>  
   <td>${product.productName}</td>  
   <td>${product.productDetails}</td>  
   <td>${product.price}</td>  
   
   
   <td><a href="update/${product.productID}">Update</a></td>
   </tr>  
   </c:forEach>  
   </table>  
   <br/>  
   <a href="registration"><input type="submit" value="Add New Product" /></a>
   <a href=""><input type="submit" value="Home" /></a>
</body>
</html>