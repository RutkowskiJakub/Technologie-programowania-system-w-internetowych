<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Java Web - lab04 - wyswietlanie tabeli osob</title>
    </head>
    <body>
        <h1>Person List</h1>
                <c:forEach items="${tabelaOsob}" var="osoba">
                    <p>
                    ${osoba.getFirstName()}  ${osoba.getLastName()}  &nbsp; &nbsp; &nbsp; ${osoba.getEmail()}
                    </p>
    
                </c:forEach>
    </body>
</html>
