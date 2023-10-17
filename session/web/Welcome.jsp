<%@page import="ma.projet.classes.Client"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Bienvenue</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap/dist/css/bootstrap.min.css">
    <style>
        body {
            background: #edb1f1;
            font-family: 'Arial', sans-serif;
            margin: 0;
            padding: 0;
        }

        .navbar {
            background: linear-gradient(-135deg, #c850c0, #4158d0);
            color: #ffffff;
        }

        .navbar-brand {
            font-size: 24px;
            font-weight: bold;
        }

        .logout-button {
            margin-left: auto;
            color: #ffffff;
        }

        .welcome-container {
            text-align: center;
            background-color: #ffffff;
            border-radius: 10px;
            box-shadow: 0px 5px 10px rgba(0, 0, 0, 0.1);
            max-width: 400px;
            margin: 50px auto;
            padding: 20px;
        }

        .welcome-text {
            font-size: 36px;
            color: #343a40;
            font-weight: bold;
            margin-bottom: 20px;
        }

        .name-text {
            font-size: 24px;
            color: #666;
        }
    </style>
</head>
<body>
    <%! Client c;%>
    <%
        if (session == null) {
            response.sendRedirect("Login.jsp");
        } else {
            c = (Client) session.getAttribute("user");
        }
    %>
    <nav class="navbar navbar-expand-lg">
        <div class="container">
            <a class="navbar-brand" href="Welcome.jsp">Welcome Page</a>
            <a class="logout-button" href="Login.jsp">Déconnexion</a>
        </div>
    </nav>
    <div class="welcome-container">
        <h1 class="welcome-text">Bienvenue</h1>
        <p class="name-text"><%= c.getPrenom() + " " + c.getNom() %></p>
    </div>
</body>
</html>
