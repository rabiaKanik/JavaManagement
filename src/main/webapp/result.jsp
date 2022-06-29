
<%@ page import ="java.util.*" %>

<!DOCTYPE html>
<html>
<body>
<center>
    <h1>
        Available Artist
    </h1>
    <%
        List result = (List) request.getAttribute("artist");
        Iterator iterator = result.iterator();

        out.println("<br> We have <br><br>");
        while(iterator.hasNext()){
            out.println(iterator.next()+"<br>");
        }
    %>
</center>
</body>
</html>