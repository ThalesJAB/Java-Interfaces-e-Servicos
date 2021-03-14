package application.exercicio2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import model.entities.exercicio2.NotaFiscal;
import model.entities.exercicio2.Produto;
import model.services.exercicio2.ImpostoBrasil;
import model.services.exercicio2.ServicoNotaFiscal;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Scanner scanner = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		
		System.out.print("Nome: ");
		String nome = scanner.nextLine();
		System.out.print("CPF: ");
		String cpf = scanner.nextLine();
		System.out.print("Codigo: ");
		int codigo = scanner.nextInt();
		scanner.nextLine();
		System.out.print("Data (dd/MM/yyyy hora:min): ");
		Date data = sdf.parse(scanner.nextLine());
		
		NotaFiscal nF = new NotaFiscal(nome, cpf, codigo, data);
		
		System.out.print("\nInforme a quantidade de produtos que irá adicionar: ");
		int quant = scanner.nextInt();
		scanner.nextLine();
		for(int i = 0; i < quant; i++) {
			System.out.print("Nome do produto: ");
			String nomeProd = scanner.nextLine();
			System.out.print("Valor: ");
			double valorProd = scanner.nextDouble();
			nF.addProdutos(new Produto(nomeProd, valorProd));
			scanner.nextLine();
		}
		
		ServicoNotaFiscal sNF = new ServicoNotaFiscal(new ImpostoBrasil());
		
		System.out.println("\nNOTA: \n");
		System.out.println(nF);
		
		for(Produto produto : nF.getProdutos()) {
			System.out.println(produto);
		}
		System.out.printf("Valor total: R$%.2f\n",sNF.processNotaFiscal(nF));
		System.out.printf("Valor Imposto NF: R$%.2f\n", sNF.processImpostoNF(nF));
		
		scanner.close();
		
	}

}
