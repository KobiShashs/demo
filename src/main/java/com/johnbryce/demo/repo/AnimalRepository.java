package com.johnbryce.demo.repo;

import com.johnbryce.demo.beans.Animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface AnimalRepository extends JpaRepository<Animal,Long> {


    public List<Animal> findByNameAndId(String name, int id);

//    @Query("select * from..... ")
//    public void doSomething();


}
