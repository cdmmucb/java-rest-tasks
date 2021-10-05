package com.example.tasks;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.MediaType;

@RestController
public class Actors {
    List<Actor> actorList = new ArrayList<>();

    @GetMapping(path="/actorOld", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Actor> listAll(){
        return actorList;
    }

    @PostMapping(path="/actor", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Actor listAll(@RequestBody Actor actor){
        actorList.add(actor);
        return actor;
    }
}

