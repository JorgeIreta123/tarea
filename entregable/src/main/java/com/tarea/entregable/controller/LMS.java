package com.tarea.entregable.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class LMS {

    @GetMapping("/saludar/{name}")
    public String saludo(@PathVariable String name) {
        return "Hola " + name + ", bienvenido a Spring Boot";
    }
}
