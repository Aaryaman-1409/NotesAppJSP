<%@ page import="java.util.List" %>
<%@ page import="org.json.JSONObject" %>
<%@ page import="org.json.JSONArray" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>
        <%=(String) request.getAttribute("name")%>
    </title>
</head>
<body style="background-color: #202124">
<jsp:include page="/header.jsp"/>
<div class="main">
    <%
        String action = (String) request.getAttribute("action");
        String text = (String) request.getAttribute("text");
        String name = (String) request.getAttribute("name");
        String id = (String) request.getAttribute("id");
    %>
    <% if (action != null) {
        if (action.equals("save")) {%>
    <div class="text-success text-center"
         style="margin: 5vh; padding:0.5vh; background-color: #ECF5EA; border-radius: 0.2rem;" id="alert"><h6>Note saved
        successfully</h6></div>
    <%} else if (action.equals("delete")) {%>
    <div class="text-danger text-center"
         style="margin: 5vh; padding:0.5vh; background-color: #FEEAE7; border-radius: 0.2rem;" id="alert"><h6>Note
        deleted successfully</h6></div>
    <%
            }
        }
    %>
    <form method="post" action="/save.html">
        <div class="form-group text-light" style="margin: 5vh; font-family: 'Roboto Light',sans-serif">
            <h4><label for="name">Enter title</label></h4>
            <textarea class="form-control bg-secondary text-light" id="name" name="name" rows="2"
                      required><%=name%></textarea>
        </div>
        <div class="form-group text-light" style="margin:5vh; font-family: 'Roboto Light',sans-serif">
            <h4><label for="text">Enter content of note</label></h4>
            <textarea class="form-control bg-secondary text-light" id="text" name="text" rows="10"
                      required><%=text%></textarea>
        </div>
        <input type="hidden" id="id" name="id" value=<%=id%>>
        <button style="margin: 5vh; font-family: 'Roboto Light',sans-serif" class="btn my-2 my-sm-0 btn-success"
                type="submit">Save
        </button>
    </form>
    <form method="post" action="/delete.html">
        <input type="hidden" name="id" value=<%=id%>>
        <button style="margin: 5vh; font-family: 'Roboto Light',sans-serif" class="btn my-2 my-sm-0 btn-danger"
                type="submit">Delete
        </button>
    </form>
    <form method="get" action="/index.html">
        <button style="margin: 5vh; font-family: 'Roboto Light',sans-serif" class="btn my-2 my-sm-0 btn-primary"
                type="submit">Back to Home
        </button>
    </form>
</div>

<script>
    const myTimeout = setTimeout(hideAlert, 500);

    function fade(element) {
        let opacity = 1;
        let counter = setInterval(function () {
            if (opacity <= 0.1) {
                clearInterval(counter);
                element.style.display = 'none';
            }
            element.style.opacity = opacity;
            element.style.filter = 'alpha(opacity=' + opacity * 100 + ")";
            opacity -= opacity * 0.05;
        }, 25);
    }

    function hideAlert() {
        if (document.getElementById("alert") != null) {
            fade(document.getElementById("alert"));
        }
    }
</script>

</body>
</html>


