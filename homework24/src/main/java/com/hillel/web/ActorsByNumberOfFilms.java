package com.hillel.web;

import com.hillel.entity.Actor;
import com.hillel.service.VideoLibrarySource;
import com.hillel.service.impl.VideoLibrary;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/actorsByNumberOfFilms")
public class ActorsByNumberOfFilms extends HttpServlet {
    private static final long serialVersionUID = 1L;

    private VideoLibrary source;

    @Override
    public void init() throws ServletException {
        this.source = new VideoLibrary();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/jsp/ActorsByNumberOfFilms.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Actor> actors = source.findActorsForFilm(Integer.parseInt(request.getParameter("number")));
        request.setAttribute("actors", actors);
        request.getRequestDispatcher("/jsp/ActorsByNumberOfFilms.jsp").forward(request, response);
    }
}
