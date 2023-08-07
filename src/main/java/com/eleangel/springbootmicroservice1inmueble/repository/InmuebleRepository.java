package com.eleangel.springbootmicroservice1inmueble.repository;

import com.eleangel.springbootmicroservice1inmueble.model.Inmueble;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface InmuebleRepository extends JpaRepository<Inmueble,Long> {

    @Query(
            value = "SELECT * FROM sc_inmueble.inmueble WHERE id  = ?1",
            nativeQuery = true)
    List<Inmueble> finbyInmuebleId(Long inmuebleId);


}
