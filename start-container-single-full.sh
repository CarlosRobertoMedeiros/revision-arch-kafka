#! /usr/bin/env bash
docker-compose -f C:/Desenvolvimento/sistemas/revsion-arch-kafka/infra/docker/stack-all-in-one-single.yaml down
docker-compose -f C:/Desenvolvimento/sistemas/revsion-arch-kafka/infra/docker/stack-all-in-one-single.yaml up -d
echo 'Stack SINGLE started !'