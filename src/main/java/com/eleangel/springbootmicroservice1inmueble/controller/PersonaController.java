package com.eleangel.springbootmicroservice1inmueble.controller;

import com.eleangel.springbootmicroservice1inmueble.model.Inmueble;
import com.eleangel.springbootmicroservice1inmueble.model.Personas;
import com.eleangel.springbootmicroservice1inmueble.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/personas")
public class PersonaController {

    @Autowired
    private PersonaService personaService;

    @PostMapping
    public ResponseEntity<?> savePersona(@RequestBody Personas persona){
        return new ResponseEntity<>(
                personaService.savePersona(persona),
                HttpStatus.CREATED
        );
    }

    @DeleteMapping("{personaId}")
    public ResponseEntity<?> deletePersona(@PathVariable Long personaId){
        personaService.deletePersona(personaId);
        return new ResponseEntity<>(
            HttpStatus.OK
        );
    }

    @GetMapping
    public ResponseEntity<?> findAllPersona(){
        return ResponseEntity.ok(personaService.getAllPersona());
    }

}
