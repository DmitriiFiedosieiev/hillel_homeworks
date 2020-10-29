package web;

import service.Words;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/foundWords")
public class FoundWords extends HttpServlet {

        private Words serviceWords;

        public FoundWords() {
            serviceWords = new Words();
        }

        @Override
        protected void doPost(HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {
            String word = request.getParameter("word");
            response.getWriter().append(Integer.toString(serviceWords.countWords(word)));
        }
}
