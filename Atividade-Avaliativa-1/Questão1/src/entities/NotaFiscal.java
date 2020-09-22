package entities;

public class NotaFiscal {

	private String numero;
	private String descricao;
	private int quantidade;
	private double preco;
	
	public NotaFiscal() {
	}
	
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String toString() {
		return "NotaFiscal [numero= " + numero + ", descricao= " + descricao + 
				", quantidade= " + quantidade + 
				", preco= $" + preco + "]";
	}
	
	
	
	
}
