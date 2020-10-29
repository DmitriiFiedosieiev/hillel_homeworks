package web;

import service.Numbers;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/sortedNumbers")
public class SortedNumbers extends HttpServlet {

    private Numbers serviceNumbers;

    public SortedNumbers() {
        serviceNumbers = new Numbers();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {
        String numbers = request.getParameter("numbers");
        response.getWriter().println(serviceNumbers.sortNumbers(numbers));
    }
}
