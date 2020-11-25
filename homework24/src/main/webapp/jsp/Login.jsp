<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<link href="css/style.css" rel="stylesheet" type="text/css"/>
</head>
<body>
    <c:import url="/jspf/Header.jspf"></c:import>

    <div class="authorize">
        <form action="login" method="post">
            Enter your login name
            <input type="text" name="name">
            Enter your password
            <input type="text" name="password">
            <input type="submit">
        </form>
    </div>

        <div class="error">
        ${invalid}
        </div>

</body>
</html>