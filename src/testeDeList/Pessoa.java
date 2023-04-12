package testeDeList;

import java.time.LocalDate; // https://www.devmedia.com.br/como-manipular-datas-com-o-java-8/34135

public abstract class Pessoa {
	protected String nome;
	protected Data nascimento;
	protected String classe;
	
	public abstract String imprimeDados();
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Data getNascimento() {
		return nascimento;
	}

	public void setNascimento(Data nascimento) {
		this.nascimento = nascimento;
	}
	
	/*public boolean aniversario() {
		LocalDate localDate = LocalDate.now();
		int aux = 0;
		
		if(nascimento == localDate.getDayOfMonth()) { // se mês for igual
			
			
			aux = 1;
		}
		
		if() { // se dia for igual
			
			aux = aux + 1;
		}
		
		if(aux == 2) { // se aux for == 2 quer dizer que dia e mes batem e eh aniversario da pessoa
			
		}
		*/
	}
	
}
