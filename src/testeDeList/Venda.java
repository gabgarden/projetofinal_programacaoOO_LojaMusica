package testeDeList;

import java.util.List;

public class Venda {
	
	
	
	
	private int  idFuncionario;
	private String cpfCliente;
	private List<Carrinho> carrinho;
	private double valorCompra;
	
	
	
	public Venda(String cpfCliente, int idFuncionario, double valorCompra,  List<Carrinho> carrinho) {
		this.cpfCliente = cpfCliente;
		this.idFuncionario = idFuncionario;
		this.valorCompra = valorCompra;
		this.carrinho = carrinho;
	}



	public Venda() {
	}

	
	
	public void mostrarVendas(List<Venda> historicoVendas) {
				for (Venda v : historicoVendas) {
			        	System.out.println("Cpf cliente: " + v.getCpfCliente() + " - Id Funcionário: "+ v.getIdFuncionario() + " - Valor compra:  " + v.getValorCompra());
		        }		
	}



	
	
	
	
	
	// GETTERS AND SETTERS
	
	
	public int getIdFuncionario() {
		return idFuncionario;
	}



	public void setIdFuncionario(int idFuncionario) {
		this.idFuncionario = idFuncionario;
	}



	public String getCpfCliente() {
		return cpfCliente;
	}



	public void setCpfCliente(String cpfCliente) {
		this.cpfCliente = cpfCliente;
	}



	public List<Carrinho> getCarrinho() {
		return carrinho;
	}



	public void setCarrinho(List<Carrinho> carrinho) {
		this.carrinho = carrinho;
	}



	public double getValorCompra() {
		return valorCompra;
	}



	public void setValorCompra(double valorCompra) {
		this.valorCompra = valorCompra;
	}
	}
	
	
	
	

