# Minhas Músicas - Java

Projeto final desenvolvido durante o curso de **Orientação a Objetos em Java**, com o objetivo de aplicar na prática os principais conceitos de Programação Orientada a Objetos.

## Tecnologias

* Java
* IntelliJ IDEA
* Git
* GitHub

## Conceitos utilizados

* Programação Orientada a Objetos
* Encapsulamento
* Herança
* Polimorfismo
* Interfaces
* Sobrescrita de métodos
* Getters e Setters
* Modificadores de acesso

## Sobre o projeto

O projeto simula uma aplicação simples de gerenciamento de músicas e podcasts.

A aplicação permite:

* Criar músicas e podcasts;
* Armazenar informações sobre os áudios;
* Registrar reproduções e curtidas;
* Exibir informações dos áudios;
* Classificar músicas e podcasts de acordo com o número de reproduções;
* Adicionar faixas a uma playlist;
* Calcular a duração total da playlist;
* Filtrar conteúdos de acordo com sua classificação.

## Estrutura do projeto

### `Audio`

Superclasse responsável pelas características comuns entre músicas e podcasts, como título, duração, reproduções e curtidas.

### `Musica`

Subclasse de `Audio` que representa músicas, contendo informações como cantor, álbum e gênero.

### `Podcast`

Subclasse de `Audio` que representa podcasts, contendo informações como apresentador e descrição.

### `Playlist`

Responsável pelo gerenciamento das faixas adicionadas e pelo controle da quantidade de músicas e duração total.

### `Classificavel`

Interface utilizada para definir um comportamento de classificação que pode ser implementado por diferentes tipos de áudio.

### `FiltroRecomendacao`

Responsável por analisar a classificação dos conteúdos e exibir uma recomendação de acordo com sua popularidade.

### `Principal`

Classe responsável pela execução e demonstração das funcionalidades do projeto.

## Como executar

1. Clone este repositório.
2. Abra o projeto no IntelliJ IDEA.
3. Execute a classe `Principal`.
4. Observe no console as funcionalidades sendo executadas.

## Objetivo

Este projeto foi desenvolvido como forma de consolidar os conhecimentos adquiridos durante o estudo de **Programação Orientada a Objetos em Java**, servindo também como parte do meu portfólio de estudos e desenvolvimento na linguagem.

## Próximos passos

Pretendo evoluir o projeto conforme avanço nos estudos de Java, adicionando novos recursos e aplicando conceitos como persistência de dados, banco de dados e desenvolvimento de APIs.
