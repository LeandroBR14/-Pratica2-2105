/* Nome do Aluno: Leandro Scalabrini
* RA: 32318945
* Nome do Programa: 17. Faça um programa que imprima os múltiplos negativos de 7,
superiores a -1000. (utilize do / while)
* Data de entrega: 21/5/2023
*/

class Main {
    public static void main(String[] args) {
        int numero = 0;
        do {
            if (numero != -1000) {
                numero--;
            }
            if (numero % 7 == 0) {
                System.out.println(numero);
            }
        } while (numero > -1000);
    }
}