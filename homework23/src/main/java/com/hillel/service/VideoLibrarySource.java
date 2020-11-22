package com.hillel.service;

import com.hillel.entity.Actor;
import com.hillel.entity.Film;

import java.util.List;

public interface VideoLibrarySource {

    void addActor(Actor actor);

    List<Film> findFilmsForCurrentAndPreviousYear();

    List<Actor> findActorsForFilm(String filmName);

    List<Actor> findActorsForFilm(int filmsCount);

    List<Actor> findActorAsDirector();

    boolean deleteFilmsOlderGivenYears(int years);

}
