package br.fiap.assistencia_tecnica.domain;

import jakarta.persistence.*;
import org.hibernate.validator.constraints.ConstraintComposition;
import org.hibernate.validator.constraints.ISBN;
import org.springframework.cglib.core.Local;

import java.time.LocalDate;

@Entity
@Table(name = "JAVA_EQUIPAMENTO")
public class Equipamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id_equip")
    private Long id_equip;

    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Cliente id_cliente;

    @Column(name = "tipo", nullable = false, length = 120)
    private String tipo;

    @Column(name = "marca", nullable = false, length = 120)
    private String marca;

    @Column(name = "modelo", nullable = false, length = 120)
    private String modelo;

    @Column(name = "numero_serie", nullable = false, length = 120)
    private String numero_serie;

    @Column(name = "data_cadastro", nullable = false, length = 120)
    private LocalDate data_cadastro;


}
