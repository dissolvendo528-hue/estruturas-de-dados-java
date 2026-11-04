import java.util.Scanner;

public class MediaGeometrica {
    static double medGeo(double a, double b, double c) {
        return Math.pow(a * b * c, 1.0 / 3.0);
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        double a = teclado.nextDouble();

        System.out.println("Digite o segundo valor: ");
        double b = teclado.nextDouble();

        System.out.println("Digite o terceiro valor: ");
        double c = teclado.nextDouble();

        double resultado = medGeo(a, b, c);

        System.out.println("O resultado da média geométrica é: " + resultado);

        teclado.close();
    }
}