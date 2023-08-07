package com.eleangel.springbootmicroservice1inmueble.service;

import com.eleangel.springbootmicroservice1inmueble.model.Personas;

import java.util.List;

public interface PersonaService {
    Personas savePersona(Personas persona);

    void deletePersona(Long personaId);

    List<Personas> getAllPersona();
}
