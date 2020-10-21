package com.hillel.service.impl;

import com.hillel.database.VideoLibraryWorker;
import com.hillel.service.VideoLibrarySource;
import com.hillel.utils.ConnectionHolder;
import com.hillel.entity.Actor;
import com.hillel.entity.Film;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class VideoLibrary implements VideoLibrarySource {

    private VideoLibraryWorker source;

    public VideoLibrary() {
        this.source = new VideoLibraryWorker();
    }

    @Override
    public void addActor(Actor actor) {
        try (Connection connection = ConnectionHolder.getConnection()) {
            source.addActor(actor, connection);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Film> findFilmsForCurrentAndPreviousYear() {
        List<Film> result = new ArrayList<>();
        try (Connection connection = ConnectionHolder.getConnection()) {
            connection.setAutoCommit(false);
            result = source.findFilmsForCurrentAndPreviousYear(connection);
            for (Film film : result) {
                film.setActors(source.getActorsForFilmWithId(film.getId(), connection));
            }
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public List<Actor> findActorsForFilm(String filmName) {
        List<Actor> result = new ArrayList<>();
        try (Connection connection = ConnectionHolder.getConnection()) {
          result = source.findActorsForFilm(filmName, connection);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public List<Actor> findActorsForFilm(int filmsCount) {
        List<Actor> result = new ArrayList<>();
        try(Connection connection = ConnectionHolder.getConnection()) {
            result = source.findActorsForFilm(filmsCount, connection);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public List<Actor> findActorAsDirector() {
        List<Actor> result = new ArrayList<>();
        try(Connection connection = ConnectionHolder.getConnection()) {
            result = source.findActorAsDirector(connection);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public void deleteFilmsOlderGivenYears(int years) {
        try(Connection connection = ConnectionHolder.getConnection()) {
            source.deleteFilmsOlderGivenYears(years, connection);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public VideoLibraryWorker getSource() {
        return source;
    }

    public void setSource(VideoLibraryWorker source) {
        this.source = source;
    }
}
