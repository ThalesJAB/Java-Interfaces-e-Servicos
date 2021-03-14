package model.services.exercicio2;

import model.entities.exercicio2.NotaFiscal;
import model.entities.exercicio2.Produto;

public class ServicoNotaFiscal {

	private IServicoImposto servicoImposto;

	public ServicoNotaFiscal(IServicoImposto servicoImposto) {
		this.servicoImposto = servicoImposto;

	}

	public double processNotaFiscal(NotaFiscal notaFiscal) {
		double valorTotal = 0.0;
		for (Produto produto : notaFiscal.getProdutos()) {
			valorTotal += produto.getValor();
		}

		return valorTotal;

	}

	public double processImpostoNF(NotaFiscal notaFiscal) {

		return this.servicoImposto.impostoTaxa(processNotaFiscal(notaFiscal));

	}

}
