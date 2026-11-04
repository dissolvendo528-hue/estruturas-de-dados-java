import java.util.Scanner;
 
public class Ex01EmpilharDezValores {
    public static void main(String args[]) {
        Scanner leitor = new Scanner(System.in);
        PilhaInt pilha = new PilhaInt(10);
 
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o valor " + (i + 1) + ": ");
            int valor = leitor.nextInt();
            pilha.adicionar(valor);
        }
 
        System.out.println("Pilha com os 10 valores: " + pilha);
 
        leitor.close();
    }
}