package estruturas;

public class Fila {
    private int[] fila;   // vetor para armazenar os elementos
    private int inicio;   // posição do primeiro elemento
    private int fim;      // posição de inserção do próximo elemento
    private int tamanho;  // quantidade atual de elementos na fila

    public Fila() {
        fila = new int[5]; // fila com capacidade para 5 elementos
        inicio = 0;
        fim = 0;
        tamanho = 0;
    }

    public void enfileirar(int valor) {
        // adiciona um elemento no fim da fila
        if (tamanho < fila.length) {
            fila[fim] = valor;
            fim = (fim + 1) % fila.length; // movimento circular
            tamanho++;
            System.out.println("Valor " + valor + " enfileirado.");
        } else {
            System.out.println("Fila cheia! Não é possível enfileirar mais elementos.");
        }
    }

    public void desenfileirar() {
        // remove o primeiro elemento da fila
        if (tamanho > 0) {
            int removido = fila[inicio];
            inicio = (inicio + 1) % fila.length;
            tamanho--;
            System.out.println("Valor " + removido + " desenfileirado.");
        } else {
            System.out.println("Fila vazia! Nada a desenfileirar.");
        }
    }

    public void mostrar() {
        System.out.print("Fila: ");
        if (tamanho == 0) {
            System.out.println("vazia.");
        } else {
            int i = inicio;
            for (int cont = 0; cont < tamanho; cont++) {
                System.out.print(fila[i] + " ");
                i = (i + 1) % fila.length;
            }
            System.out.println();
        }
    }
}
