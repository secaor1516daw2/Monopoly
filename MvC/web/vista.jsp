<%-- 
    Document   : vista
    Created on : 10-feb-2016, 16:14:09
    Author     : secaor
--%>
<jsp:useBean id="p" class="javaBeans.Persona" scope="session"/>
<jsp:useBean id="numero" class="javaBeans.Dado" scope="session"/>
<%@page import = "edu.fje.daw2.Controller"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%--<jsp:setProperty name="p" property="nom" value="hola"/>--%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title</title>
    </head>
    <body>
        
       
        
        ${p.nom}
        ${numero["numero"]}
        ${p["nom"]}
        
        <form action="creaPersona" method="post">
        <input type="submit" value="Submit">


    </form>
        <br/>
        curs: ${!empty param.curs ? "hola":"adeu"}   
         <br/>    
</html>
