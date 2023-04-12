package testeDeList;

import java.util.List;
import java.util.Scanner;

public class Carrinho {
	private String nome;
	private double preco;
	private int qtd, id;
	
	public Carrinho(String nome, double preco, int qtd) {
		this.nome = nome;
		this.preco = preco;
		this.qtd = qtd;
	}
	
	public Carrinho() {
	}

	public int getQtd() {
		return qtd;
	}

	public void setQtd(int qtd) {
		this.qtd = qtd;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	 public void adicionarCarrinho(List<Estoque> estoque, List<Carrinho> carrinho, Scanner input) {
	        System.out.print("\nDigite o código: ");
	        int id = input.nextInt();
	        System.out.print("Digite a quantidade: ");
	        int qtd = input.nextInt();
	        for (Estoque e : estoque) {
	            if (e.getId() == id) {
	                int aux = 0; // int auxiliar pra ajudar no controle do que precisa declarar na lista
	                if(carrinho.isEmpty() == false) { // se não está vazio, entra nesse if
	                    for(Carrinho c : carrinho) { // foreach - percorre a lista carrinho
	                        if (c.getNome() == e.getNome()) {  // se o nome do item for igual ao nome do produto, entra nesse if
	                            c.setQtd(c.getQtd()+qtd); // atualiza a qtd do item que já tem na lista.
	                            aux = 1;
	                        }
	                    }
	                    if(aux == 0) {
	                        carrinho.add(new Carrinho(e.getNome(), e.getPreco(), qtd));
	                    }
	                } else {
	                    carrinho.add(new Carrinho(e.getNome(), e.getPreco(), qtd));
	                }
	                System.out.println("Item adicionado ao carrinho!");
	            }
	        }
	        System.out.println("\n\n");
	    }
	
	@SuppressWarnings("unused")
	public void mostrarCarrinho(List<Carrinho> carrinho) {
		if(carrinho.isEmpty() == false) {
			int cont = 0;
			for (Carrinho c : carrinho) {
				cont++;
	        	c.setId(cont);
	        }
			for (Carrinho c : carrinho) {
	        	System.out.println(c.getId() + " - "+ c.getNome() + " - qtd: " + c.getQtd() + " --- Preço: " + c.getPreco()*c.getQtd());
	        }
		} else {
			System.out.println("Carrinho vazio.");
		}
		System.out.println("\n\n");
	}
	
	@SuppressWarnings("unused")
	public void removerCarrinho(List<Carrinho> carrinho, Scanner input) {
		
		if(carrinho.isEmpty() == false) {
			
			int cont = 0;
			int id = 0;
			int qtd = 0;
			
			for (Carrinho c : carrinho) {
				cont++;
	        	c.setId(cont); // settando o id de cada um dos produtos de forma manual, 100% atualizada igual bomba patch
	        }
			
			while(id > cont || id < cont) { // enquanto id for maior ou menor que o contador que é 
				mostrarCarrinho(carrinho); // a quantidade de itens no carrinho, vai rodar
				System.out.print("\nDigite o id: ");
				id = input.nextInt();
				if(id > cont || id < cont) { // um aviso caso o id digitado não seja de nenhum item do carrinho
					System.out.println("\nNão existe esse id. Tente novamente."); // <- o aviso
				}
			}
			
			System.out.print("Digite o quantidade: ");
			qtd = input.nextInt();
			
			for(Carrinho c : carrinho) { // foreachzin padrão
				if(c.getId() == id) { // se o id do item for o mesmo que o id digitado no console, ele roda
					if(c.getQtd() <= qtd) { // se a qtd do item for menor ou igual a qtd digitada no console, ele entra aqui
						carrinho.remove(id - 1);
						System.out.println("Item removido do carrinho.");
						break;
					} else { //caso a qtd do item no carrinho seja maior que a qtd digitada no console, ele entra aqui 
						c.setQtd(c.getQtd()-qtd);
						System.out.println("Quantidade de itens reduzida no carrinho.");
					}
				}
			}		
		} else {
			System.out.println("Carrinho vazio.");
		}
		System.out.println("\n\n");
	}
	
	@SuppressWarnings("unused")
	public void zerarCarrinho(List<Carrinho> carrinho) {
		carrinho.clear(); // função de limpar o carrinho, mt útil
	}
	
	@SuppressWarnings("unused")
	public void finalizarCarrinho(List<Carrinho> carrinho, Scanner input, List<Venda> historicoVendas) {
		if(carrinho.isEmpty() == false) {
			mostrarCarrinho(carrinho);
			int aux = 0; // pra executar o while enquanto não for respondida a pergunta
			while(aux == 0) {
				System.out.print("Deseja finalizar o carrinho? [S/N] ");
				char op1 = input.next().charAt(0);
				
				if(op1 == 'N' || op1 == 'n' || op1 == 'S' || op1 == 's') {  // VOLTAR AO MENU ou FINALIZAR O CARRINHO
					if(op1 == 'S' || op1 == 's') {  // DE FATO FINALIZAR O CARRINHO 
						double total = 0;
						for (Carrinho c : carrinho) {
							total = total + (c.getPreco() * c.getQtd());
						}
						System.out.println("Total a ser pago: " + total);
						System.out.println("Digite o ID de funcionário: \n");
						int idFuncionario = input.nextInt();
						System.out.println("Digite o CPF do cliente: \n");
						String cpfCliente = input.next();
						historicoVendas.add(new Venda(cpfCliente, idFuncionario, total, carrinho));
						zerarCarrinho(carrinho);
					}
					if(op1 == 'N' || op1 == 'n') {
						System.out.println("Voltando ao menu...");
					}
					aux = 1;
				} else {
					System.out.println("Opção inválida.");
				}
			}
		} else {
			System.out.println("Carrinho vazio.");
		}
		System.out.println("\n\n");
	}
	
}
