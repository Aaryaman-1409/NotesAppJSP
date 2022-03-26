<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Search Results</title>
</head>
<jsp:include page="/header.jsp"/>
<body style="background-color: #202124">
<div class="main">
    <%
        List<String> results = (List<String>) request.getAttribute("results");
        String keyword = (String) request.getAttribute("keyword");
        if (results.size() == 0) { %>
    <div class="text-light text-center">No search results matching
        <mark><%=keyword%>
        </mark>
    </div>
    <%} else {%>
    <div class="text-light text-center">Search results matching
        <mark><%=keyword%>
        </mark>
        :
    </div>
    <jsp:include page="/resultsContainer.jsp"/>
    <%}%>
    <jsp:include page="/footer.jsp"/>
</div>
</body>
</html>
