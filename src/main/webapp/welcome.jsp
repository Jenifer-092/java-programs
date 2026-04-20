<%
String name = request.getParameter("uname");
int time = Integer.parseInt(request.getParameter("time"));

session.setAttribute("user", name);
session.setMaxInactiveInterval(time);
%>

<h2>Hello <%= name %></h2>
<p>Session set for <%= time %> seconds.</p>

<a href="check.jsp">Check Session</a>