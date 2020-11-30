package com.hillel.web;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter("/deleteFilms")
public class DeleteFilmsFilter implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest requestOne = (HttpServletRequest) request;
        HttpServletResponse responseOne = (HttpServletResponse) response;
        if(requestOne.getSession().getAttribute("user") != null) {
            requestOne.getRequestDispatcher("/deleteFilms").forward(request, response);
        } else {
            responseOne.sendRedirect("/login");
        }
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    @Override
    public void destroy() {
    }
}
