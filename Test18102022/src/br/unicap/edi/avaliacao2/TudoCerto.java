package br.unicap.edi.avaliacao2;

import LimitedQueue.Queue;

public class TudoCerto {
    private Queue<Integer> senhas;
    private int ticket;

    public TudoCerto() {
        this.senhas = new Queue<>(25);
    }

    public Integer lastInLine() {
        if (!this.senhas.isEmpty()) {
            return this.ticket;
        }
        return null;
    }

    public Integer firstInLine() {
        if(!this.senhas.isEmpty()){
            return this.senhas.head();
        }
        return null;
    }

    public void newTicket() {
        if (this.senhas.isFull()) {
            System.out.println("Sala lotada. Aguarde o atendimento ficar disponível.");
        } else if (this.senhas.isEmpty()) {
            this.ticket++;
            senhas.enQueue(this.ticket);
            System.out.println("Não há pessoas na fila de espera. Dirija-se ao guichê. Ticket: " + this.ticket);
        } else {
            this.ticket++;
            senhas.enQueue(this.ticket);
            System.out.println("Aguarde o atendimento. Ticket: " + this.ticket);
        }
    }

    public void nextCustomer() {
        if (this.senhas.isEmpty()) {
            System.out.println("Não há ninguém na fila de espera");
        } else {
            this.senhas.deQueue();
            System.out.println("Volte sempre!");
        }
    }
}
