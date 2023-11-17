### Fluxo Arquitetura Utilizando Recursos Similares a Confluent

## Project Arch
	- Project BackEnd: Spring Boot 3

## Owner
	- Carlos Roberto Medeiros de Lima
	
<p align="center">
  <img src= "https://github.com/CarlosRobertoMedeiros/revision-arch-kafka/blob/master/project-example/multi-cluster-example.png"/>
</p>

## Requirements
	- Docker
	- Para multi Cloud sugiro mudar a versão do control center pois expira em 30 dias

## Docker Implementation
   	
  Para carregar a estrutura sem multi cluster(Confluent Não Limita licença), execute:
    sh start-container-single-full.sh
  Para encerrar a estrutura, execute:
	sh stop-container-single-full.sh
	
  Para carregar a estrutura com multi cluster(Confluent Limita licença), execute:	
    sh start-container-multi.sh
  Para encerrar a estrutura, execute:
	sh stop-container-multi.sh
	
  Para acessar a IDE do Control-Center (* Não se esqueça da limitação da versão para Multi Cluster *)
  utilize: http://localhost:9021/ 
	
	
	

