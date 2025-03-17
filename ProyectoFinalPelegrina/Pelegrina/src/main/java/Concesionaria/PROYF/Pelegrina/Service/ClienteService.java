package Concesionaria.PROYF.Pelegrina.Service;

import org.springframework.stereotype.Service;
import Concesionaria.PROYF.Pelegrina.Repository.ClienteRepository;
import Concesionaria.PROYF.Pelegrina.Repository.MotoRepository;
import Concesionaria.PROYF.Pelegrina.model.Cliente;
import Concesionaria.PROYF.Pelegrina.model.Moto;

import java.util.List;

@Service
public class ClienteService {
    private final ClienteRepository clienteRepository;
    private final MotoRepository motoRepository;

    public ClienteService(ClienteRepository clienteRepository, MotoRepository motoRepository) {
        this.clienteRepository = clienteRepository;
        this.motoRepository = motoRepository;
    }

    public Cliente obtenerCliente(Long id) {
        return clienteRepository.findById(id).orElseThrow();
    }

    public void agregarMoto(Long clienteId, Long motoId) {
        Cliente cliente = clienteRepository.findById(clienteId).orElseThrow();
        Moto moto = motoRepository.findById(motoId).orElseThrow();
        moto.setCliente(cliente);
        motoRepository.save(moto);
    }
}
