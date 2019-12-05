package Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Relatorio {

	private String diarioViagem;
	private List<Voo> voos;
	private List<Compra> compras;
	
	public Relatorio() {
		this.diarioViagem = "";
		this.voos = new ArrayList<Voo>();
		this.compras = new ArrayList<Compra>();
		
	}
	
	public void adicionaVoo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o horario do voo: ");
		String horario = sc.nextLine();
		System.out.println("Digite a data de ida do voo: ");
		String dataida = sc.nextLine();
		System.out.println("Digite a data da volta do voo: ");
		String datavolta = sc.nextLine();
		System.out.println("Digite o local de partida do voo: ");
		String localpartida = sc.nextLine();
		System.out.println("Digite o local de destino do voo: ");
		String localdestino = sc.nextLine();
		Voo novoVoo = new Voo(horario, dataida, datavolta, localdestino, localpartida);
		this.voos.add(novoVoo);
		System.out.println("Voo adicionado com sucesso!");
	}
	
	public void adicionaDespesa() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Despesa com: ");
		String nome = sc.nextLine();
		System.out.println("Digite a data da despesa: ");
		String datacompra = sc.nextLine();
		System.out.println("Digite o valor da despesa: ");
		String valorcompra = sc.nextLine();
		Compra novaCompra = new Compra(nome, datacompra, valorcompra);
		this.compras.add(novaCompra);
		System.out.println("Despesa adicionada com sucesso!");
		
	}
	
	@Override
	public String toString() {
		String saida = "";
		saida = saida + System.lineSeparator() + "Descrição da Viagem: " + this.diarioViagem + System.lineSeparator() + "Despesas: " + System.lineSeparator() ;
		String comprasString =  "";
		for (Compra compra : compras) {
			comprasString = comprasString+compra.toString();
		}
		saida = saida + comprasString;
		saida = saida + System.lineSeparator()+"Voos realizados: " + System.lineSeparator();
		String voosString = "";
		for  (Voo voo : voos) {
			voosString = voosString+ voo.toString();
		}
		saida = saida+ voosString;		
		return saida;
		
	}
	
	public String comprasRealizadas() {
		String comprasFeitas =  "";
		for (Compra compra : compras) {
			comprasFeitas = comprasFeitas + compra.toString();
		}
		return comprasFeitas;
	}
	
	public String getDiarioViagem() {
		return diarioViagem;
	}
	
	public void setDiarioViagem(String diarioViagem) {
		this.diarioViagem = diarioViagem;
	}
	
	public List<Voo> getVoos() {
		return voos;
	}
	
	public void setVoos(List<Voo> voos) {
		this.voos = voos;
	}
	
	public List<Compra> getCompras() {
		return compras;
	}
	
	public void setCompras(List<Compra> compras) {
		this.compras = compras;
	}

	public void registraDiario() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o relato da viagem: ");
		String relato = sc.nextLine();
		setDiarioViagem(relato);
		System.out.println("Diário de Viagem cadastrado com sucesso!");
		
	}
	
	
	
	
	
	
	
	
}
