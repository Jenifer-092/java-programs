<%@ page language="java" %>
<html>
<body>

<%
    String user = (String) session.getAttribute("user");

    if (user == null) {
%>
        <h2 style="color:red;">Session Expired!</h2>
        <a href="index.jsp">Login Again</a>
<%
    } else {
%>
        <h2>Welcome back <%= user %>!</h2>
<%
    }
%>

</body>
</html>