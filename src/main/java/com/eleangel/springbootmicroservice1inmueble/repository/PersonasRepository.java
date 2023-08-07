package com.eleangel.springbootmicroservice1inmueble.repository;

import com.eleangel.springbootmicroservice1inmueble.model.Personas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonasRepository extends JpaRepository<Personas,Long> {

}
