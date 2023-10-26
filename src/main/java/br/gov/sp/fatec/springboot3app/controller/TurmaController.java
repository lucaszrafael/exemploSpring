package br.gov.sp.fatec.springboot3app.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.gov.sp.fatec.springboot3app.entity.Turma;
import br.gov.sp.fatec.springboot3app.service.TurmaService;

@RestController
@RequestMapping(value = "/turma")
@CrossOrigin
public class TurmaController {

    @Autowired
    private TurmaService service;

    @GetMapping
    public List<Turma> todosTurmas() {
        return service.todosTurmas();
    }

    @PostMapping
    public Turma novoTurma(@RequestBody Turma turma) {
        return service.novoTurma(turma);
    }

    @GetMapping(value = "/{ano}/{tamanho}")
    public List<Turma> buscarPorAnoETamanho(@PathVariable("ano") Integer ano, @PathVariable("tamanho") Integer tamanho) {
        return service.buscarPorAnoETamanho(ano, tamanho);
    }

    
}
