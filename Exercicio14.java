import java.util.Arrays;

public class Exercicio14 {
     public static void executar() {
        int[] vetor = new int[5];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = Prompt.lerInteiro("Digite o elemento " + (i + 1) + " do vetor:");
        }

        int indiceMaiorElemento = encontrarIndiceMaiorElemento(vetor);

        trocarMaiorElementoUltimaPosicao(vetor, indiceMaiorElemento);

        Prompt.imprimir("Vetor atualizado com o maior elemento na última posição:");
        Prompt.imprimir(Arrays.toString(vetor));
    }

    public static int encontrarIndiceMaiorElemento(int[] vetor) {
        int indiceMaiorElemento = 0;
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > vetor[indiceMaiorElemento]) {
                indiceMaiorElemento = i;
            }
        }
        return indiceMaiorElemento;
    }

    public static void trocarMaiorElementoUltimaPosicao(int[] vetor, int indiceMaiorElemento) {
        int temp = vetor[indiceMaiorElemento];
        vetor[indiceMaiorElemento] = vetor[vetor.length - 1];
        vetor[vetor.length - 1] = temp;
    }
}
