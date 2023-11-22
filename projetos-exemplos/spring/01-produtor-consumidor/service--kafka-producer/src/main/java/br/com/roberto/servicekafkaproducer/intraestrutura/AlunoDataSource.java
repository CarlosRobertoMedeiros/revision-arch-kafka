package br.com.roberto.servicekafkaproducer.intraestrutura;

import br.com.roberto.servicekafkaproducer.core.entities.Aluno;
import br.com.roberto.servicekafkaproducer.core.repositories.AlunoRepository;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class AlunoDataSource implements AlunoRepository {

    private final KafkaTemplate<String, Aluno> kafkaAlunoTemplate;

    public AlunoDataSource(KafkaTemplate<String, Aluno> kafkaAlunoTemplate) {
        this.kafkaAlunoTemplate = kafkaAlunoTemplate;
    }



    @Override
    public void incluir(Aluno aluno) {
        kafkaAlunoTemplate.send("tp_inserir_aluno",aluno);
    }
}
