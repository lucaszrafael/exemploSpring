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

import br.gov.sp.fatec.springboot3app.entity.Empregado;
import br.gov.sp.fatec.springboot3app.entity.Usuario;
import br.gov.sp.fatec.springboot3app.entity.Vocabulo;
import br.gov.sp.fatec.springboot3app.service.EmpregadoService;
import br.gov.sp.fatec.springboot3app.service.IUsuarioService;
import br.gov.sp.fatec.springboot3app.service.VocabuloService;

@RestController
@RequestMapping(value = "/empregado")
@CrossOrigin
public class EmpregadoController {

    @Autowired
    private EmpregadoService service;

    @GetMapping
    public List<Empregado> todosEmpregados() {
        return service.todosEmpregados();
    }

    @PostMapping
    public Empregado novoEmpregado(@RequestBody Empregado empregado) {
        return service.novoEmpregado(empregado);
    }

    @GetMapping(value = "/{ctps}/{email}")
    public List<Empregado> findByCtpsOrEmail(@PathVariable("ctps") Long ctps, @PathVariable("email") String email) {
        return service.findByCtpsOrEmail(ctps, email);
    }

    
}
