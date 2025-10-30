package br.fiap.assistencia_tecnica.service;

import br.fiap.assistencia_tecnica.domain.Equipamento;
import br.fiap.assistencia_tecnica.repository.ClienteRepository;
import br.fiap.assistencia_tecnica.web.dto.EquipamentoDTO;
import org.springframework.stereotype.Service;

@Service
public class EquipamentoService {

    private final ClienteRepository clienteRepository;

    public EquipamentoService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public Equipamento cadastrar(EquipamentoDTO equipamentoDTO){

    }

}
