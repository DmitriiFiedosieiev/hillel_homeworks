package com.hillel.utils;

import com.hillel.entity.Actor;
import com.hillel.entity.Director;
import com.hillel.entity.Film;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

public class Handler {

    public static ArrayList<Actor> handleActors(ResultSet resultSet) {
        ArrayList<Actor> result = new ArrayList<>();
        try{
            while (resultSet.next()) {
                int id = resultSet.getInt("actors.id");
                String name = resultSet.getString("actors.name");
                String surname = resultSet.getString("actors.surname");
                Date birthday = new java.sql.Date(resultSet.getDate("actors.birthday").getTime());
                result.add(new Actor(id, name, surname, birthday));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    public static ArrayList<Film> handleFilms(ResultSet resultSet) {
        ArrayList<Film> result = new ArrayList<>();
        try{
            while (resultSet.next()) {
                Director director = new Director();
                director.setId(resultSet.getInt("directors.id"));
                director.setName(resultSet.getString("directors.name"));
                director.setSurname(resultSet.getString("directors.surname"));
                Date birthday = new java.sql.Date(resultSet.getDate("directors.birthday").getTime());
                director.setBirthday(birthday);

                Film film = new Film();
                film.setId(resultSet.getInt("films.id"));
                film.setName(resultSet.getString("films.name"));
                film.setCountry(resultSet.getString("films.country"));
                Date date = new java.sql.Date(resultSet.getDate("films.date_of_production").getTime());
                film.setDateOFProduction(date);
                film.setDirector(director);

                result.add(film);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }
}
