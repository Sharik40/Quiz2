<%@ page import="com.example.demo2.QuizServlet" %><%--
  Created by IntelliJ IDEA.
  User: Vlad
  Date: 09.02.2024
  Time: 14:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Account</title>
</head>
<body>
    <% String login = (String)session.getAttribute("user_login");
    %>
    <h1>You are logged in as: <%= login %></h1>
    <form action="index.jsp">
        <%
            session.removeAttribute(login);
            %>
        <input type="submit" value="Вихід"/>
    </form><br>
    <form action="quiz.jsp">
        <input type="submit" value="Почати опитування"/>
    </form>
    <form action="quiz-servlet">
        <input type="submit" value="Перевірка відповідей"/>
    </form>
</body>
</html>
