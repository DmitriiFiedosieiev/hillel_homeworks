package com.hillel.entity;

import java.util.Date;
import java.util.List;

public class Film extends Entity{

    private String name;
    private Director director;
    private List<Actor> actors;
    private Date dateOFProduction;
    private String country;

    public Film() {
    }

    public Film(int id, String name, Director director, List<Actor> actors, Date dateOFProduction, String country) {
        super(id);
        this.name = name;
        this.director = director;
        this.actors = actors;
        this.dateOFProduction = dateOFProduction;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public List<Actor> getActors() {
        return actors;
    }

    public void setActors(List<Actor> actors) {
        this.actors = actors;
    }

    public Date getDateOFProduction() {
        return dateOFProduction;
    }

    public void setDateOFProduction(Date dateOFProduction) {
        this.dateOFProduction = dateOFProduction;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        String result = "";
        for (Actor actor : actors) {
            result += actor;
        }
        return super.toString() + name + " " + director + "\n " + result + "\n " + country + " " + dateOFProduction;
    }
}
