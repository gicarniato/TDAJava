package estruturas;

public class Pilha {
    private int[] valores; // armazena os elementos empilhados
    private int topo;      // indica o índice do topo da pilha

    public Pilha() {
        valores = new int[5]; // pilha com até 5 posições
        topo = -1;            // começa vazia
    }

    public void empilhar(int numero) {
        // adiciona um elemento no topo da pilha
        if (topo < valores.length - 1) {
            topo++;
            valores[topo] = numero;
            System.out.println("Valor " + numero + " empilhado.");
        } else {
            System.out.println("Pilha cheia! Não é possível empilhar mais elementos.");
        }
    }

    public void desempilhar() {
        // remove o elemento do topo
        if (topo >= 0) {
            int removido = valores[topo];
            topo--;
            System.out.println("Valor " + removido + " desempilhado.");
        } else {
            System.out.println("Pilha vazia! Nada a desempilhar.");
        }
    }

    public void mostrar() {
        System.out.print("Pilha: ");
        if (topo == -1) {
            System.out.println("vazia.");
        } else {
            for (int i = topo; i >= 0; i--) {
                System.out.print(valores[i] + " ");
            }
            System.out.println();
        }
    }
}
