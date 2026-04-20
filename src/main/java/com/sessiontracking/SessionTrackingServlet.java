package com.sessiontracking;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/SessionTracker")
public class SessionTrackingServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        HttpSession session = request.getSession(true);

        // Set session expiry to 1 minute
        session.setMaxInactiveInterval(60);

        Date createTime = new Date(session.getCreationTime());
        Date lastAccessTime = new Date(session.getLastAccessedTime());

        String sessionId = session.getId();

        Integer visitCount = (Integer) session.getAttribute("visitCount");

        if (visitCount == null) {
            visitCount = 1;
        } else {
            visitCount++;
        }

        session.setAttribute("visitCount", visitCount);

        out.println("<html><body>");
        out.println("<h2>Session Tracking Information</h2>");
        out.println("Session ID: " + sessionId + "<br>");
        out.println("Creation Time: " + createTime + "<br>");
        out.println("Last Access Time: " + lastAccessTime + "<br>");
        out.println("Visit Count: " + visitCount + "<br>");
        out.println("</body></html>");
    }
}