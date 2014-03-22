<%-- 
    Document   : index
    Created on : 1 Mar, 2014, 2:17:47 PM
    Author     : Vishwajeet
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
   
    <jsp:include page="layouts/header.jsp">
    <jsp:param name="title" value="Welcome"/>
   </jsp:include>
    <body>
        <div class="jumbotron">
            <h1 class="text-center"><% out.print("Welcome "+session.getAttribute("username"));%></h1>
        </div>
        <div class="row">
        <div class="text-center">
            <form action="Logout" method="post" role="form">
                <button type="submit" class="btn btn-lg btn-danger">
                    Logout
                </button>
            </form>
        </div>
        
        <jsp:include page="layouts/footer.jsp" />
    </body>
</html>