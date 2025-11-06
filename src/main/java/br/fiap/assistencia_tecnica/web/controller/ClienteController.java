package br.fiap.assistencia_tecnica.web.controller;

import br.fiap.assistencia_tecnica.domain.Cliente;
import br.fiap.assistencia_tecnica.domain.Equipamento;
import br.fiap.assistencia_tecnica.service.ClienteService;
import br.fiap.assistencia_tecnica.web.dto.ClienteDTO;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    private final ClienteService service;

    public ClienteController(ClienteService service) {
        this.service = service;
    }

    @PostMapping
    public Cliente cadastrar(@RequestBody ClienteDTO clienteDTO){
        return service.cadastrar(clienteDTO);
    }

    //listar
    @GetMapping
    public List<Cliente> listar(){

        return service.listar(); //manda pro service
    }

    @GetMapping("/{id}")
    public Cliente buscarPorId(@PathVariable Long id){

        return service.buscarPorId(id);
    }

    @GetMapping("/{idEquip}/equipamento")
    public List<Equipamento> listarEquipamentoPorCliente(@PathVariable Long id){
        return service.listarEquipamentoPorCliente(id);
    }
}
