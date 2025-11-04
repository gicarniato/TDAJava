package estruturas;

public class Lista {
    private int[] numeros; // vetor que armazena os valores
    private int tamanho;   // quantidade atual de elementos na lista

    public Lista() {
        numeros = new int[5]; // lista comporta até 5 elementos
        tamanho = 0;          // começa vazia
    }

    public void inserir(int valor) {
        // insere o valor na próxima posição disponível
        if (tamanho < numeros.length) {
            numeros[tamanho] = valor;
            tamanho++;
            System.out.println("Valor " + valor + " inserido na lista.");
        } else {
            System.out.println("Lista cheia! Não é possível inserir mais elementos.");
        }
    }

    public void mostrar() {
        System.out.print("Lista: ");
        if (tamanho == 0) {
            System.out.println("vazia.");
        } else {
            for (int i = 0; i < tamanho; i++) {
                System.out.print(numeros[i] + " ");
            }
            System.out.println();
        }
    }
}
