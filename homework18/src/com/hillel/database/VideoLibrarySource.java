package com.hillel.database;

import com.hillel.entity.Actor;
import com.hillel.entity.Film;

import java.sql.Connection;
import java.util.List;

public interface VideoLibrarySource {

    boolean addActor(Actor actor, Connection connection);

    List<Film> findFilmsForCurrentAndPreviousYear(Connection connection);

    List<Actor> findActorsForFilm(String filmName, Connection connection);

    List<Actor> findActorsForFilm(int filmsCount, Connection connection);

    List<Actor> findActorAsDirector(Connection connection);

    void deleteFilmsOlderGivenYears(int years, Connection connection);

    public List<Actor> getActorsForFilmWithId(int filmId, Connection connection);

}
