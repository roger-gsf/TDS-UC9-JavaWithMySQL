package PraticaOO;

import java.util.Scanner;

public class Pessoas {

    private String nome;
    private int idade;
    private String cidade;

    public Pessoas(String nome, int idade, String cidade) {
        this.nome = nome;
        this.idade = idade;
        this.cidade = cidade;
    }

    public void exibirInfo() {
        System.out.println("Informações sobre a pessoa: ");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Cidade: " + cidade);
    }

    public void atualizarIdade(int novaIdade) {
        this.idade = novaIdade;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o nome da pessoa: ");
        String nome = sc.next();

        System.out.println("Informe a idade da pessoa: ");
        int idade = sc.nextInt();

        System.out.println("Informe a cidade da pessoa: ");
        String cidade = sc.next();

        Pessoas novaPessoa = new Pessoas(nome, idade, cidade);
        novaPessoa.exibirInfo();

        System.out.println("Informe uma nova idade para a pessoa: ");
        int novaIdade = sc.nextInt();
        novaPessoa.atualizarIdade(novaIdade);

        System.out.println("\nIdade de " + nome + " atualizada: " + novaIdade + " anos.");
        sc.close();
    }
}
