package Model;

import java.util.List;

public class Viagem {
	private String nome;
	private int id;
	private String dataVisita;
	private Relatorio relatorio;
	
	
	public Viagem(String nome, int id, String dataVisita) {
		super();
		this.nome = nome;
		this.id = id;
		this.dataVisita = dataVisita;
		this.relatorio = new Relatorio();
	}
	
	@Override
	public String toString() {
		return "[Finalidade: " + nome + ", Data: "+dataVisita + ", Id: " + id + "]";
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Relatorio getRelatorio() {
		return relatorio;
	}
	public void setRelatorio(Relatorio relatorio) {
		this.relatorio = relatorio;
	}

	public String getDataVisita() {
		return dataVisita;
	}

	public void setDataVisita(String dataVisita) {
		this.dataVisita = dataVisita;
	}
	
	
	
	  
	
	
	

	
}
