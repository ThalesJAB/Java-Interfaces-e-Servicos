package model.services.exercicio2;

public class ImpostoBrasil implements IServicoImposto{

	private static final double IRPJ = 0.15;
	private static final double ICMS = 0.07;
	private static final double PIS = 0.0165;
	private static final double COFINS = 0.076;
	private static final double CSLL = 0.09;
	
	
	public double impostoTaxa(double valor) {
		return ((valor * IRPJ) + (valor * ICMS) + (valor * PIS) + (valor * COFINS) + (valor * CSLL));
		
	}
	
}
