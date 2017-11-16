<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<head>
    <title>Bencodes.tech</title>

    <!-- CSS -->
    <link type="text/css"
          rel="stylesheet"
          href="${pageContext.request.contextPath}/resources/bootstrap/css/bootstrap.min.css">


</head>
<body>

<!-- Navigation -->
<nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top">
    <div class="container">
        <a class="navbar-brand" href="/">bencodes.tech</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive"
                aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarResponsive">
            <ul class="navbar-nav ml-auto">
                <li class="nav-item active">
                    <a class="nav-link" href="/">Home
                        <span class="sr-only">(current)</span>
                    </a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">About</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">Services</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">Contact</a>
                </li>
            </ul>
        </div>
    </div>
</nav>
<br><br>
<!-- Page Content -->

<div class="container container-fluid">

    <div class="row">

        <!-- Post Content Column -->
        <div class="col-lg-8 align-content-center">

            <div id="wrapper">
                <div id="header">
                    <br>
                    <h2>Add Post</h2>
                </div>
            </div>

            <div class="table" id="container">

                <form:form action="savePost" modelAttribute="post" method="POST">

                    <table>
                        <tbody>
                        <tr>
                            <td><label>Title:</label></td>
                            <td><form:input path="title" /></td>
                        </tr>

                        <tr>
                            <td><label>Author:</label></td>
                            <td><form:input path="author" /></td>
                        </tr>

                        <tr>
                            <td><label>Date:</label></td>
                            <td><form:input path="date" /></td>
                        </tr>

                        <tr>
                            <td><label>Post:</label></td>
                            <td><form:input path="post" /></td>
                        </tr>

                        <tr>
                            <td><label></label></td>
                            <td><input type="submit"  value="Save"></td>
                        </tr>

                        </tbody>
                    </table>
                </form:form>
                <div style="clear: both;"></div>
                <p>
                    <a href="${pageContext.request.contextPath}/">Back to Home Page</a>
                </p>
        </div>

        <!-- Sidebar Widgets Column -->
        <div class="col-md-4">

            <!-- Search Widget -->
            <div class="card my-4">
                <h5 class="card-header">Search</h5>
                <div class="card-body">
                    <div class="input-group">
                        <input type="text" class="form-control" placeholder="Search for...">
                        <span class="input-group-btn">
                  <button class="btn btn-secondary" type="button">Go!</button>
                </span>
                    </div>
                </div>
            </div>

            <!-- Categories Widget -->
            <div class="card my-4">
                <h5 class="card-header">Categories</h5>
                <div class="card-body">
                    <div class="row">
                        <div class="col-lg-6">
                            <ul class="list-unstyled mb-0">
                                <li>
                                    <a href="#">Web Design</a>
                                </li>
                                <li>
                                    <a href="#">HTML</a>
                                </li>
                                <li>
                                    <a href="#">Freebies</a>
                                </li>
                            </ul>
                        </div>
                        <div class="col-lg-6">
                            <ul class="list-unstyled mb-0">
                                <li>
                                    <a href="#">JavaScript</a>
                                </li>
                                <li>
                                    <a href="#">CSS</a>
                                </li>
                                <li>
                                    <a href="#">Tutorials</a>
                                </li>
                            </ul>
                        </div>
                    </div>
                </div>
            </div>

            <!-- Side Widget -->
            <div class="card my-4">
                <h5 class="card-header">Side Widget</h5>
                <div class="card-body">
                    You can put anything you want inside of these side widgets. They are easy to use, and feature the
                    new Bootstrap 4 card containers!
                </div>
            </div>

        </div>

    </div>
    <!-- /.row -->

</div>
<!-- /.container -->

<!-- Footer -->
<footer class="py-5 bg-dark">
    <div class="container">
        <p class="m-0 text-center text-white">&copy; BENCODES.TECH 2017</p>
    </div>
    <!-- /.container -->
</footer>

</div>


<!-- JS/jQuery -->
<script src="${pageContext.request.contextPath}jquery/jquery.min.js"></script>
<script src="${pageContext.request.contextPath}bootstrap/js/bootstrap.bundle.min.js"></script>
</body>
</html>
