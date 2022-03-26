<%@ page import="java.util.List" %>
<%@ page import="org.json.JSONObject" %>
<%@ page import="org.json.JSONArray" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>All Notes</title>
</head>
<jsp:include page="/header.jsp"/>
<body style="background-color: #202124">
<div class="main">
    <jsp:include page="/sortform.jsp"/>
    <div class="container">
        <div class="row">
            <%
                JSONObject notes = (JSONObject) request.getAttribute("notes");
                JSONArray keys = notes.names();
                for (int i = 0; i < keys.length(); i++) {
                    String key = keys.getString(i);
                    if (key.equals("default") || key.equals("total")) {
                        continue;
                    }
                    JSONObject note = notes.getJSONObject(key);
                    String name = note.getString("name");
                    String text = note.getString("text");
            %>
            <div class="col-sm-3" style="margin-top:1.5vh; margin-bottom: 1.5vh; overflow: hidden">
                <div class="col-sm-12"
                     style="background-color: #29395a; padding: 3vh; border-radius: 1rem; height: 30vh;">
                    <div class="text-right"><a
                            style="font-family: 'Roboto Light',sans-serif; font-size: 0.8rem; color: cornflowerblue"
                            href="expandednote.html?id=<%=key%>">Index: <%=key%>
                    </a></div>
                    <h5><a style="font-family: 'Roboto Light',sans-serif" class="text-light"
                           href="expandednote.html?id=<%=key%>"><%=name%>
                    </a></h5>
                    <h6><a style="font-family: 'Roboto Light',sans-serif" class="text-light"
                           href="expandednote.html?id=<%=key%>"><%=text%>
                    </a></h6>
                </div>
            </div>
            <%}%>
        </div>
    </div>


</div>
</body>
</html>
