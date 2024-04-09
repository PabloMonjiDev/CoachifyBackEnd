package com.pablodelacruz.coachify.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.pablodelacruz.coachify.model.Rutina;
import com.pablodelacruz.coachify.service.RutinaService;

@RestController
@RequestMapping("/api/rutinas")
public class RutinaController {
    
    @Autowired
    RutinaService rutinaService;

    @GetMapping()
    public ResponseEntity<?> getAllRutinas() {
        try {
            return new ResponseEntity<>(rutinaService.getAllRutinas(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/{rutinaID}")
    public ResponseEntity<?> getRutinaById(@PathVariable("rutinaID") Long id) {
        try {
            return new ResponseEntity<>(rutinaService.getRutinaById(id), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping()
    public ResponseEntity<?> createRutina(@RequestBody Rutina rutina) {
        try {
            return new ResponseEntity<>(rutinaService.createRutina(rutina), HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/{rutinaID}")
    public ResponseEntity<?> updateRutina(@PathVariable("rutinaID") Long id, @RequestBody Rutina rutinaDetails) {
        try {
            return new ResponseEntity<>(rutinaService.updateRutina(id, rutinaDetails), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/{rutinaID}")
    public ResponseEntity<?> deleteRutina(@PathVariable("rutinaID") Long id) {
        try {
            rutinaService.deleteRutina(id);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    
}
