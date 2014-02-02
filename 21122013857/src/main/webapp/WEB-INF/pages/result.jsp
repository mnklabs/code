<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<body>
<h2> Below are the selected names : </h2> <br> <br>

  <c:forEach items="${selectedNames}" var="name">
      -- ${name} <br> 
  </c:forEach>
   
</body>
</html>
