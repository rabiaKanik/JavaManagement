package org.example;

import org.example.model.MusicType;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(
        name = "selectmusicservlet",
        urlPatterns = "/SelectMusic"
)
public class SelectMusicServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{

        String musicType = request.getParameter("Type");

        MusicService musicService = new MusicService();
        MusicType l = MusicType.valueOf(musicType);
        List musicArtists = musicService.getAvailableArtist(l);

        request.setAttribute("artist", musicArtists);
        RequestDispatcher view =request.getRequestDispatcher("result.jsp");
        view.forward(request, response);

    }
}
