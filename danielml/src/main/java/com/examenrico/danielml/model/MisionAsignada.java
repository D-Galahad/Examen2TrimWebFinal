package com.examenrico.danielml.model;

import java.math.BigDecimal;

import com.examenrico.danielml.model.enums.EstadoMision;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "mision_asignada")
@NoArgsConstructor
@Data
public class MisionAsignada {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tripulante_id")
    @JsonIgnore
    private Long tripulante_id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "nave_id")
    @JsonIgnore
    private Long nave_id;

    @Column(name = "fecha_estelar")
    private BigDecimal fecha_estelar;

    @Enumerated(EnumType.STRING)
    @Column(name = "estado_mision")
    private EstadoMision estado_mision;

    @Column(name = "presupuesto_mision")
    private BigDecimal presupuesto_mision;
}

