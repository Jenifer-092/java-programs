<%
String name = (String) session.getAttribute("user");

if (name == null) {
%>
    <h2>Session expired!</h2>
<%
} else {
%>
    <h2>Hello <%= name %></h2>
<%
}
%>