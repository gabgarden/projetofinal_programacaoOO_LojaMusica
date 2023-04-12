package testeDeList;

import java.util.List;
import java.util.Scanner;

public class Estoque {

	private int id;    
    private String nome;            
    private String descricao;    
    private double preco;
	
	public Estoque(int id, String nome, String descricao, double preco) {
		this.id = id;
    	this.nome = nome;
    	this.descricao = descricao;
    	this.preco = preco;
	}

	public Estoque() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	@SuppressWarnings("unused")
	public void criarEstoque(List<Estoque> estoque) {        
        estoque.add(new Estoque(1, "Guitarra", "Stratocaster vermelha", 1200));
		estoque.add(new Estoque(2, "Bateria", "Bateria com 4 pratos e 2 pedais",  3500));
		estoque.add(new Estoque(3, "Teclado", "Clássico elétrico preto",  1500));
		estoque.add(new Estoque(4, "Piano", "De calda preto", 1200));
		estoque.add(new Estoque(5, "Amplificador", "Meteoro 100w",  3500));
		estoque.add(new Estoque(6, "Banco bateria", "Simples 3 alturas",  1500));
		estoque.add(new Estoque(7, "Monitores de Audio", "EDIFIER", 1200));
		estoque.add(new Estoque(8, "Microfone Condensador", "Behringer",  3500));
		estoque.add(new Estoque(9, "Baixo", "Jazz Bazz Fender",  1500));
		estoque.add(new Estoque(10, "Guitarra 7 Cordas", "Ibanez 7 cordas preta", 1200));
		estoque.add(new Estoque(11, "Vionlino", "Arco de madeira e 4 cordas",  3500));
		estoque.add(new Estoque(12, "Baixolão", "4 Cordas acústico",  1500));  
	}
	
	@SuppressWarnings("unused")
	public void mostrarEstoque(List<Estoque> estoque) {
		
		if(estoque.isEmpty() == false) {
			for (Estoque e : estoque) {
	        	System.out.println(e.getId() + " - Produto: " + e.getNome() + " --- Descrição: " + e.getDescricao() + " --- Preço: " + e.getPreco());
	        }
		} else {
			System.out.println("Estoque vazio.");
		}
		System.out.println("\n\n");
	}
	
	@SuppressWarnings("unused")
	public void removerEstoque(List<Estoque> estoque, Scanner input) { // prototipo dela, mas não ta feita ainda.
		System.out.print("\nDigite o código: ");
		int id = input.nextInt();
		for (Estoque e : estoque) {
			if (e.getId() == id) {
				estoque.remove(id - 1);
				System.out.println("Item removido do estoque!\n\n");
			}
		}
		System.out.println("\n\n");
	}
	
	@SuppressWarnings("unused")
	public void zerarEstoque(List<Estoque> estoque) {
		estoque.clear();
	}
	
	@SuppressWarnings("unused")
	public void adicionarEstoque(List<Estoque> estoque) { // não ta feita ainda.
		
	}
	
}
