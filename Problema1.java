/* Nome do Aluno: Leandro Scalabrini
* RA: 32318945
* Nome do Programa: 1. Faça um programa que leia dois números A e B e imprima o maior
deles.
* Data de entrega: 21/5/2023
*/

import java.util.Scanner;
class Problema1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe um primeiro número: ");
        double n1 = teclado.nextDouble();
        System.out.print("Informe um segundo número: ");
        double n2 = teclado.nextDouble();

        if (n1 > n2) {
            System.out.println(n1);
        } else if (n2 > n1) {
            System.out.println(n2);
        } else if (n1 == n2) {
            System.out.println("Os números são iguais.");
        }
        teclado.close();
    }
}