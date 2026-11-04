# Estruturas de Dados em Java

Exercícios da disciplina de **Estrutura de Dados** do curso de Análise e Desenvolvimento de Sistemas (FATEC Jundiaí), organizados na ordem em que estudei cada assunto.

## Conteúdo

| Pasta | Assunto | Arquivos principais |
| --- | --- | --- |
| `01-fundamentos` | Métodos estáticos, entrada com `Scanner` e cálculos | `Fahrenheit`, `MediaGeometrica` |
| `02-tad-horario` | TAD com encapsulamento: atributos privados, construtor, getters/setters com validação e `toString` | `Horario`, `TestarHorario` |
| `03-pilha` | Pilha de inteiros em vetor (LIFO) e exercícios de aplicação | `PilhaInt`, `Ex01`–`Ex03` |
| `04-pilha-de-nomes` | Pilha de `String` e uso de pilha auxiliar para filtrar e manter a ordem | `PilhaString`, `Ex04RemoverNomesComVogal` |
| `05-fila` | Fila em vetor (FIFO), com deslocamento dos elementos na remoção | `FilaInt`, `FilaString`, `Ex01EnfileirarDezValores` |

## Como rodar

Cada pasta é independente. Entre na pasta, compile e rode a classe que tem o `main`:

```bash
cd 03-pilha
javac *.java
java Ex03OrdemDeEntrada
```

Requer Java 17 ou superior (desenvolvido com Java 21).
