#! /usr/bin/env bash
docker-compose -f C:/Desenvolvimento/sistemas/revsion-arch-kafka/infra/docker/stack-zk-single-kafka-multi.yaml down
docker-compose -f C:/Desenvolvimento/sistemas/revsion-arch-kafka/infra/docker/stack-zk-single-kafka-multi.yaml up -d
echo 'Stack MULTI started !'