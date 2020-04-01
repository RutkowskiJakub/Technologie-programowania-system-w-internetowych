<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Java Web - laboratorium 4</title>
    </head>
    <body>
        <h1> Cześć, <c:out value="${imie}"/>!</h1>
        <h1>Witaj ${imie} ${nazwisko} <a href="mailto:${mail}">Mail</a></h1>
        
<!--        Uzycie tagu c:out zabezpiecza nas przed atakami, poniewaz wypisze kod wpisany przez adwersarza jako tekst na stronie, 
        a w przypadku uzycia wyrazenia ${imie} kod wpisany przez uzytkownika wykona sie-->
       
    </body>
</html>