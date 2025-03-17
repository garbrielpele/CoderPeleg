package Concesionaria.PROYF.Pelegrina.Service;

import org.springframework.stereotype.Service;
import Concesionaria.PROYF.Pelegrina.Repository.ConcesionariaRepository;
import Concesionaria.PROYF.Pelegrina.Repository.MotoRepository;
import Concesionaria.PROYF.Pelegrina.model.Concesionaria;
import Concesionaria.PROYF.Pelegrina.model.Moto;
import lombok.Data;

import java.util.List;
@Data
@Service
public class ConcesionariaService {
    private final ConcesionariaRepository concesionariaRepository;
    private final MotoRepository motoRepository;

    public ConcesionariaService(ConcesionariaRepository concesionariaRepository, MotoRepository motoRepository) {
        this.concesionariaRepository = concesionariaRepository;
        this.motoRepository = motoRepository;
    }

    public List<Concesionaria> obtenerTodas() {
        return concesionariaRepository.findAll();
    }

    public void agregarMoto(Long concesionariaId, Moto moto) {
        Concesionaria concesionaria = concesionariaRepository.findById(concesionariaId).orElseThrow();
        moto.setConcesionaria(concesionaria);
        motoRepository.save(moto);
    }
    public Concesionaria guardarConcesionaria(Concesionaria concesionaria) {
        return concesionariaRepository.save(concesionaria);
    
    moto.setConcesionaria(concesionaria);
    concesionaria.getMotosEnStock().add(moto); 

    return concesionariaRepository.save(concesionaria);

}

}

