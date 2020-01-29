package com.johnbryce.demo.rest;

import com.johnbryce.demo.beans.Person;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/person")
public class PersonController {

    @GetMapping("hi1")
    public String sayHello(){
        return "Hello World";
    }

    @GetMapping("hi2")
    public String sayHello2(@RequestParam String name){
        return "Hello "+name;
    }
    @GetMapping("hi/{name}")
    public String sayHello3(@PathVariable String name){
        return "Hello "+name;
    }

    @PostMapping("add")
    public Person add(@RequestBody Person p){
        return p;
    }

    @DeleteMapping("remove")
    public Person delete(@RequestBody  Person p){
        return p;
    }

    @PutMapping ("update")
    public Person update(@RequestBody Person p){
        return p;
    }




}
