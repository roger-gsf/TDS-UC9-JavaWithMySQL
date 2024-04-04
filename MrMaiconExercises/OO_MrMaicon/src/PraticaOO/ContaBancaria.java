/*Exercício 1: Manipulação de Conta Bancária
Crie uma classe ContaBancaria com os atributos titular, saldo e numero conta. 
Crie métodos para depositar, sacar e exibir o saldo da conta.*/

package PraticaOO;

import java.util.Scanner;

public class ContaBancaria {

    private String titular;
    private double saldo;
    private int numeroConta;

    // Construtor
    public ContaBancaria(String titular, double saldoInicial, int numeroConta) {
        this.titular = titular;
        this.saldo = saldoInicial;
        this.numeroConta = numeroConta; 
    }

    // Método para depositar
    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito de R$" + valor + " realizado. Novo saldo: R$" + saldo);
    }

    // Método para sacar
    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido para saque.");
            return;
        }

        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado. Novo saldo: R$" + saldo);
        } else {
            System.out.println("Saldo insuficiente para realizar o saque de R$" + valor);
        }
    }

    // Método para exibir saldo
    public void exibirSaldo() {
        System.out.println("Saldo atual da conta de " + titular + ": R$" + saldo);
    }

    // Método principal para testar a classe
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nome do titular: ");
        String nomeTitular = sc.nextLine();

        System.out.println("Saldo inicial da conta: R$1000.00");
        System.out.println("Número da conta: 12345");

        System.out.println("Quanto você quer depositar?");
        double deposito = sc.nextDouble();

        System.out.println("Quanto você quer sacar?");
        double saque = sc.nextDouble();

        ContaBancaria minhaConta = new ContaBancaria(nomeTitular, 1000.0, 12345);
        minhaConta.depositar(deposito);
        minhaConta.sacar(saque);
        minhaConta.exibirSaldo();

        sc.close();
    }
}
