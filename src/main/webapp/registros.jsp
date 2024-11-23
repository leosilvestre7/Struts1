<%-- 
    Document   : register
    Created on : 20 nov. 2024, 18:30:50
    Author     : leoru
--%>

<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <title>Register</title>
    <s:head />
  </head>
  <body>
    <h3>Register for a prize by completing this form.</h3>

    <s:form action="register">
      <s:textfield name="userBean.firstName" label="First name" />
      <s:textfield name="userBean.lastName" label="Last name" />
      <s:textfield name="userBean.email"  label ="Email"/>  
      <s:textfield name="userBean.age"  label="Age"  />
      <s:submit/>
    </s:form>	
  </body>
</html>