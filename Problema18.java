/* Nome do Aluno: Leandro Scalabrini
* RA: 32318945
* Nome do Programa: 18. Faça um programa que determine o fatorial de um número.
Para este problema, tem-se como entrada o valor do número do
qual se deseja calcular o fatorial. O fatorial de 0 é igual a
1. O fatorial de um número N (N!) é definido conforme a seguir
(utilize for):
N! = 1 * 2 * 3 * 4 * ... * (N-1) * N
* Data de entrega: 21/5/2023
*/

import java.util.Scanner;
class Problema18{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um número qualquer: ");
        int n = teclado.nextInt();
        teclado.close();
        int fatorial = 1;
        int i;
        for (i = 1; i <= n; i = i + 1) {
            fatorial = fatorial * i;
        }
        System.out.println("O fatorial desse número é: " +fatorial);
    }
}