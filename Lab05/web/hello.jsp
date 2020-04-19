<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Java Web - laboratorium 5</title>
    </head>
    <body>
        <h1>Witamy w JSP!</h1>
        Licznik odwiedzin: ${sesja}
        <br><br>
        
        
        <table border =\"1\" align = \"center\"> 
        <tr> <th> Imie</th> <th> Nazwisko </th> <th> email </th> </tr>
        
        </table>
        <br><br>
        
<!--        Przenosze sie do HelloServlet.java-->
                <form action='/Lab05/hello' method='get'>
                    
            Imie:
            <input type='text' name='firstName'>
            Nazwisko:
            <input type='text' name='lastName'>
            Email:
            <input type='text' name='email'>
            <input type='submit'>
  
        </form>
<br>
<br>
        TUTAJ TESTUJE:  ${studenci}
        <br>
        
        
        <br>
        TUTAJ STARE TESTY:
        
         <c:forEach items="${studenci}" var="student">
             ${student.getName()}
             <c:forEach items="student" var="osoba">
            <p>
                ${osoba.getName()} ${osoba.getLastName()} ${osoba.getEmail()}
            </p>
             </c:forEach>
        </c:forEach>
            
    </body>
</html>
