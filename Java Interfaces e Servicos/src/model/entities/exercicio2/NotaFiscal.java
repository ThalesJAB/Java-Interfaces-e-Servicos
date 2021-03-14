package model.entities.exercicio2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.text.MaskFormatter;

public class NotaFiscal {
	
	private String nome;
	private String cpf;
	private int codigo;
	private Date data;
	private List <Produto> produtos = new ArrayList<>();
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
	
	public NotaFiscal() {
	}

	public NotaFiscal(String nome, String cpf, int codigo, Date data) {
		this.nome = nome;
		setCpf(cpf);
		this.codigo = codigo;
		setData(data);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		try {
			MaskFormatter mask = new MaskFormatter("###.###.###-##");
			mask.setValueContainsLiteralCharacters(false);
			this.cpf = mask.valueToString(cpf);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}
	
	public void addProdutos(Produto produto) {
		produtos.add(produto);
	}
	
	public void removeProdutos(Produto produto) {
		produtos.add(produto);
	}
	
	@Override
	public String toString() {
		return "Cliente\n"+
				"Cod: "+this.codigo+
				"\nNome: "+this.nome+
				"\nCPF: "+this.cpf+
				"\nData: "+sdf.format(this.data);	
	}
}
