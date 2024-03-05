<%--
  Created by IntelliJ IDEA.
  User: Vlad
  Date: 09.02.2024
  Time: 15:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Опитування</title>
</head>
<body>
<h1>Quiz</h1>
<form action="quiz-servlet" method="post">
    <fieldset>
        <legend>Question 1: What is the capital of France?</legend>
        <label>
            <input type="radio" name="q1" value="paris"> Paris
        </label><br>
        <label>
            <input type="radio" name="q1" value="london"> London
        </label><br>
        <label>
            <input type="radio" name="q1" value="berlin"> Berlin
        </label><br>
        <label>
            <input type="radio" name="q1" value="madrid"> Madrid
        </label><br>
    </fieldset>

    <fieldset>
        <legend>Question 2: Which planet is known as the Red Planet?</legend>
        <label>
            <input type="radio" name="q2" value="earth"> Earth
        </label><br>
        <label>
            <input type="radio" name="q2" value="mars"> Mars
        </label><br>
        <label>
            <input type="radio" name="q2" value="venus"> Venus
        </label><br>
        <label>
            <input type="radio" name="q2" value="jupiter"> Jupiter
        </label><br>
    </fieldset>

    <button type="submit">Відправити та завершити</button>
</form>
</body>
</html>
