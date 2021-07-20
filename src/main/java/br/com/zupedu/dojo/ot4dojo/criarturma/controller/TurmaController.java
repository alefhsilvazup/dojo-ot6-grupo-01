package br.com.zupedu.dojo.ot4dojo.criarturma.controller;

import br.com.zupedu.dojo.ot4dojo.criarturma.controller.model.Turma;
import br.com.zupedu.dojo.ot4dojo.criarturma.repository.TurmaRepository;
import br.com.zupedu.dojo.ot4dojo.criarturma.request.TurmaRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

import javax.validation.Valid;

@RestController
@RequestMapping("/turmas")
public class TurmaController {

    @Autowired
    TurmaRepository turmaRepository;

    @PostMapping
    public ResponseEntity<?> cadastraTurma(@RequestBody @Valid TurmaRequest turmaRequest) {
        Turma turma = turmaRequest.toModel();
        
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(turma.getId()).toUri(); 

        //System.out.println(turmaRequest.toString());
        return ResponseEntity.created(uri).body(null);

    }
}
