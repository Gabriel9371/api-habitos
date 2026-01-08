package com.gabriel.api_habitos.controller;


import com.gabriel.api_habitos.entity.Habito;
import com.gabriel.api_habitos.service.HabitoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/habitos")
public class HabitoController {
    private final HabitoService service;

    public HabitoController(HabitoService service){
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<Habito> criar(@RequestBody Habito habito){
        Habito salvo = service.criar(habito);

        return ResponseEntity.ok(salvo);
    }

    @GetMapping
    public ResponseEntity<List<Habito>> listar(){
        return ResponseEntity.ok(service.listarTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Habito> buscarPorId(@PathVariable Long id){
        return service.buscarPorId(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }


    @PutMapping("/{id}")
    public ResponseEntity<Habito> atualizar(@PathVariable Long id, @RequestBody Habito habito){
        return service.atualizar(id, habito).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PatchMapping("/{id}/ativar")
    public ResponseEntity<Habito> ativar(@PathVariable Long id){
        return service.ativar(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Habito> deletar(@PathVariable Long id){
        if(service.desativar(id)){
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }


}
