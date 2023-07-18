package br.com.inteligate.carga.controller;

import br.com.inteligate.carga.model.Registro;
import br.com.inteligate.carga.service.RegistroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/registro")
public class Controller {
    @Autowired
    RegistroService registroService;

    @PostMapping
    public Registro criarRegistro(@RequestBody Registro registro){
        return registroService.save(registro);
    }

    @GetMapping
    public List<Registro> findAll(){
        return registroService.findAll();
    }

    @GetMapping("/{placa}")
    public Registro findByPlaca(@PathVariable("placa") String placa){
        return registroService.findByPlaca(placa);
    }
}
