<%@ page language="java" %>
<%@ page import="javax.servlet.http.Cookie" %>

<html>
<body>

<h2>Active Cookie List</h2>

<%
    Cookie[] cookies = request.getCookies();

    if (cookies != null && cookies.length > 0) {
        for (Cookie c : cookies) {
%>
            <p>
                <b>Name:</b> <%= c.getName() %><br>
                <b>Value:</b> <%= c.getValue() %><br>
                <b>Max Age:</b> <%= c.getMaxAge() %>
            </p>
            <hr>
<%
        }
    } else {
%>
        <p>No cookies found!</p>
<%
    }
%>

<br>
<a href="index.jsp">Add Another Cookie</a>

</body>
</html>