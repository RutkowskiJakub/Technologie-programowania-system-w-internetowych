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
        
        HttpSession session = request.getSession();
        //session.setAttribute("userName", "Jakub");
       // String imie = (String) session.getAttribute("userName");
        Integer visitCount = new Integer(0);
        String visitCountKey = new String("visitCount");
        String userIDKey = new String("userID");
        String userID = new String("ABCD");
        
        if (session.isNew())
        {
            session.setAttribute(userIDKey, userID);
        }
        else
        {
        visitCount = (Integer)session.getAttribute("visitCountKey");
        visitCount += 1;
        userID = (String)session.getAttribute(userIDKey);
        }
        session.setAttribute(visitCountKey, visitCount);
        
        response.setContentType("text/html;charset=UTF-8");


        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Java Web - laboratorium 4</title>");
            out.println("</head>");
            out.println("<body>");
            //out.println("<h1>username: " + imie +"</h1>");
            out.println("Liczba wizyt: " + visitCount);
            out.println("</body>");
            out.println("</html>");
        }
    }


}