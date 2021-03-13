package model.entities.exercicio1;

import model.enums.exercicio1.Cor;
import model.services.exercicio1.IForma;

public abstract class Forma implements IForma {

	private Cor cor;

	public Forma() {

	}

	public Forma(Cor cor) {
		this.cor = cor;
	}

	public Cor getCor() {
		return cor;
	}

	public void setCor(Cor cor) {
		this.cor = cor;
	}

	public abstract double area();

	public abstract double perimetro();

}
