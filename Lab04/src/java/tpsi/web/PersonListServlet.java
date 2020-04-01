
package tpsi.web;



import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.ArrayList;

@WebServlet(name = "PersonListServlet", urlPatterns = {"/personList"})
public class PersonListServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException { 
            
            List<String> listaOsob2 = new ArrayList<>();
            List<Person> listaOsob = new ArrayList<>();
            Person p2 = new Person();
            Person p3 = new Person();
            Person p4 = new Person();
            p2.firstName = "Robert";
            p2.lastName = "Kowalski";
            p2.email = "RobertKowalski@gmail.com";
            p3.firstName = "Jan";
            p3.lastName = "Nowak";
            p3.email = "JanNowak@gmail.com";
            p4.firstName = "Ignacy";
            p4.lastName = "Iksinski";
            p4.email = "IgnacyIksinski@gmail.com";
            listaOsob.add(p2);
            listaOsob.add(p3);
            listaOsob.add(p4);
            listaOsob2.add("test");
   
            request.setAttribute("tabelaOsob", listaOsob);
            
            
            request.getRequestDispatcher("personList.jsp").forward(request, response);
            

    }
}