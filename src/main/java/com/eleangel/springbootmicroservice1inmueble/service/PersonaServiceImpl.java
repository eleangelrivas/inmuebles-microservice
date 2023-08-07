package com.eleangel.springbootmicroservice1inmueble.service;

import com.eleangel.springbootmicroservice1inmueble.model.Personas;
import com.eleangel.springbootmicroservice1inmueble.repository.PersonasRepository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaServiceImpl implements PersonaService {

    private final PersonasRepository personasRepository;


    public PersonaServiceImpl(PersonasRepository personasRepository) {
        this.personasRepository = personasRepository;
    }

    @Override
    public Personas savePersona(Personas persona){
        return personasRepository.save(persona);
    }

    @Override
    public void deletePersona(Long personaId){
         personasRepository.deleteById(personaId);
    }

    @Override
    public List<Personas> getAllPersona(){
        return personasRepository.findAll(Sort.by(Sort.Direction.DESC, "id"));
    }
}
