package com.johnbryce.demo.dao;

import com.johnbryce.demo.beans.Animal;
import com.johnbryce.demo.repo.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AnimalDAO {

    @Autowired
    AnimalRepository repo;

    public long insert(Animal a){
        return repo.save(a).getId();
    }

    public List<Animal> getAll(){
        return repo.findAll();
    }


}
