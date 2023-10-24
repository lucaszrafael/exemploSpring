package br.gov.sp.fatec.springboot3app.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.gov.sp.fatec.springboot3app.entity.Empregado;
import br.gov.sp.fatec.springboot3app.repository.EmpregadoRepository;

@Service
public class EmpregadoService {
    
    @Autowired
    private EmpregadoRepository empregadoRepo;

    public Empregado novoEmpregado(Empregado empregado) {
        empregado.setDataHoraCadastro(LocalDateTime.now());
        return empregadoRepo.save(empregado);
    }

    public List<Empregado> todosEmpregados() {
        return empregadoRepo.findAll();
    }

    public List<Empregado> findByCtpsOrEmail(Long ctps, String email) {
        return empregadoRepo.findByCtpsOrEmail(ctps, email);
    }

}
