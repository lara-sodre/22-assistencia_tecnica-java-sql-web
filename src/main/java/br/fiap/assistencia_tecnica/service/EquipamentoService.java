package br.fiap.assistencia_tecnica.service;

import br.fiap.assistencia_tecnica.domain.Equipamento;
import br.fiap.assistencia_tecnica.repository.ClienteRepository;
import br.fiap.assistencia_tecnica.repository.EquipamentoRepository;
import br.fiap.assistencia_tecnica.web.dto.EquipamentoDTO;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class EquipamentoService {

    private final ClienteRepository clienteRepository;
    private final EquipamentoRepository equipamentoRepository;

    public EquipamentoService(ClienteRepository clienteRepository, EquipamentoRepository equipamentoRepository) {
        this.clienteRepository = clienteRepository;
        this.equipamentoRepository = equipamentoRepository;
    }

    public Equipamento cadastrar(EquipamentoDTO dto){

        var cliente = clienteRepository.findById(dto.getIdCliente())
                .orElseThrow(() -> new NoSuchElementException("Cliente não foi encontrado!"));

        var equipamentoEntity = new Equipamento();
        equipamentoEntity.setId_cliente(cliente);
        equipamentoEntity.setMarca(dto.getMarca());
        equipamentoEntity.setTipo(dto.getTipo());
        equipamentoEntity.setModelo(dto.getModelo());
        equipamentoEntity.setNumero_serie(dto.getNumeroSerie());
        equipamentoEntity.setData_cadastro(dto.getDataCadastro());

        return equipamentoRepository.save(equipamentoEntity);
    }

}
