package model.entities.exercicio1;

import model.enums.exercicio1.Cor;

public class TrianguloRetangulo extends Forma {
	private Double base;
	private Double altura;
	private Double hipotenusa;

	public TrianguloRetangulo() {
		super();
	}

	public TrianguloRetangulo(Cor cor, Double base, Double altura, Double hipotenusa) {
		super(cor);
		this.base = base;
		this.altura = altura;
		this.hipotenusa = hipotenusa;
	}

	public Double getBase() {
		return base;
	}

	public void setBase(Double base) {
		this.base = base;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	public Double getHipotenusa() {
		return hipotenusa;
	}

	public void setHipotenusa(Double hipotenusa) {
		this.hipotenusa = hipotenusa;
	}

	@Override
	public double area() {
		return (this.base * this.altura) / 2;
	}

	@Override
	public double perimetro() {
		return this.base + this.altura + this.hipotenusa;

	}
	
	@Override
	public String toString() {
		return "Triângulo: "+ getCor() +"\nÁrea = "+
				this.area() +
				"\n" +
				"Perímetro = "+
				this.perimetro()+
				"\n";
				
	}

}
