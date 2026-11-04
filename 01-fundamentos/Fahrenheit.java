// Exercício de fahrenheit

import java.util.Scanner;
public class Fahrenheit {
    public static double fahrenheit(double celsius) {
        return (9 * celsius/5 + 32);
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);


        System.out.println("Digite a temperatura em Celsius para que seja feita a conversão em Fahrenheit: ");
        double celsius = teclado.nextDouble();

        System.out.println("Valor digitado foi: " + celsius);

        double temp_fahrenheit  = fahrenheit(celsius);

        System.out.println("Temperatura em Farhenheit: " + temp_fahrenheit);
    }
}