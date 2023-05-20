/* Nome do Aluno: Leandro Scalabrini
* RA: 32318945
* Nome do Programa: 21. Escreva um programa que, dado um número positivo digitado
pelo o usuário mostre a tabuada de todos os números de 1 até o
número digitado. (utilize for)
* Data de entrega: 21/5/2023
*/

import java.util.Scanner;

public class Problema21 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um número positivo para mostrar a tabela de multiplicação: ");
        int numero = teclado.nextInt();
        System.out.println("Tabela de multiplicação do número " + numero + ":");

        for (int i = 1; i <= numero; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            System.out.println();
        }
        teclado.close();
    }
}