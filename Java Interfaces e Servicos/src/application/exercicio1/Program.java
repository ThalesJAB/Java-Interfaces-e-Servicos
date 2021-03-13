package application.exercicio1;

import model.entities.exercicio1.Quadrado;
import model.entities.exercicio1.TrianguloRetangulo;
import model.enums.exercicio1.Cor;
import model.services.exercicio1.IForma;

public class Program {

	public static void main(String[] args) {

		IForma formaQuad = new Quadrado(Cor.AZUL, 7.0);
		IForma formaTriRet = new TrianguloRetangulo(Cor.VERMELHO, 10.0, 5.0, 17.0);

		System.out.println(formaQuad);
		System.out.println(formaTriRet);
	}

}
