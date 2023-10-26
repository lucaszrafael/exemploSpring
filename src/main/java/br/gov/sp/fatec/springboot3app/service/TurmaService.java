package br.gov.sp.fatec.springboot3app.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.gov.sp.fatec.springboot3app.entity.Turma;
import br.gov.sp.fatec.springboot3app.repository.TurmaRepository;

@Service
public class TurmaService {
    
    @Autowired
    private TurmaRepository turmaRepo;

    public Turma novoTurma(Turma turma) {
        turma.setDataHoraCadastro(LocalDateTime.now());
        return turmaRepo.save(turma);
    }

    public List<Turma> todosTurmas() {
        return turmaRepo.findAll();
    }

    public List<Turma> buscarPorAnoETamanho(Integer ano, Integer tamanho) {
        return turmaRepo.findTurmaByAnoEqualsAndTamanhoLessThan(ano, tamanho);
    }

}
