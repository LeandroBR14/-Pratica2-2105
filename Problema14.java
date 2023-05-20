/* Nome do Aluno: Leandro Scalabrini
* RA: 32318945
* Nome do Programa: 14. Faça um programa que preencha com zeros todas as posições
de um vetor de tamanho 50
* Data de entrega: 21/5/2023
*/

class Problema14 {
    public static void main(String[] args) {
        int[] vetor = new int[50];
        int preencherCom = 0;
        int i;
        for (i=0; i<50; i++) {
            vetor[i] = preencherCom;
        }
        for (i=0; i<50; i++) { // para verificar se todos vetores foram preenchidos com 0
            System.out.print(vetor[i] + " ");
        }
    } 
}
