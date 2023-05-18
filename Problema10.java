/* Nome do Aluno: Leandro Scalabrini
* RA: 32318945
* Nome do Programa: 10. Faça um programa que imprima todos os números pares de 1
a 100
* Data de entrega: 21/5/2023
*/

class Problema10 {
    public static void main(String[] args) {
        System.out.print("Segue todos os números pares de 1 a 100: ");
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + ", ");
            }
        }
    }
}