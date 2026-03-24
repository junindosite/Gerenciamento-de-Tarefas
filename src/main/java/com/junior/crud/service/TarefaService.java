package com.junior.crud.service;

import com.junior.crud.entity.Tarefa;
import com.junior.crud.repository.TarefaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TarefaService {

    private final TarefaRepository repository;

    public TarefaService(TarefaRepository repository) {
        this.repository = repository;
    }

    public Tarefa salvar(Tarefa tarefa) {
        return repository.save(tarefa);
    }

    public List<Tarefa> listarTodos() {
        return repository.findAll();
    }

    public Tarefa buscarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Tarefa não encontrada"));
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}