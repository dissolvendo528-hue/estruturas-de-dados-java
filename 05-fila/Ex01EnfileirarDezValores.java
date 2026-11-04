// Criar nossa classe
import java.util.Scanner;
public class Ex01EnfileirarDezValores {
    public static void main(String[] a) {
        FilaInt fila = new FilaInt(10);
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite 10 número inteiros!");
        for (int i = 1; i <= 10; i++) {
            int valor = leitor.nextInt();
            fila.adicionar(valor);
        }
        System.out.println("Valores na fila: " + fila);
    }
}