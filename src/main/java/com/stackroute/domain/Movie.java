package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Autowired;

public class Movie {
    @Autowired
    private Actor actor;

    public Movie() {

    }

    @Autowired
    public Movie(Actor actor) {
        this.actor = actor;
        System.out.println("Constructor Called");
    }

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
        System.out.println("Setter Method Called");
    }

    public void displayInformation() {
        actor.display();
    }

    public void initMethod() {
        actor = new Actor("ABC", "Female", 12);
    }
}
