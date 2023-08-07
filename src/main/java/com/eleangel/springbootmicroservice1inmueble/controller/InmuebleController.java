package com.eleangel.springbootmicroservice1inmueble.controller;

import com.eleangel.springbootmicroservice1inmueble.model.Inmueble;
import com.eleangel.springbootmicroservice1inmueble.repository.InmuebleRepository;
import com.eleangel.springbootmicroservice1inmueble.service.InmuebleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/inmueble")
public class InmuebleController {
    @Autowired
    private InmuebleService inmuebleService;

    @PostMapping
    public ResponseEntity<?> saveInmueble(@RequestBody Inmueble inmueble){
        return new ResponseEntity<>(
                inmuebleService.saveInmueble(inmueble),
                HttpStatus.CREATED
        );
    }

    //http://localhost:3333/api/inmueble/1
    @DeleteMapping("{inmuebleId}")
    public ResponseEntity<?> deleteInmueble(@PathVariable Long inmuebleId){
        inmuebleService.deleteInmueble(inmuebleId);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<?> getAllInmueble(){

        return ResponseEntity.ok(inmuebleService.findAllInmueble());
    }


    @GetMapping("/query/{inmuebleId}")
    public ResponseEntity<?> getAllInmuebleQuery(@PathVariable Long inmuebleId){

        return ResponseEntity.ok(inmuebleService.findAllInmueblesQuery(inmuebleId));
    }

}
