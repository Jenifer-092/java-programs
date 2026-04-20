package com.cookie;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/CookieServlet")
public class CookieServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");

        String name = request.getParameter("username");

        int count = 0;

        Cookie cookies[] = request.getCookies();

        // Check existing cookies
        if (cookies != null) {
            for (Cookie c : cookies) {

                if (c.getName().equals("username")) {
                    name = c.getValue();
                }

                if (c.getName().equals("visitCount")) {
                    count = Integer.parseInt(c.getValue());
                }
            }
        }

        count++; // increment visit

        // Create cookies
        Cookie nameCookie = new Cookie("username", name);
        Cookie countCookie = new Cookie("visitCount", String.valueOf(count));

        // Expiry (demo: 30 seconds)
        nameCookie.setMaxAge(30);
        countCookie.setMaxAge(30);

        response.addCookie(nameCookie);
        response.addCookie(countCookie);

        // Output
        response.getWriter().println("<h2>Welcome back " + name + "!</h2>");
        response.getWriter().println("<h3>You have visited this page " + count + " times</h3>");

        // Display all cookies
        response.getWriter().println("<h3>All Cookies:</h3>");

        if (cookies != null) {
            for (Cookie c : cookies) {
                response.getWriter().println(
                    "Name: " + c.getName() + " Value: " + c.getValue() + "<br>"
                );
            }
        }

        response.getWriter().println("<br><a href='index.html'>Go Back</a>");
    }
}