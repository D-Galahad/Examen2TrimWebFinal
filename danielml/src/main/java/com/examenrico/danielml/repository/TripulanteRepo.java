package com.examenrico.danielml.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.repository.support.Repositories;
import org.springframework.stereotype.Repository;

import com.examenrico.danielml.model.Tripulante;


@Repository
public interface TripulanteRepo extends JpaRepository<Tripulante, Long>{
    public List<Tripulante> findByLicencia(@Param("licencia_estelar") String licencia_estelar);


    //presupuesto total invertido en todas las misiones de un tripulante específico
    @Query("SELECT SUM(m.presupuesto_mision)*0.85 FROM mision_asignada m WHERE m.estado_mision = 'COMPLETADA' AND m.tripulante_id = :id")
    @Param("presupuesto_mision")
    public Repositories ImpuestosTotales(@Param("id") Long id);

    
}
