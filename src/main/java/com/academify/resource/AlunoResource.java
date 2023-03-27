package com.academify.resource;

import com.academify.model.Aluno;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping(value = "/api/aluno")
public class AlunoResource {

    @GetMapping("/list")
    public List<Aluno> list() {
        List<Aluno> alunos = new ArrayList<Aluno>();

        Aluno a1 = new Aluno();
        a1.setId(1);
        a1.setMatricula("123");
        a1.setNome("Katherine");
        a1.setNascimento(new Date());
        a1.setDataHoraCadastro(new Date());

        Aluno a2 = new Aluno();
        a2.setId(2);
        a2.setMatricula("456");
        a2.setNome("Natan");
        a2.setNascimento(new Date());
        a2.setDataHoraCadastro(new Date());

        alunos.add(a1);
        alunos.add(a2);
        return alunos;
    }

}
