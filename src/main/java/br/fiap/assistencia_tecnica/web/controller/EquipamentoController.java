package br.fiap.assistencia_tecnica.web.controller;

import br.fiap.assistencia_tecnica.domain.Equipamento;
import br.fiap.assistencia_tecnica.service.EquipamentoService;
import br.fiap.assistencia_tecnica.web.dto.EquipamentoDTO;
import jakarta.persistence.Column;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/equipamento")
public class EquipamentoController {

    private final EquipamentoService service;

    public EquipamentoController(EquipamentoService service) {
        this.service = service;
    }

    @PostMapping
    public Equipamento cadastrar(@RequestBody EquipamentoDTO equipamentoDTO){

        return service.cadastrar(equipamentoDTO);
    }


}
