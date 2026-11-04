import java.util.Scanner;
public class Ex02PositivosNegativos {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);   

        PilhaInt positivos = new PilhaInt(10);
        PilhaInt negativos = new PilhaInt(10);

        int contador = 0;
        int numero;

        do {
            System.out.print("Digite um número (para sair digite 0): ");
            numero = leitor.nextInt();

            if (numero == 0) {
            
            } else if (numero > 0) {
                positivos.adicionar(numero);
            } else {
                negativos.adicionar(numero);
            }

            contador++;
        } while (numero != 0 && contador < 10);

        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);

        leitor.close();
    }
}