package br.com.roberto.servicekafkaproducer.transportlayer;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/alunos")
public class AlunoController {

    @PostMapping(value = "/aluno", produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<Void> incluirAluno(@PathVariable Aluno aluno){


        return ResponseEntity.notFound().build();

    }
}
