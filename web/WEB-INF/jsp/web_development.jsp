<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Web Development</title>
</head>
<body>
    <h3>
        Feedback, please!
    </h3>

    <form action="FeedbackController">
        <input type="text" name="feedback" value="${feedback.value}">
        <input type="submit" name="button" value="Submit">
    </form>
</body>
</html>