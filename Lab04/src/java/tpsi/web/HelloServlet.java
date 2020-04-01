package tpsi.web;


import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "HelloServlet", urlPatterns = {"/hello"})
public class HelloServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            
            Person p1 = new Person();
            p1.firstName = request.getParameter("firstName");
            p1.lastName = request.getParameter("lastName");
            p1.email = request.getParameter("email");
            
            
            String imie = request.getParameter("name");
            request.setAttribute("imie", p1.firstName);
            request.setAttribute("nazwisko", p1.lastName);
            request.setAttribute("mail", p1.email);
            request.getRequestDispatcher("hello.jsp").forward(request, response);

    }
}