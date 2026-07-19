package com.javanauta.projetoAgendadorDeTarefas.cadastroUsuario.infrastructure.repository;


import com.javanauta.projetoAgendadorDeTarefas.cadastroUsuario.infrastructure.entity.Telefone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TelefoneRepository extends JpaRepository<Telefone, Long> {
}
