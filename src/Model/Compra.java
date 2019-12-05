package Model;

public class Compra {
	private String nome;
	private String dataCompra;
	private String valor;
	
	
	public Compra(String nome, String dataCompra, String descricaoCompra) {
		this.nome = nome;
		this.dataCompra = dataCompra;
		this.valor = descricaoCompra;
	}
	
	@Override
	public String toString() {
		return "[Gasto com: " + nome + ", Data: " + dataCompra + ", Preço: " + valor + "]" + System.lineSeparator();
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDataCompra() {
		return dataCompra;
	}
	public void setDataCompra(String dataCompra) {
		this.dataCompra = dataCompra;
	}
	public String getDescricaoCompra() {
		return valor;
	}
	public void setDescricaoCompra(String descricaoCompra) {
		this.valor = descricaoCompra;
	}
	
	
	
}
