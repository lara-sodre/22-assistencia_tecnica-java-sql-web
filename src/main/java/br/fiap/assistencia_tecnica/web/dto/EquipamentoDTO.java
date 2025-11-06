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

    //se não tiver com lombok ->
//    public Long getIdEquip() {
//        return idEquip;
//    }
//
//    public void setIdEquip(Long idEquip) {
//        this.idEquip = idEquip;
//    }
//
//    public Long getIdCliente() {
//        return idCliente;
//    }
//
//    public void setIdCliente(Long idCliente) {
//        this.idCliente = idCliente;
//    }
//
//    public String getTipo() {
//        return tipo;
//    }
//
//    public void setTipo(String tipo) {
//        this.tipo = tipo;
//    }
//
//    public String getMarca() {
//        return marca;
//    }
//
//    public void setMarca(String marca) {
//        this.marca = marca;
//    }
//
//    public String getModelo() {
//        return modelo;
//    }
//
//    public void setModelo(String modelo) {
//        this.modelo = modelo;
//    }
//
//    public String getNumeroSerie() {
//        return numeroSerie;
//    }
//
//    public void setNumeroSerie(String numeroSerie) {
//        this.numeroSerie = numeroSerie;
//    }
//
//    public LocalDate getDataCadastro() {
//        return dataCadastro;
//    }
//
//    public void setDataCadastro(LocalDate dataCadastro) {
//        this.dataCadastro = dataCadastro;
//    }
}
