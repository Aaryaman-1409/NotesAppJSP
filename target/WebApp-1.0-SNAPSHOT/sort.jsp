<%@ page import="java.util.List" %>
<%@ page import="org.json.JSONObject" %>
<%@ page import="org.json.JSONArray" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Search Results</title>
</head>
<jsp:include page="/header.jsp"/>
<body style="background-color: #202124">
<div class="main">
    <jsp:include page="/sortform.jsp"/>
    <%
        String sortby = (String) request.getAttribute("sortby");
        String order = (String) request.getAttribute("order");
    %>
    <div class="text-light text-center">Sorted by
        <mark><%=sortby%> in <%=order%> order</mark>
        :
    </div>
    <jsp:include page="/resultsContainer.jsp"/>
    <jsp:include page="/footer.jsp"/>
</div>
</body>
</html>
