package com.johnbryce.demo.rest;

import com.johnbryce.demo.beans.Animal;
import com.johnbryce.demo.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("animal")
public class AnimalController {

    @Autowired
    AnimalService service;

    @GetMapping("all")
    public List<Animal> getAll() {
        return service.getAll();
    }

}
