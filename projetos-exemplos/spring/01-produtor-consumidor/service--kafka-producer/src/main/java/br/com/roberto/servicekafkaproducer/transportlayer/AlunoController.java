package br.com.roberto.servicekafkaproducer.transportlayer;

import br.com.roberto.servicekafkaproducer.core.usecases.AlunoService;
import br.com.roberto.servicekafkaproducer.transportlayer.dto.input.AlunoDtoRequest;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/alunos")
public class AlunoController {

    private final AlunoService alunoService;

    public AlunoController(AlunoService alunoService) {
        this.alunoService = alunoService;
    }

    @PostMapping(value = "/aluno", produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<Void> incluirAluno(@RequestBody AlunoDtoRequest aluno){
        try {
            alunoService.incluir(aluno);
        }catch (Exception e){
            //Colocar o log
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().build();
    }
}
