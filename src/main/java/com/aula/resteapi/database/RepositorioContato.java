package com.aula.resteapi.database;

import com.aula.resteapi.entidade.Contato;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioContato extends JpaRepository<Contato, Long> {

}
