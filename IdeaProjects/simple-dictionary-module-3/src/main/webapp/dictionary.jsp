<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %>
<%--
  Created by IntelliJ IDEA.
  User: tungchihuy95
  Date: 10/30/20
  Time: 15:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Simple Dictionary</title>
</head>
<body>
<%!
    Map<String, String> dictionary = new HashMap<>();
%>

<%
        dictionary.put("hello", "xin chao");
        dictionary.put("how", "nhu the nao");
        dictionary.put("book", "quyen sach");
        dictionary.put("computer", "may tinh");
        
        String search = request.getParameter("search");
        
        String result = dictionary.get(search);
        if (result != null) {
            out.println("Word: " + search);
            out.println("Result: " + result);
            
        } else {
            out.println("Not found");
        }
%>

</body>
</html>
