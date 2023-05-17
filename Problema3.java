/* Nome do Aluno: Leandro Scalabrini
* RA: 32318945
* Nome do Programa: 3. Elabore um programa que lê dois valores A e B e os escreve com
a mensagem: “São múltiplos” ou “Não são múltiplos”.
* Data de entrega: 21/5/2023
*/

import java.util.Scanner;

class Problema3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um primeiro número: ");
        int a = teclado.nextInt();

        System.out.print("Digite um segundo número: ");
        int b = teclado.nextInt();

        if (a % b == 0 || b % a == 0) {
            System.out.println("São múltiplos");
        } else {
            System.out.println("Não são múltiplos");
        }
    }
}
