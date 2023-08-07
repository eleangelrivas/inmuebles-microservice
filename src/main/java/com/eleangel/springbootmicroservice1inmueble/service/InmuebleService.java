package com.eleangel.springbootmicroservice1inmueble.service;

import com.eleangel.springbootmicroservice1inmueble.model.Inmueble;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface InmuebleService {
    Inmueble saveInmueble(Inmueble inmueble);

    void deleteInmueble(Long inmuebleId);


    List<Inmueble> findAllInmueble();

    @Query(
            value = "SELECT * FROM sc_inmueble.inmueble WHERE id  = ?1",
            nativeQuery = true)
    List<Inmueble> findAllInmueblesQuery(Long inmuebleId);
}
