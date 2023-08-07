package com.eleangel.springbootmicroservice1inmueble.service;

import com.eleangel.springbootmicroservice1inmueble.model.Inmueble;
import com.eleangel.springbootmicroservice1inmueble.repository.InmuebleRepository;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class InmuebleServiceImpl implements InmuebleService{

    private final InmuebleRepository inmuebleRepository;


    public InmuebleServiceImpl(InmuebleRepository inmuebleRepository) {
        this.inmuebleRepository = inmuebleRepository;
    }

    @Override
    public Inmueble saveInmueble(Inmueble inmueble){
        inmueble.setFechaCreacion(LocalDateTime.now());
        return inmuebleRepository.save(inmueble);
    }

    @Override
    public void deleteInmueble(Long inmuebleId){
        inmuebleRepository.deleteById(inmuebleId);

    }

    @Override
    public List<Inmueble> findAllInmueble(){

        return inmuebleRepository.findAll(Sort.by(Sort.Direction.DESC, "id"));
    }

    @Override
    @Query(
            value = "SELECT * FROM sc_inmueble.inmueble WHERE id  = ?1",
            nativeQuery = true)
    public List<Inmueble> findAllInmueblesQuery(Long inmuebleId){
        return inmuebleRepository.finbyInmuebleId(inmuebleId);

    }





}
