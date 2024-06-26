package com.pablodelacruz.coachify.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

import com.pablodelacruz.coachify.model.Cliente;
import com.pablodelacruz.coachify.model.Rutina;

public interface RutinaRepository extends JpaRepository<Rutina, Long> {
    
    List<Rutina> findAllByClienteID(Cliente clienteId);
}
