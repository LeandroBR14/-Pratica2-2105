/* Nome do Aluno: Leandro Scalabrini
* RA: 32318945
* Nome do Programa: 12. Faça um programa que exiba todos os números pares a
partir de 0 até que encontre um múltiplo de 7 (utilize
do/while)
* Data de entrega: 21/5/2023
*/

public class Problema12 {
    public static void main(String[] args) {
        int n = 0;
        do {
            if (n % 2 == 0) {
                System.out.println(n);
            }
            n++;
        } while (n % 7 != 0);
    }
}
