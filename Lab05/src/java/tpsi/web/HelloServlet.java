package tpsi.web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;




@WebServlet(name = "HelloServlet", urlPatterns = {"/hello"})
public class HelloServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        int counter;
        HttpSession session = request.getSession();
        if(session.getAttribute("counter") != null)
        {
            counter = (int) session.getAttribute("counter");
        }
        else
        {
            counter = 0;
        }
        counter++;
        session.setAttribute("counter", counter);
        
        
        
        response.setContentType("text/html;charset=UTF-8");

        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Java Web - laboratorium 4</title>");
            out.println("</head>");
            out.println("<body>");
            //out.println("<h1>username: " + imie +"</h1>");
            out.println("Liczba wizyt: " + (Integer)session.getAttribute("counter"));
            out.println("</body>");
            out.println("</html>");
        }
    }


}