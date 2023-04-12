package testeDeList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExecutarProduto {
	
	// MENU
	private static void menuLoja(List<Estoque> estoque, List<Carrinho> carrinho, Scanner input, Estoque armazem, Carrinho kart, 
			List<Venda> historicoVendas, Venda sales) {
		armazem.criarEstoque(estoque);
		int op = 0;
        while (op != 7) {
        	System.out.print("|##-- Bem vindo a Garden's House --##|\n");
			System.out.print("|------------------------------------|\n");
			System.out.print("| Selecione uma operação:            |\n");
			System.out.print("| Opção 1 - Lista de Produtos        |\n");
			System.out.print("| Opção 2 - Adicionar ao Carrinho    |\n");
			System.out.print("| Opção 3 - Remover do Carrinho      |\n");
			System.out.print("| Opção 4 - Mostrar o Carrinho       |\n");
			System.out.print("| Opção 5 - Finalizar o Carrinho     |\n");
			System.out.print("| Opção 6 - Historico Vendas         |\n");
			System.out.print("| Opção 7 - Sair                     |\n");
			System.out.print("|------------------------------------|\n");

			System.out.print("Opção: ");
            op = input.nextInt();

            switch (op) {
                case 1:
                	armazem.mostrarEstoque(estoque);
                    break;
                    
                case 2:
                	kart.adicionarCarrinho(estoque, carrinho, input);
                	break;
                	
                case 3:
                	kart.removerCarrinho(carrinho, input);
                	break;
                    
                case 4:
                	kart.mostrarCarrinho(carrinho);
                	break;
                	
                case 5:
                	kart.finalizarCarrinho(carrinho, input, historicoVendas);
                	break;
                
                case 6:
                	sales.mostrarVendas(historicoVendas);
                	
                    break;
                    
                case 7:
                	System.out.println("Saindo...");
                    break;
                	
                default: 
                    System.out.println("Opção inválida.");
                    break;
            }
        }
	}
	
	
	// MAIN
	public static void main(String[] args) {
		
		List<Estoque> estoqueDaLoja = new ArrayList<Estoque>();
		List<Carrinho> carrinhoDeCompras = new ArrayList<Carrinho>();
		List<Venda> historicoVendas = new ArrayList<Venda>();
		Venda sales = new Venda();
		Estoque armazem = new Estoque();
		Carrinho kart = new Carrinho();
		Scanner input = new Scanner(System.in);
		
		System.out.println();
		
		menuLoja(estoqueDaLoja, carrinhoDeCompras, input, armazem, kart, historicoVendas, sales);
			
	}
}
