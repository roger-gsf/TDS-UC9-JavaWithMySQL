/*Exercício 4: Manipulação de Carros
Crie uma classe Carro com os atributos marca, modelo e ano.
Crie métodos para exibir as informações do carro e atualizar o ano.*/
package PraticaOO;

import java.util.Scanner;

public class Carros {

    private String marca;
    private String modelo;
    private int ano;

    public Carros(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public void exibirInfo() {
        System.out.println("Informações sobre o carro: ");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
    }

    public void atualizarAno(int novoAno) {
        this.ano = novoAno;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a marca do carro: ");
        String marca = sc.next();

        System.out.println("Informe o modelo do carro: ");
        String modelo = sc.next();

        System.out.println("Informe o ano do carro: ");
        int ano = sc.nextInt();

        Carros novoCarro = new Carros(marca, modelo, ano);
        novoCarro.exibirInfo();

        System.out.println("Informe um novo ano para o carro: ");
        int novoAno = sc.nextInt();
        novoCarro.atualizarAno(novoAno);

        System.out.println("\nO ano do carro " + marca + " " + modelo + " foi atualizado: " + novoAno);
        sc.close(); 
    }
}
