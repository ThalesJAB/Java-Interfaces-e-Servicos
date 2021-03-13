package model.entities.exercicio1;

import model.enums.exercicio1.Cor;

public class Quadrado extends Forma {

	private Double lado;

	public Quadrado() {
		super();

	}

	public Quadrado(Cor cor, Double lado) {
		super(cor);
		this.lado = lado;
	}

	public Double getLado() {
		return lado;
	}

	public void setLado(Double lado) {
		this.lado = lado;
	}

	@Override
	public double area() {
		return this.lado * this.lado;
	}

	@Override
	public double perimetro() {
		return this.lado * 4;

	}
	
	@Override
	public String toString() {
		return "Quadrado: "+ getCor() +"\nÁrea = "+
				this.area() +
				"\n" +
				"Perímetro = "+
				this.perimetro()+
				"\n";
				
	}

}
