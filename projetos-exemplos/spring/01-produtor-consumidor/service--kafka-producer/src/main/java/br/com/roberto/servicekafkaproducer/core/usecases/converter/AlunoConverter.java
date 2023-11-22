package br.com.roberto.servicekafkaproducer.core.usecases.converter;


import br.com.roberto.servicekafkaproducer.core.entities.Aluno;
import br.com.roberto.servicekafkaproducer.transportlayer.dto.input.AlunoDtoRequest;
import org.springframework.stereotype.Service;

@Service
public class AlunoConverter {

    public Aluno converter(AlunoDtoRequest alunoDtoRequest){
        var aluno = new Aluno();
        aluno.setNome(alunoDtoRequest.getNome());
        aluno.setSobrenome(alunoDtoRequest.getSobrenome());
        return aluno;
    }


}
