package com.examenrico.danielml.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.repository.support.Repositories;
import org.springframework.stereotype.Repository;

import com.examenrico.danielml.model.MisionAsignada;
import com.examenrico.danielml.model.enums.EstadoMision;

@Repository
public interface MisionAsignadaRepo extends JpaRepository<MisionAsignada, Long>{
    
    public List<MisionAsignada> findByEstado(@Param("estado_mision") EstadoMision estado_mision);

    //Endpoint de Cálculo: Un método que reciba el ID de un tripulante 
    //y devuelva el total de "impuestos galácticos" pagados (calcula el 15% sobre el presupuesto total de sus misiones completadas)
    @Query("SELECT SUM(m.presupuesto_mision)*0.85 FROM mision_asignada m WHERE m.estado_mision = 'COMPLETADA' AND m.id_tripulante = :id")
    public Repositories ImpuestosTotales(@Param("id") Long id);
}
