/* Nome do Aluno: Leandro Scalabrini
* RA: 32318945
* Nome do Programa: 11. Faça um programa que imprima todos os números pares de 1
a 100 na ordem inversa
* Data de entrega: 21/5/2023
*/

class Problema11 {
    public static void main(String[] args) {
        System.out.print("Segue todos os números pares de 1 a 100 na ordem inversa: ");
        for (int i = 100; i >=1; i--) {
            if (i % 2 == 0) {
                System.out.print(i + ", ");
            }
        }
    }
}
