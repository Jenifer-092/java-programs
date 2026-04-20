<%@ page language="java" %>
<html>
<body>

<%
    String name = request.getParameter("username");

    // Create session
    session.setAttribute("user", name);

    // Set session expiry to 1 minute (60 sec)
    session.setMaxInactiveInterval(60);
%>

<h2>Hello <%= name %>!</h2>
<p>Session will expire in 1 minute.</p>

<a href="check.jsp">Check Session</a>

</body>
</html>