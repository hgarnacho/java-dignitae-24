<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Registro</title>
  </head>
  <body>
    <h1>Datos de Registro</h1>
    <ul>
        <li>Nombre: <s:property value="nombre" /></li>
        <li>Email: <s:property value="email" /></li>
        <li>Edad: <s:property value="edad" /></li>
    </ul>
  </body>
</html>