import java.util.Scanner; 

public class Ex04RemoverNomesComVogal {
    public static void main(String[] args) {
        PilhaString pilhaOriginal = new PilhaString(10);
        Scanner teclado = new Scanner(System.in);

        int contadorRemovidos = 0;
        int contadorNomes = 0;

        // Bloco A: Entrada de dados com suporte a nomes com espaços (nextLine)
        System.out.println("--- ENTRADA DE DADOS ---");
        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o nome n°" + i + ": ");
            String nome = teclado.nextLine(); 
            pilhaOriginal.adicionar(nome);
        }

        System.out.println("\nPilha original preenchida -> " + pilhaOriginal);

        // Bloco B: Criação da pilha auxiliar e filtragem dos nomes iniciados por vogal
        PilhaString pilhaAuxiliar = new PilhaString(10);

        while (!pilhaOriginal.vazia()) {
            String nomeAtual = pilhaOriginal.remover();
            char primeiraLetra = Character.toUpperCase(nomeAtual.charAt(0));
            
            // Se NÃO começar com vogal, guarda na pilha auxiliar
            if (primeiraLetra != 'A' && primeiraLetra != 'E' && primeiraLetra != 'I' && 
                primeiraLetra != 'O' && primeiraLetra != 'U') {
                pilhaAuxiliar.adicionar(nomeAtual);
                contadorNomes++;
            } else {
                System.out.println("-> Removido por começar com vogal: " + nomeAtual);
                contadorRemovidos++;
            }
        }

        // Bloco C: Devolve os elementos para a pilha original restaurando a ordem correta
        while (!pilhaAuxiliar.vazia()) {
            pilhaOriginal.adicionar(pilhaAuxiliar.remover());
        }

        System.out.println("\n--- RESULTADO FINAL APÓS A FILTRAGEM ---");
        System.out.println("Pilha original sem vogais -> " + pilhaOriginal);
        System.out.println("Quantidade de nomes que saíram: " + contadorRemovidos);
        System.out.println("Quantidade de nomes que ficaram: " + contadorNomes);

        teclado.close();
    }
}