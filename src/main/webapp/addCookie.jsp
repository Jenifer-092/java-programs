<%@ page language="java" %>
<%@ page import="javax.servlet.http.Cookie" %>

<html>
<body>

<%
    String name = request.getParameter("name");
    String domain = request.getParameter("domain");
    String ageStr = request.getParameter("age");

    int age = 0;

    // ✅ FIX: Prevent null / empty error
    if (name == null || domain == null || ageStr == null ||
        name.isEmpty() || domain.isEmpty() || ageStr.isEmpty()) {
%>
        <h3 style="color:red;">All fields are required!</h3>
        <a href="index.jsp">Go Back</a>
<%
        return;
    }

    try {
        age = Integer.parseInt(ageStr);
    } catch (Exception e) {
%>
        <h3 style="color:red;">Invalid age value!</h3>
        <a href="index.jsp">Go Back</a>
<%
        return;
    }

    // Create cookie
    Cookie cookie = new Cookie(name, domain);
    cookie.setMaxAge(age);

    response.addCookie(cookie);
%>

<h2>Cookie Added Successfully!</h2>

<p><b>Name:</b> <%= name %></p>
<p><b>Value (Domain):</b> <%= domain %></p>
<p><b>Expiry:</b> <%= age %> seconds</p>

<br>
<a href="showCookies.jsp">Go to Active Cookie List</a>

</body>
</html>