<jsp:include page="/meta.jsp"/>
<nav class="navbar navbar-dark bg-dark" style="margin-bottom: 3vh">
    <a class="navbar-item nav-link text-light" href="/" style="padding-left: 40%; font-size: 1.5rem">Notes App Home</a>
    <a class="nav-item nav-link mr-auto btn btn-primary" href="/expandednote.html?id=default">Add New Note</a>

    <form class="form-inline my-2 mg-lg-0" method="post" action="${pageContext.request.contextPath}/runsearch.html">
        <input class="form-control mr-sm-2" type="search" placeholder="Search" name="keyword" aria-label="Search"
               required>
        <button class="btn my-2 my-sm-0 btn-primary" type="submit">Search</button>
    </form>
</nav>
