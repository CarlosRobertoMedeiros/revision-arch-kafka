package br.com.roberto.servicekafkaproducer.core.usecases;

import br.com.roberto.servicekafkaproducer.core.repositories.AlunoRepository;
import br.com.roberto.servicekafkaproducer.core.usecases.converter.AlunoConverter;
import br.com.roberto.servicekafkaproducer.transportlayer.dto.input.AlunoDtoRequest;
import org.springframework.stereotype.Service;

@Service
public class AlunoService {

    private final AlunoRepository alunoRepository;
    private final AlunoConverter alunoConverter;

    public AlunoService(AlunoRepository alunoRepository, AlunoConverter alunoConverter) {
        this.alunoRepository = alunoRepository;
        this.alunoConverter = alunoConverter;
    }

    public void incluir(AlunoDtoRequest alunoDtoRequest){
        alunoRepository.incluir(alunoConverter.converter(alunoDtoRequest));
    }


}
