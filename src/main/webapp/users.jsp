<%@ page import="com.example.table_servlet.Users" %>
<%@ page import="java.util.List" %>


<%--
  Created by IntelliJ IDEA.
  User: maryna
  Date: 13.02.2023
  Time: 17:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Users</title>
</head>
<style>
    body{
        margin: 0 auto;
    }
    table, th, td{
        border: 1px solid gray;
        text-align: center;
        width: fit-content;


    }
    th {
        text-transform: uppercase;
        background-color: darkgrey;
        color: white;
        width: fit-content;
    }

</style>
<body>
<table>
    <thead>
    <tr>
        <th>Name</th>
        <th>Last name</th>
        <th>Age</th>
        <th>city</th>
        <th>street</th>
        <th>postcode</th>
        <th>university</th>
        <th>occupation</th>
        <th>laptop</th>
        <th>network</th>
        <th>salary</th>

    </tr>
    </thead>
    <tbody>
    <%
        List<Users> users = (List<Users>) request.getAttribute("users");
        for (Users u:users) {
          out.print(("<tr><td>" + u.getName() + "</td><td>" + u.getLastName() + "</td><td>" + u.getAge() + "</td><td>" +u.getCity() + "</td><td>"
                   +u.getStreet()  + "</td><td>" + u.getPostcode()+ "</td><td>" + u.getUniversity()+ "</td><td>"+u.getOccupation()+ "</td><td>"
                   +u.getLaptop()+ "</td><td>"+u.getNetwork()+ "</td><td>"+u.getSalary()+ "</td></tr>"));

        }

    %>
    </tbody>
</table>



</body>
</html>
