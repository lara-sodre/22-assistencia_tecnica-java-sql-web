package br.fiap.assistencia_tecnica.web.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
//@NoArgsConstructor se precisar de construtor sem parâmetro e "@AllArgsConstructro" com parâmetro
public class EquipamentoDTO {
    private Long idEquip;
    private Long idCliente;
    private String tipo;
    private String marca;
    private String modelo;
    private String numeroSerie;
    private LocalDate dataCadastro;
}
