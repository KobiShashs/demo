package com.johnbryce.demo.service;

import com.johnbryce.demo.beans.Animal;
import com.johnbryce.demo.repo.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimalService {

    @Autowired
    AnimalRepository repo;

    public List<Animal>getAll(){
        return repo.findAll();
    }
}
