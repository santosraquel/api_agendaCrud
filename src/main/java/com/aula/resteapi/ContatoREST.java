package com.aula.resteapi;

import java.util.List;

import com.aula.resteapi.database.RepositorioContato;
import com.aula.resteapi.entidade.Contato;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/contato")
public class ContatoREST {
    @Autowired
    private RepositorioContato repositorio;

    // Consultar contato
    @GetMapping
    public List<Contato> listar() {
        return repositorio.findAll();
    }

    // Salvar contato
    @PostMapping
    public void salvar(@RequestBody Contato contato) {
        repositorio.save(contato);
    }

    // Alterar contato
    @PutMapping
    public void alterar(@RequestBody Contato contato) {
        if (contato.getId() > 0) {
            repositorio.save(contato);
        }
    }

    // Excluir contato
    @DeleteMapping
    public void excluir(@RequestBody Contato contato) {
        repositorio.delete(contato);
    }

}
