package estruturas;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Lista lista = new Lista();
        Pilha pilha = new Pilha();
        Fila fila = new Fila();

        int opcao;

        do {
            System.out.println("\n========= MENU =========");
            System.out.println("1 - Inserir na Lista");
            System.out.println("2 - Mostrar Lista");
            System.out.println("3 - Empilhar");
            System.out.println("4 - Desempilhar");
            System.out.println("5 - Mostrar Pilha");
            System.out.println("6 - Enfileirar");
            System.out.println("7 - Desenfileirar");
            System.out.println("8 - Mostrar Fila");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o número para inserir na lista: ");
                    lista.inserir(entrada.nextInt());
                    break;
                case 2:
                    lista.mostrar();
                    break;
                case 3:
                    System.out.print("Digite o número para empilhar: ");
                    pilha.empilhar(entrada.nextInt());
                    break;
                case 4:
                    pilha.desempilhar();
                    break;
                case 5:
                    pilha.mostrar();
                    break;
                case 6:
                    System.out.print("Digite o número para enfileirar: ");
                    fila.enfileirar(entrada.nextInt());
                    break;
                case 7:
                    fila.desenfileirar();
                    break;
                case 8:
                    fila.mostrar();
                    break;
                case 0:
                    System.out.println("Encerrando o programa... até mais!");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
            }

        } while (opcao != 0);

        entrada.close();
    }
}
