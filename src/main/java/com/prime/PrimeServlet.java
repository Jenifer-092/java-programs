package com.prime;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/prime")
public class PrimeServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        try {
            int num = Integer.parseInt(request.getParameter("number"));

            if (num < 1) {
                throw new Exception("Number must be greater than 0");
            }

            boolean isPrime = true;
            String steps = "Steps:<br>";

            if (num == 1) {
                isPrime = false;
            } else {
                for (int i = 2; i <= Math.sqrt(num); i++) {
                    steps += num + " % " + i + " = " + (num % i) + "<br>";
                    if (num % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            out.println("<html><body>");
            out.println("<h2>Prime Number Result</h2>");
            out.println("<p>Number: " + num + "</p>");

            if (isPrime) {
                out.println("<p style='color:green;'>" + num + " is Prime</p>");
            } else {
                out.println("<p style='color:red;'>" + num + " is Not Prime</p>");
            }

            out.println("<p>" + steps + "</p>");
            out.println("<a href='index.html'>Try Again</a>");
            out.println("</body></html>");

        } catch (Exception e) {
            out.println("<html><body style='color:red;'>");
            out.println("<h2>Error</h2>");
            out.println("<p>" + e.getMessage() + "</p>");
            out.println("<a href='index.html'>Retry</a>");
            out.println("</body></html>");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        response.sendRedirect("index.html");
    }
}