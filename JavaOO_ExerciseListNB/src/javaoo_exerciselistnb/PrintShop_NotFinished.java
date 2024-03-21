/*
EXERCÍCIO 3
O cliente que será atendido será uma gráfica onde são impressos banners, revistas, material
publicitário, livros, entre outros produtos. O cliente procurou você para resolver um
problema muito específico dele. O cliente deseja realizar o gerenciamento das ordem dos
pedidos que serão impressos. Portanto, ele gostaria que você desenvolvesse uma solução
elegante onde alguns requisitos fossem satisfeitos.
Lembre-se que para esse exercício de UML você terá vários requisitos levantados na
entrevista, porém nem todos necessariamente são relevantes ao seu sistema. Tome as
decisões de analista de sistemas e construa suas classes de forma que atenda a necessidade
de gerenciar os pedidos.
- O sistema deverá ter tipos diferentes de usuários: gerente, empregado e empregado
terceirizado;
- O gerente deverá ser o administrador do sistema e cada gerente terá um setor específico
da gráfica para cuidar. Por exemplo (gerente financeiro, gerente da produção, gerente de
vendas);
- O empregado é assalariado mensal e opera qualquer tipo de equipamento dentro da
gráfica;
- O empregado terceirizado não faz parte do quadro de funcionários, porém, executam
tarefas importantes na empresa. Desde limpeza até alimentação dos funcionários.
- Cada empregado ocupa uma função dentro da empresa, isso deve ser registrado no
cadastro;
- Cada pedido é composto por data e hora de emissão e de finalização, bem como o preço.
O pedido é feito pela equipe de vendas da gráfica e é repassado a produção.
- Cada pedido é vinculado a um funcionário do setor de vendas para que ele se
responsabilize pelo que será entregue;
- A produção deverá seguir o sistema de gerenciamento de pedidos e cada funcionário da
produção deverá se responsabilizar pela produção de um produto (impressão);
- Cada produto que será impresso pode ter um tipo diferente ( banner, livro, panfleto);
- O preço de cada impressão varia através de uma tabela fixa que é definida pelos gerentes.
 */
package javaoo_exerciselistnb;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintShop_NotFinished {

    private static final Scanner scanner = new Scanner(System.in);
    private static final List<Usuario> usuarios = new ArrayList<>();
    private static final List<Produto> produtos = new ArrayList<>();
    private static final List<Pedido> pedidos = new ArrayList<>();
    private static TabelaPreco tabelaPreco;

    public static void main(String[] args) {
        while (true) {
            System.out.println("** Sistema de Gerenciamento de Pedidos **");
            System.out.println("---------------------------------");
            System.out.println("1. Gerenciar Usuários");
            System.out.println("2. Gerenciar Produtos");
            System.out.println("3. Gerenciar Tabelas de Preço");
            System.out.println("4. Gerenciar Pedidos");
            System.out.println("5. Sair");
            System.out.println("---------------------------------");
            System.out.print("Digite a opção desejada: ");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    gerenciarUsuarios();
                    break;
                case 2:
                    gerenciarProdutos();
                    break;
                case 3:
                    gerenciarTabelasPreco();
                    break;
                case 4:
                    gerenciarPedidos();
                    break;
                case 5:
                    System.out.println("Saindo do sistema...");
                    System.exit(0);
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }

    private static void gerenciarUsuarios() {
        while (true) {
            System.out.println("** Gerenciamento de Usuários **");
            System.out.println("---------------------------");
            System.out.println("1. Cadastrar Usuário");
            System.out.println("2. Consultar Usuários");
            System.out.println("3. Editar Usuário");
            System.out.println("4. Excluir Usuário");
            System.out.println("5. Voltar");
            System.out.println("---------------------------");
            System.out.print("Digite a opção desejada: ");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    cadastrarUsuario();
                    break;
                case 2:
                    consultarUsuarios();
                    break;
                case 3:
                    editarUsuario();
                    break;
                case 4:
                    excluirUsuario();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }

    private static void cadastrarUsuario() {
        System.out.println("Cadastro de Usuário");

        System.out.print("Digite o nome: ");
        String nome = scanner.next();

        System.out.print("Digite o login: ");
        String login = scanner.next();

        System.out.print("Digite a senha: ");
        String senha = scanner.next();

        System.out.print("Digite o tipo (gerente, empregado, terceirizado): ");
        String tipo = scanner.next();

        Usuario usuario = null;
        switch (tipo) {
            case "gerente":
                System.out.print("Digite o setor: ");
                String setor = scanner.next();
                usuario = new Gerente(nome, login, senha, setor);
                break;
            case "empregado":
                System.out.print("Digite a função: ");
                String funcao = scanner.next();
                usuario = new Empregado(nome, login, senha, funcao);
                break;
            case "terceirizado":
                usuario = new EmpregadoTerceirizado(nome, login, senha);
                break;
            default:
                System.out.println("Tipo de usuário inválido!");
                return;
        }

        usuarios.add(usuario);

        System.out.println("Usuário cadastrado com sucesso!");
    }

    private static void consultarUsuarios() {
        System.out.println("Consulta de Usuários");
        for (Usuario usuario : usuarios) {
            System.out.println(usuario);
        }
    }

    private static void editarUsuario() {
        System.out.println("Editar Usuário");
        // Implementação ainda não feita
    }

    private static void excluirUsuario() {
        System.out.println("Excluir Usuário");
        // Implementação ainda não feita
    }

    private static void gerenciarProdutos() {
        System.out.println("Gerenciamento de Produtos");
        // Implementação ainda não feita
    }

    private static void gerenciarTabelasPreco() {
        System.out.println("Gerenciamento de Tabelas de Preço");
        // Implementação ainda não feita
    }

    private static void gerenciarPedidos() {
        System.out.println("Gerenciamento de Pedidos");
        // Implementação ainda não feita
    }
}

abstract class Usuario {

    private final String nome;
    private final String login;
    private final String senha;

    public Usuario(String nome, String login, String senha) {
        this.nome = nome;
        this.login = login;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public String getLogin() {
        return login;
    }

    @Override
    public String toString() {
        return "Usuario{"
                + "nome='" + nome + '\''
                + ", login='" + login + '\''
                + '}';
    }
}

class Gerente extends Usuario {

    private final String setor;

    public Gerente(String nome, String login, String senha, String setor) {
        super(nome, login, senha);
        this.setor = setor;
    }

    @Override
    public String toString() {
        return "Gerente{"
                + "nome='" + getNome() + '\''
                + ", login='" + getLogin() + '\''
                + ", setor='" + setor + '\''
                + '}';
    }
}

class Empregado extends Usuario {

    private final String funcao;

    public Empregado(String nome, String login, String senha, String funcao) {
        super(nome, login, senha);
        this.funcao = funcao;
    }

    @Override
    public String toString() {
        return "Empregado{"
                + "nome='" + getNome() + '\''
                + ", login='" + getLogin() + '\''
                + ", funcao='" + funcao + '\''
                + '}';
    }
}

class EmpregadoTerceirizado extends Usuario {

    public EmpregadoTerceirizado(String nome, String login, String senha) {
        super(nome, login, senha);
    }

    @Override
    public String toString() {
        return "EmpregadoTerceirizado{"
                + "nome='" + getNome() + '\''
                + ", login='" + getLogin() + '\''
                + '}';
    }
}

class Produto {

    private String nome;
    private String tipo;

    public Produto(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}

class Pedido {

    private LocalDateTime dataEmissao;
    private LocalDateTime dataFinalizacao;
    private double preco;
    private Usuario responsavel;
    private Produto produto;

    public Pedido(LocalDateTime dataEmissao, Usuario responsavel, Produto produto) {
        this.dataEmissao = dataEmissao;
        this.responsavel = responsavel;
        this.produto = produto;
    }

    public LocalDateTime getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(LocalDateTime dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public LocalDateTime getDataFinalizacao() {
        return dataFinalizacao;
    }

    public void setDataFinalizacao(LocalDateTime dataFinalizacao) {
        this.dataFinalizacao = dataFinalizacao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Usuario getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Usuario responsavel) {
        this.responsavel = responsavel;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
}

class TabelaPreco {
    // Implementação ainda não feita
}
