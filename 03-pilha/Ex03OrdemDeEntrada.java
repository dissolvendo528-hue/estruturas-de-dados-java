import java.util.Scanner;
public class Ex03OrdemDeEntrada {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        PilhaInt pilha2 = new PilhaInt(10);
        PilhaInt auxiliar = new PilhaInt(10);

        System.out.println("Digite 10 números inteiros.");
        for (int i = 0; i < 10; i++) {
            int numero = leitor.nextInt();
            pilha2.adicionar(numero);
        }

        while (!pilha2.vazia()) {
            auxiliar.adicionar(pilha2.remover());
        }

        System.out.println("Ordem de entrada!");
        while (!auxiliar.vazia()) {
            System.out.println(auxiliar.remover() + ""); // Enquanto houver elementos, retire o elemento do topo e mostre-o.
        }
    }
}