## Sobre o projeto

Este projeto foi desenvolvido como parte de um teste técnico para vaga de estágio.

A solução foi implementada em Java, conforme solicitado no desafio.

Adicionalmente, implementei a mesma lógica em C#, linguagem na qual possuo maior domínio, com o objetivo de:

- Demonstrar adaptação entre linguagens
- Evidenciar domínio de lógica de programação
- Comparar abordagens estruturais entre Java e C#

Ambas as versões resolvem o mesmo problema e apresentam o mesmo comportamento.

## Funcionalidades

- Cadastro de alunos
- Inserção de 5 notas por aluno
- Cálculo da média individual
- Cálculo da média da turma por disciplina
- Identificação de alunos acima da média da turma
- Identificação de alunos com frequência abaixo de 75%

## Como executar

1. Executando a versão em Java

- Pré-requisito
Java JDK instalado

- No terminal:
cd java_app
javac Main.java
java Main


2. Executando a versão em C#

- Pré-requisito
.NET SDK instalado

- No terminal:
cd csharp
dotnet run

## Premissas assumidas

- Cada aluno possui 5 disciplinas
- Notas variam de 0 a 10
- Frequência varia de 0 a 100%
- A quantidade de alunos é definida pelo usuário

## Decisões de projeto

- Implementação estruturada sem uso de classes (foco em lógica)
- Uso de arrays para armazenamento
- Separação por linguagem em pastas distintas
- Código organizado para fácil leitura e manutenção

## Melhorias futuras

O enunciado mencionava como desejável a implementação de um front-end (ex.: React).
Optei por priorizar a entrega correta e bem documentada da lógica e dos cálculos no prazo, garantindo que a solução em Java (requisito) e a versão adicional em C# funcionem via terminal.

Como evolução futura, seria possível criar uma interface web (React ou HTML/CSS/JS) consumindo uma API para:
- cadastro de alunos via formulário
- exibição das médias e da média por disciplina
- listas de alunos acima da média e com frequência abaixo de 75%

## Considerações finais

O foco do projeto foi demonstrar domínio em lógica de programação, clareza no código e organização, priorizando uma solução simples e eficiente.
