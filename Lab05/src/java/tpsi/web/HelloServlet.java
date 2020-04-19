package tpsi.web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.ArrayList;




@WebServlet(name = "HelloServlet", urlPatterns = {"/hello"})
public class HelloServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        List<Student> listOfStudentsLocal = new ArrayList<>();
        Student s1 = new Student();
        
        //Licznik odwiedzin
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
        //-----------------------------------------------
        

 
        listOfStudentsLocal.add(s1);
        
        
        if(session.getAttribute("listOfStudentsSession") != null)
        {
            listOfStudentsLocal =  (List<Student>) session.getAttribute("listOfStudentsSession");
            s1.firstName = request.getParameter("firstName");
            s1.lastName = request.getParameter("lastName");
            s1.email = request.getParameter("email");
        }
        else
        {
        session.setAttribute("listOfStudentsSession", new ArrayList<Student>());
        }
        

        
        listOfStudentsLocal.add(s1);
        session.setAttribute("listOfStudentsSession", listOfStudentsLocal);
        
        
        request.setAttribute("sesja", session.getAttribute("counter"));
        
        if (session.getAttribute("listOfStudentsSession") != null)
        {
        request.setAttribute("studenci", session.getAttribute("listOfStudentsSession"));
        }
        
        request.getRequestDispatcher("hello.jsp").forward(request, response);
        
        
        
//        response.setContentType("text/html;charset=UTF-8");
//
//        try (PrintWriter out = response.getWriter()) {
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Java Web - laboratorium 4</title>");
//            out.println("</head>");
//            out.println("<body>");
//            //out.println("<h1>username: " + imie +"</h1>");
//            out.println("Liczba wizyt: " + (Integer)session.getAttribute("counter"));
//            out.println("</body>");
//            out.println("</html>");
//        }

    }


}