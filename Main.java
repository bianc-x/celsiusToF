/* Escreva um programa que, com base em uma temperatura em graus celsius
lida do teclado, a converta e a exiba em Fahrenheit (F), seguindo a fórmula:
F = C * 1.8 + 32 */

import java.util.Scanner;

public class Main {
     
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Insira o valor em Celsius: ");
        int C = teclado.nextInt();
        
        double F = C * 1.8 + 32;
        
        
        System.out.println("O valor em Fahrenheit eh: "+F);
    }
}