public class App {
    public static void main(String[] args)  {
        System.out.println("Hello World!");
        System.out.println();
        
        int n1 = 10;
        System.out.println(n1);
        // escreva 3 formas de declarar um novo vetor 
        // 1
        int[] vetor1 = new int[5]; //criar um vetor vazio em Java, é necessário utilizar a palavra-chave new. Isso porque o new é responsável por alocar a memória necessária para o vetor
        // 2
        int vetor2[] = {1,2,3,4,5,6,7}; //criar um vetor já com valores
        System.out.println(vetor2[6]);
        // 3
        
        int matriz[][] = new int[2][2];
        int[][] matrizInicializada = {
            {1,2,3}, // linha 1
            {4,5,6}, // linha 2
            {7,8,9}
        };
        int[][] matrizInicializada2 = { {1,2,3}, {4,5,6}, {7,8,9} }; // cada { } representa uma linha

        // questao 1
        float[] values = {2,8,5,9,6};
        float sum = 0;
        float media;
        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }
        media = sum / values.length;
        System.out.println("a media é: "+ media);

    }
}
