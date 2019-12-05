package Controller;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Model.IdNaoEncontradoException;
import Model.Usuario;


import Model.Viagem;


public class Gerenciador {
	private int id;
	private List<Viagem> viagens;
	private Usuario usuario;
	
	public Gerenciador(int id) {
		this.id = id;
		this.viagens = new ArrayList<Viagem>();
	}
	
	public void criarUsuario() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o seu nome: ");
		String nome = sc.nextLine();
		System.out.println("Digite o seu login: ");
		String login = sc.nextLine();
		System.out.println("Digite a sua senha: ");
		String senha = sc.nextLine();
		this.usuario = new Usuario (nome,login,senha);
		System.out.println("Novo Usuario Cadastrado!");
		System.out.println(this.usuario.toString());
	}
	
	public void cadastrarViagem() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Finalidade da sua viagem: ");
		String nome = sc.nextLine();
		System.out.println("Data agendada: ");
		String data = sc.nextLine();
		Viagem novaViagem = new Viagem(nome,this.id,data);
		viagens.add(novaViagem);
		System.out.println("Cadastrado com sucesso!");
		System.out.println("ID da viagem: " + this.id);
		this.id++;
	}
	
	public Viagem procuraViagem(int id) throws IdNaoEncontradoException {
		
		 for (Viagem viagem : viagens) {
			 if(viagem.getId()==id) {
				 return viagem;
			 }
		}
		throw new IdNaoEncontradoException("Id não encontrado!");
	
	}
	
	public void registrarDespesa() {
		try {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o ID da Viagem a ser cadastrada uma despesa: ");
		int id = sc.nextInt();
		Viagem viagem = procuraViagem(id);
		viagem.getRelatorio().adicionaDespesa();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

	public void verViagensCadastradas() {
		 for (Viagem viagem : viagens) {
			 System.out.println(viagem.toString());
		}
	}
	public void gerarRelatorioViagem() {
		try {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o ID da Viagem a ser mostrada o relatorio: ");
		int id = sc.nextInt();
		Viagem viagem = procuraViagem(id);
		System.out.println(viagem.getRelatorio().toString());
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void registrarVoo() {
		try {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o ID da Viagem a ser cadastrado o voo: ");
		int id = sc.nextInt();
		Viagem viagem = procuraViagem(id);
		viagem.getRelatorio().adicionaVoo();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void registrarDiario() {
		try {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o ID da Viagem a ser cadastrada o diário: ");
		int id = sc.nextInt();
		Viagem viagem = procuraViagem(id);
		viagem.getRelatorio().registraDiario();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

	public void removerViagem() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o ID da viagem a ser excluida: ");
		int id = sc.nextInt();
		for (Viagem viagem : viagens) {
			if(viagem.getId() == id) {
				viagens.remove(viagem);
				System.out.println("Viagem removida com sucesso!");
				break;
			}
			
		}
		
	}

	public void gerarHistoricoDeCompras() {
		String compras = "";
		for (Viagem viagem : viagens) {
			compras = compras + viagem.getRelatorio().comprasRealizadas()+System.lineSeparator();
		}
		System.out.println("Historico de compras realizadas: "+System.lineSeparator()+compras);
	}

	
}
