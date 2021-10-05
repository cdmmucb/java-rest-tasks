package com.example.tasks;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/*@RepositoryRestResource(collectionResourceRel = "tasks", path = "tasks")
public interface TaskRestRepository extends PagingAndSortingRepository<Task, Integer>{
    //List<Task> findAll();
    List<Task> findByTitle(@Param("title") String title);

}*/

@RepositoryRestResource(collectionResourceRel = "actors", path = "actors")
public interface TaskRestRepository extends PagingAndSortingRepository<Actor, Integer>{
    //List<Task> findAll();
    List<Actor> findByName(@Param("first_name") String name);

}