package com.example.tasks;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="actor")
public class Actor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer actor_id;
    @Column(name="first_name")
    private String name;
    private String last_name;
    private Timestamp last_update;
        
    public Actor (){
        
    }

    public Integer getActor_id() {
        return actor_id;
    }

public String getName() {
    return name;
}

    public String getLast_name() {
        return last_name;
    }

    public Timestamp getLast_update() {
        return last_update;
    }

    public void setActor_id(Integer actor_id) {
        this.actor_id = actor_id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public void setLast_update(Timestamp last_update) {
        this.last_update = last_update;
    }

}