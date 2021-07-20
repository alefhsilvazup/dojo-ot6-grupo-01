package br.com.zupedu.dojo.ot4dojo.criarturma.repository;

import br.com.zupedu.dojo.ot4dojo.criarturma.controller.model.Turma;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TurmaRepository extends JpaRepository<Turma, Long> {
}
