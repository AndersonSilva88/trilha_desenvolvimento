package View;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

import Helper.Utils;
import Model.Produto;

public class Main {

	private static Scanner teclado = new Scanner(System.in);
	private static ArrayList<Produto> produtos;
	private static Map<Produto, Integer> carrinho;

	public static void main(String[] args) {
		produtos = new ArrayList<Produto>();
		carrinho = new HashMap<Produto, Integer>();
		Main.menu();

	}

	private static void menu() {
		System.out.println("=================================================");
		System.out.println("================= Bem-vindo(a) ==================");
		System.out.println("=================== Geek Shop ===================");
		System.out.println("=================================================");

		System.out.println("Selecione uma opção abaixo: ");
		System.out.println("1 - Cadastrar produto");
		System.out.println("2 - Listar produtos");
		System.out.println("3 - Comprar produto");
		System.out.println("4 - Visualizar carrinho");
		System.out.println("5 - Sair do sistema");

		int opcao = 0;

		try {
			opcao = Integer.parseInt(Main.teclado.nextLine());
		} catch (InputMismatchException e) {
			Main.menu();
		} catch (NumberFormatException f) {
			Main.menu();
		}

		switch (opcao) {
		case 1:
			Main.cadastrarProduto();
			break;
		case 2:
			Main.listarProdutos();
			break;
		case 3:
			Main.comprarProdutos();
			break;
		case 4:
			Main.visualizarCarrinho();
			break;
		case 5:
			System.out.println("Volte sempre!");
			Utils.pausar(2);
			System.exit(0);
		default:
			System.out.println("Opção inválida.");
			Utils.pausar(2);
			Main.menu();
			break;
		}

	}

	private static void cadastrarProduto() {
		System.out.println("Cadastrar Produto");
		System.out.println("=====================");

		System.out.println("Informe o nome do produto: ");
		String nome = Main.teclado.nextLine();

		System.out.println("Informe o preço do produto: ");
		Double preco = Main.teclado.nextDouble();

		Produto produto = new Produto(nome, preco);

		Main.produtos.add(produto);

		System.out.println("O produto " + produto.getNome() + " foi cadastrado com sucesso.");
		Utils.pausar(2);
		Main.menu();
	}

	private static void listarProdutos() {
		if (Main.produtos.size() > 0) {
			System.out.println("Listagem de produtos");
			System.out.println();

			for (Produto p : Main.produtos) {
				System.out.println(p);
				System.out.println();
			}
		} else {
			System.out.println("Ainda não existem produtos cadastrados.");
		}

		Utils.pausar(2);
		Main.menu();

	}

	private static void visualizarCarrinho() {
		if (Main.carrinho.size() > 0) {
			System.out.println("Produtos no carrinho: ");

			for (Produto p : Main.carrinho.keySet()) {
				System.out.println("Produto: " + p + "\nQuantidade: " + Main.carrinho.get(p));
			}
		} else {
			System.out.println("Ainda não existem produtos no carrinho.");
		}

		Utils.pausar(2);
		Main.menu();

	}

	private static void comprarProdutos() {
		if (Main.produtos.size() > 0) {
			System.out.println("Informe o código do produto que desejar comprar: ");
			System.out.println();

			System.out.println("============ Produtos Disponiveis ==============");
			for (Produto p : Main.produtos) {
				System.out.println(p);
				System.out.println("----------------------------");
			}
			int codigo = Integer.parseInt(Main.teclado.nextLine());
			boolean tem = false;

			for (Produto p : Main.produtos) {
				if (p.getCodigo() == codigo) {
					int quant = 0;

					try {
						quant = Main.carrinho.get(p);
						Main.carrinho.put(p, quant + 1);
					} catch (NullPointerException e) {
						Main.carrinho.put(p, 1);
					}
					System.out.println("O Produto " + p.getNome() + " foi adicionado ao carrinho.");
					tem = true;
				}

				if (tem) {
					System.out.println("Deseja adicionar outros produtos ao carrinho?");
					System.out.println("Informe 1 para sim ou 0 para não: ");
					int op = Integer.parseInt(Main.teclado.nextLine());

					if (op == 1) {
						Main.comprarProdutos();
					} else {
						System.out.println("Por favor, aguarde enquanto fechamos seu pedido....");
						Utils.pausar(2);
						Main.fecharPedido();
					}
				} else {
					System.out.println("Não foi encontrado o produto com o código " + codigo);
					Utils.pausar(2);
					Main.menu();
				}

			}
		} else {
			System.out.println("Ainda não existe produto cadastrado no mercado.");
			Utils.pausar(2);
			Main.menu();
		}

	}

	private static void fecharPedido() {
		Double valortotal = 0.0;
		System.out.println("Produtos do carrinho");
		System.out.println("--------------------");
		for (Produto p : Main.carrinho.keySet()) {
			int quant = Main.carrinho.get(p);
			valortotal += p.getPreco() * quant;
			System.out.println(p);
			System.out.println("Quantidade: " + quant);
			System.out.println("-----------------------");
		}
		System.out.println("Sua fatura é " + Utils.doubleParaString(valortotal));
		Main.carrinho.clear();
		System.out.println("Obrigado pela preferência.");
		Utils.pausar(5);
		Main.menu();
	}

}
