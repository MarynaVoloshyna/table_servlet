package com.example.table_servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class UsersTable extends HttpServlet {

    private List<Users> users = Arrays.asList
            (new Users("Ihor", "Honcharov", 38, "Kyiv", "Vasylkivska", 03022, "National Aviation University", "Warranty Engener", "HP", "Kyivstar", 800),
            new Users("Maryna", "Voloshyna", 32, "Kyiv", "Vasylkivska", 03022, "National Aviation University", "none", "Macbook", "Lifecell", 0),
            new Users("Anna", "Nesmiian", 32, "Kyiv", "Pravdy prospect", 02014, "Kyiv National Economic University", "Account manager", "Macbook", "Lifecell", 500 ),
            new Users("Ruslan", "Nesmiian", 32, "Kyiv", "Pravdy prospect", 02014, "National University of Food Technologies", "Client servise manager", "Asus", "Vodafone", 650 ),
            new Users("Liliia", "Topol", 32, "Mykolaiv", "Naberezhna", 01103, "Kyiv National Linguistic University", "Supplier manager", "Acer", "Vodafone", 1200),
            new Users("Pavlo", "Sinkov", 37, "Kharkiv", "Kyivska", 04520, "National Pedagogical Dragomanov University", "Logistic manager", "Asus", "Kyivstar", 750),
                    new Users("Ihor", "Honcharov", 38, "Kyiv", "Vasylkivska", 03022, "National Aviation University", "Warranty Engener", "HP", "Kyivstar", 800),
                    new Users("Maryna", "Voloshyna", 32, "Kyiv", "Vasylkivska", 03022, "National Aviation University", "none", "Macbook", "Lifecell", 0),
                    new Users("Anna", "Nesmiian", 32, "Kyiv", "Pravdy prospect", 02014, "Kyiv National Economic University", "Account manager", "Macbook", "Lifecell", 500 ),
                    new Users("Ruslan", "Nesmiian", 32, "Kyiv", "Pravdy prospect", 02014, "National University of Food Technologies", "Client servise manager", "Asus", "Vodafone", 650 ),
                    new Users("Liliia", "Topol", 32, "Mykolaiv", "Naberezhna", 01103, "Kyiv National Linguistic University", "Supplier manager", "Acer", "Vodafone", 1200),
                    new Users("Pavlo", "Sinkov", 37, "Kharkiv", "Kyivska", 04520, "National Pedagogical Dragomanov University", "Logistic manager", "Asus", "Kyivstar", 750));
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("users", users);
        req.setAttribute("customers", getUsersTable());
        req.getRequestDispatcher("users.jsp").forward(req, resp);
    }
    public String getUsersTable (){
        StringBuilder sb = new StringBuilder();
        for (Users u:users) {
            sb.append("<tr><td>")
                    .append(u.getName())
                    .append("</td><td>")
                    .append(u.getLastName())
                    .append("</td><td>")
                    .append(u.getAge())
                    .append("</td><td>")
                    .append(u.getCity())
                    .append("</td><td>")
                    .append(u.getStreet())
                    .append("</td><td>")
                    .append(u.getPostcode())
                    .append("</td><td>")
                    .append(u.getUniversity())
                    .append("</td><td>")
                    .append(u.getOccupation())
                    .append("</td><td>")
                    .append(u.getLaptop())
                    .append("</td><td>")
                    .append(u.getNetwork())
                    .append("</td><td>")
                    .append(u.getSalary())
                    .append("</td></tr>");
        }
        return sb.toString();
    }
}
