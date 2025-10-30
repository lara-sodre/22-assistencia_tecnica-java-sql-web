package br.fiap.assistencia_tecnica.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.ConstraintComposition;
import org.hibernate.validator.constraints.ISBN;
import org.springframework.cglib.core.Local;

import java.time.LocalDate;
//gera get e set de forma automática e "invisível" - @DATA ybm
@Getter
@Setter

@Entity
@Table(name = "JAVA_EQUIPAMENTO")
public class Equipamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_equip")
    private Long id_equip;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_cliente", foreignKey = @ForeignKey (name= "FK_EQUIP_CLIENTE")) //indicação de chave estrangeira
    private Cliente id_cliente;
                          //n pode ser null
    @Column(name = "tipo", nullable = false, length = 50)
    private String tipo;

    @Column(name = "marca", length = 50)
    private String marca;

    @Column(name = "modelo", length = 50)
    private String modelo;

    @Column(name = "numero_serie", length = 80, unique = true)
    private String numero_serie;

    @Column(name = "data_cadastro", nullable = false)
    private LocalDate data_cadastro;

}
