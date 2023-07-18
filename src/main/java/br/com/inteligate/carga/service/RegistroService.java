package br.com.inteligate.carga.service;

import br.com.inteligate.carga.model.Registro;
import br.com.inteligate.carga.repository.RegistroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class RegistroService {

    @Autowired
    RegistroRepository registroRepository;

    public Registro save(Registro registro){
        registro.setDataHora(LocalDateTime.now());
        return registroRepository.save(registro);
    }

    public Registro findByPlaca(String placa){
        return registroRepository.findById(placa).orElse(null);
    }

    public List<Registro> findAll(){
        return registroRepository.findAll();
    }

    void delete(String placa){
        registroRepository.deleteById(placa);
    }
}
