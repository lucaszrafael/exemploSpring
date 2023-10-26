package br.gov.sp.fatec.springboot3app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.gov.sp.fatec.springboot3app.entity.Turma;

public interface TurmaRepository extends JpaRepository<Turma, Long> {
    @Query("SELECT t FROM Turma t WHERE t.ano = :ano AND t.tamanho < :tamanho")
    List<Turma> findTurmaByAnoEqualsAndTamanhoLessThan(Integer ano, Integer tamanho);
}