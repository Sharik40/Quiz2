<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Сторінка авторизації" %></h1>
<br/>
<form action="login-servlet">
  Login: <input type="text" name="login"><br>
  Password: <input type="password" name="password"><br>
  <input type="submit" value="Зареєструватися"/>
</form>
</body>
</html>