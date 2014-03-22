<%-- 
    Document   : header
    Created on : 22 Mar, 2014, 5:40:18 PM
    Author     : Vishwajeet
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
 <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title> <% out.print(request.getParameter("title"));%></title>

        <!-- Bootstrap -->
        <link href="css/libraries/bootstrap.css" rel="stylesheet">
        <link href="css/style.css" rel="stylesheet">

    </head>