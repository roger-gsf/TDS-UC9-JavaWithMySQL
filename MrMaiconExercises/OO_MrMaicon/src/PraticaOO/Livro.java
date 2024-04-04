/*Exercício 2: Manipulação de Livros
Crie uma classe Livro com os atributos título, autor e ano. 
Crie métodos para exibir as informações do livro e atualizar o ano.*/
package PraticaOO;

import java.util.Scanner;

public class Livro {

    private String titulo;
    private String autor;
    private int ano;

    public Livro(String titulo, String autor, int ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }

    public void exibirInfo() {
        System.out.println("Informações do livro:");
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano: " + ano);
    }

    public void atualizaAno(int novoAno) {
        if (novoAno > 0) {
            this.ano = novoAno;
            System.out.println("Ano do livro atualizado: " + novoAno);
        } else {
            System.out.println("Ano inválido. O ano deve ser um valor positivo.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o título do livro: ");
        String titulo = sc.nextLine();

        System.out.println("Informe o autor do livro: ");
        String autor = sc.nextLine();

        int ano = -1;
        while (ano <= 0) {
            System.out.println("Informe o ano em que o livro foi publicado (um valor positivo): ");
            ano = sc.nextInt();
            if (ano <= 0) {
                System.out.println("Ano inválido. Tente novamente.");
            }
        }

        Livro novoLivro = new Livro(titulo, autor, ano);
        novoLivro.exibirInfo();

        System.out.println("\nInforme um novo ano para o livro: ");
        int novoAno = sc.nextInt();
        novoLivro.atualizaAno(novoAno);

        sc.close();
    }
}
