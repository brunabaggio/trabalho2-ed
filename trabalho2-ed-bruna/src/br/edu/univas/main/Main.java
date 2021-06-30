package br.edu.univas.main;

import java.util.Scanner;

public class Main {
    public static Scanner l = new Scanner(System.in);

    public static void main(String[] args) {
        Arvore arvore = new Arvore();
        int op = 0;
        boolean arvoreCadastrada = false;
        do {

            System.out.println("PIZZARIA");
            System.out.println("1 - Cadastro de Sabor");
            System.out.println("2 - Cadastro de Ingrediente");
            System.out.println("3 - Buscar ingrediente");
            System.out.println("4 - Valor total da pizza");
            System.out.println("5 - Exibir todos os ingredientes");
            System.out.println("9 - Sair");
            op = l.nextInt();
            l.nextLine();

            if (op == 1) {
                if (arvoreCadastrada == false) {
                    System.out.println("Nome da Pizza: ");
                    arvore = new Arvore(l.nextLine());
                    System.out.println("Quantidade de ingredientes: ");
                    int qt = l.nextInt();
                    l.nextLine();
                    cadastro(arvore, qt);
                } else {
                    continue;
                }
                arvoreCadastrada = true;
            } else if (op == 2) {
                cadastro(arvore);
            } else if (op == 3) {
                System.out.println("Pesquisar sabor: ");
                No buscado = arvore.getRaiz().buscar(l.nextLine());
                if (buscado != null) {
                    System.out.println("Sabor: " + buscado.getNome() + "   - Valor: " + buscado.getValor()
                            + "  - Quantidade: " + buscado.getQuantidade());
                } else {
                    System.out.println("Não Encontrado");
                }
            } else if (op == 4) {
                arvore.getRaiz().valorArvore();
                System.out.println("\n \n \n TOTAL: " + No.soma);
            } else if (op == 5) {
                listarTodos(arvore);
            } else if (op == 9) {
                System.out.println("SAIR");
                break;
            } else {
                System.out.println("Opção Inválida!");
            }
        } while (op != 9);
        l.close();
    }

    public static void cadastro(Arvore arvore) {
        System.out.println("Sabor da pizza: ");
        No no = arvore.getRaiz().buscar(l.nextLine());
        if (no != null) {
            System.out.println("Nome do ingrediente: ");
            String nome = l.nextLine();
            System.out.println("Quantidade utilizada: ");
            int qtd = l.nextInt();
            l.nextLine();
            System.out.println("Valor do ingrediente: ");
            float valorNo = l.nextFloat();
            l.nextLine();
            No novo = new No(nome, valorNo, qtd);
            no.acrescentarFilho(novo);
        } else {
            System.out.println("Não cadastrado!");
        }
    }

    public static void cadastro(Arvore arvore, int qt) {
        for (int i = 0; i < qt; i++) {
            System.out.println("Nome do ingrediente: ");
            String nome = l.nextLine();
            System.out.println("Quantidade utilizada: ");
            int qtd = l.nextInt();
            l.nextLine();
            System.out.println("Valor do ingrediente: ");
            float valorNo = l.nextFloat();
            l.nextLine();
            No no = new No(nome, valorNo, qtd);
            arvore.getRaiz().acrescentarFilho(no);
        }
    }

    public static void listarTodos(Arvore arvore) {
        arvore.getRaiz().componentes();
        System.out.println("\n \n \n \n \n \n INGREDIENTES CADASTRADOS \n");
        for (No folha : No.componentes) {
            System.out.println("Nome: " + folha.getNome());
            System.out.println("Valor: " + folha.getValor());
            System.out.println("Quantidade: " + folha.getQuantidade());
        }
    }
}
