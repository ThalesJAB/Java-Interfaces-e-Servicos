package model.entities.exercicio2;

public class Produto {
	
	private String nome;
	private Double valor;
	
	
	public Produto() {
		
	}
	public Produto(String nome, Double valor) {
		
		this.nome = nome;
		this.valor = valor;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Double getValor() {
		return valor;
	}


	public void setValor(Double valor) {
		this.valor = valor;
	}
	
	@Override
	public String toString() {
		return "\n========================="+
				"\nProduto: "+this.nome+
				"\nValor: R$"+String.format("%.2f", this.valor)+
				"\n=========================\n";
				
	}
	
	

}
