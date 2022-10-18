package br.unicap.edi.avaliacao2;

import java.util.Scanner;

public class Service {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        TudoCerto loja = new TudoCerto();

        int op;
        do {
            System.out.println("Escolha a opção");
            showMenu();
            op = Integer.parseInt(s.nextLine());
            switch (op) {
                case 0:
                    System.out.println("FIM!");
                    break;
                case 1:
                    loja.newTicket();
                    break;
                case 2:
                    loja.nextCustomer();
                    break;
                case 3:
                    if (loja.firstInLine() != null) {

                        System.out.println("Primeiro ticket da fila: " + loja.firstInLine());
                    } else {
                        System.out.println("Não há ninguem na fila!");
                    }
                    break;
                case 4:
                    if (loja.lastInLine() != null) {

                        System.out.println("Ultimo ticket da fila: " + loja.lastInLine());
                    } else {
                        System.out.println("Não há ninguem na fila!");
                    }
                    break;
                default:
                    System.out.println("Opção inálida");
                    break;
            }

        } while (op != 0);
    }

    public static void showMenu() {
        System.out.println("1 - Solicitar senha");
        System.out.println("2 - Próximo cliente");
        System.out.println("3 - Primeiro da fila");
        System.out.println("4 - Último da fila");
        System.out.println("0 - Encerrar");
    }

}
