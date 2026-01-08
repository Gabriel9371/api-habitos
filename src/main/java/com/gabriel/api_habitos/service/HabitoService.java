package com.gabriel.api_habitos.service;


import com.gabriel.api_habitos.entity.Habito;
import com.gabriel.api_habitos.repository.HabitoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HabitoService {

    private final HabitoRepository repository;

    public HabitoService(HabitoRepository repository){
        this.repository = repository;
    }

    public Habito criar(Habito habito) {
        return repository.save(habito);
    }

    public List<Habito> listarTodos(){
        return repository.findAll();
    }

    public Optional<Habito> buscarPorId(Long id){
        return repository.findById(id);
    }

    public void deletar(Long id){
        repository.deleteById(id);
    }
}
