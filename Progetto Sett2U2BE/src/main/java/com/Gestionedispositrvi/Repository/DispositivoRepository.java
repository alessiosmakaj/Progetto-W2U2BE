package com.GestioneDispositivi.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.GestioneDispositivi.model.Dispositivo;
@Repository
public interface DispositivoRepository extends CrudRepository<Dispositivo, Long> {

}
