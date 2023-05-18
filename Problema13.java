/* Nome do Aluno: Leandro Scalabrini
* RA: 32318945
* Nome do Programa: 13. Faça um programa que some os números de 1 a 100 e imprima
somente o valor total da soma (utilize while).
* Data de entrega: 21/5/2023
*/

public class Problema13 {
    public static void main(String[] args) {
        int i = 0;
        int soma = 0;
        while (i <= 100) {
            soma += i;
            i++;
        }
        System.out.println("A soma dos números de 1 a 100 é: " + soma);
    }
}
