package com.hillel.web;

import com.hillel.service.VideoLibrarySource;
import com.hillel.service.impl.VideoLibrary;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/deleteFilms")
public class DeleteFilms extends HttpServlet {
    private static final long serialVersionUID = 1L;

    private VideoLibrary source;

    @Override
    public void init() throws ServletException {
        this.source = new VideoLibrary();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/jsp/DeleteFilms.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if(source.deleteFilmsOlderGivenYears(Integer.parseInt(request.getParameter("number")))) {
            request.setAttribute("status", "Successfully deleted");
            request.getRequestDispatcher("/jsp/DeleteFilms.jsp").forward(request, response);
        } else {
            request.setAttribute("status", "Something went wrong");
            request.getRequestDispatcher("/jsp/DeleteFilms.jsp").forward(request, response);
        }
    }
}
