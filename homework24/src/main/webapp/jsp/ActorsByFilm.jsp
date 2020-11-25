<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<link href="css/style.css" rel="stylesheet" type="text/css"/>
</head>
<body>
    <c:import url="/jspf/Header.jspf"></c:import>

    <form action="actorsByFilm" method="post">
            <input type="text" name="film"> <input type="submit">
    </form>

    <div class="object">
    <c:forEach items="${actors}" var="actor">
        ${actor}
        <br>
    </c:forEach>
    </div>

</body>
</html>