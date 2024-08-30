package estrutura.de.dados;

public class atv2 {

    public static int[][] criarmatriz(int[] vetor1, int[] vetor2, int[] vetor3) {
        int[][] matriz = new int[8][3]; // matriz com 8 linhas e 3 colunas 

        for (int i = 0; i < 8; i++) { //atribui os valores para o vetor
            matriz[i][0] = vetor1[i];
            matriz[i][1] = vetor2[i];
            matriz[i][2] = vetor3[i];
        }
        return matriz;
    }

    public static void main(String[] args) {
        int[] vetor1 = {10, 20, 30, 40, 50, 60, 70, 80};
        int[] vetor2 = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] vetor3 = {11, 12, 13, 14, 15, 16, 17, 18};

        int[][] matriz = criarmatriz(vetor1, vetor2, vetor3); // chama o metodo passando os valores

        for (int i = 0; i < matriz.length; i++) { // percorre as linhas da matriz
            for (int j = 0; j < matriz[i].length; j++) { // percorre as colunas
                System.out.print(matriz[i][j] + " "); // imprime as linhas e colunas
            }
            System.out.println();
        }

    }
}
