package com.userdata;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/UserDataServlet")
public class UserDataServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("username");
        String email = request.getParameter("email");
        String desig = request.getParameter("designation");

        // Server-side validation
        if (name == null || name.isEmpty() ||
            email == null || email.isEmpty() ||
            desig == null || desig.isEmpty()) {

            response.getWriter().println("Validation Failed!");
        } else {
            request.setAttribute("name", name);
            request.setAttribute("email", email);
            request.setAttribute("desig", desig);

            RequestDispatcher rd = request.getRequestDispatcher("result.jsp");
            rd.forward(request, response);
        }
    }
}