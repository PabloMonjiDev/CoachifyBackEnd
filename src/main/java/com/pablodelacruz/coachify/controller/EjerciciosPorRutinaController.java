package com.pablodelacruz.coachify.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pablodelacruz.coachify.service.RutinaEjercicioService;

@RestController
@RequestMapping("/api/rutinas/{rutinaID}/ejercicios")
public class EjerciciosPorRutinaController {
    
    @Autowired
    RutinaEjercicioService rutinaEjercicioService;

    @GetMapping()
    public ResponseEntity<?> getEjerciciosByRutinaID(@PathVariable("rutinaID") Long rutinaID) {
        try {
            return new ResponseEntity<>(rutinaEjercicioService.getEjerciciosByRutinaID(rutinaID), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
