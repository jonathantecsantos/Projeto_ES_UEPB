package View;

import java.util.Scanner;
import Controller.Gerenciador;
public class Main {
	
	private static Gerenciador gerenciador = new Gerenciador(1);
	
	public static void main(String[] args) {
		
		menu();

	}
	
	private static void menu() { // menu principal
		Scanner sc = new Scanner(System.in);
		int opcao = 0;
		do {
			System.out.println("\n\n### Sistema de Controle de Viagens ###");
			System.out.println("\n                  =========================");
			System.out.println("                  |     1 - Cadastrar Usuario   |");
			System.out.println("                  |     2 - Menu Viagem         |");
			System.out.println("                  |     0 - Sair                |");
			System.out.println("                  =========================\n");
			System.out.println("Digite a opcao desejada: ");
			
			try {
				opcao = sc.nextInt();
			}catch(Exception e) {
					System.out.println("Opção Inválida!");
			}
			
			switch (opcao) {
			case 1:
				gerenciador.criarUsuario();
				break;
			case 2:
				menuViagemPrincipal();
				break;
			case 0:
				break;
			default:
				System.out.println("Opção Inválida!");
				break;
			}
		} while (opcao != 0);
	}
	
	private static void menuViagemPrincipal() { //menu viagem
		Scanner sc = new Scanner(System.in);
		int opcao = 0;
		do {
			System.out.println("\n\n### Menu viagem ###");
			System.out.println("\n                  =========================");
			System.out.println("                  |     1 - Cadastrar viagem	        |");
			System.out.println("                  |     2 - Ver viagens cadastradas     |");
			System.out.println("                  |     3 - Gerar relatorio de viagem   |");
			System.out.println("                  |     4 - Ver histórico de compras    |");
			System.out.println("                  |     5 - Remover viagem              |");
			System.out.println("                  |     0 - Voltar                      |");
			System.out.println("                  =========================\n");
			System.out.println("Digite a opcao desejada: ");
			
			try {
				opcao = sc.nextInt();
			}catch(Exception e) {
					System.out.println("Opção Inválida!");
			}
			
			switch (opcao) {
			case 1:
				menuViagemDiario();
				break;
			case 2:
				gerenciador.verViagensCadastradas();
				break;
			case 3:
				gerenciador.gerarRelatorioViagem();
				break; 
				
			case 4:
				
				gerenciador.gerarHistoricoDeCompras();
				break;
			case 5:
				gerenciador.removerViagem();
				break; 
			case 0:
				break;
			default:
				System.out.println("Opção Inválida!");
				break;
			}
		} while (opcao != 0);
	}
	private static void menuViagemDiario() { // menu series
		Scanner sc = new Scanner(System.in);
		int opcao = 0;
		do {
			System.out.println("\n\n### Menu de registro de viagem ###");
			System.out.println("\n                =========================");
			System.out.println("                  |     1 - Registrar finalidade e data    |");
			System.out.println("                  |     2 - Registrar Voo                  |");
			System.out.println("                  |     3 - Registrar Despesa              |");
			System.out.println("                  |     4 - Registrar Diário da Viagem     |");
			System.out.println("                  |     0 - Voltar                         |");
			System.out.println("                  =========================\n");
			System.out.println("Digite a opcao desejada: ");
			opcao = sc.nextInt();
			
			switch (opcao) {
			case 1:
				gerenciador.cadastrarViagem();
				break;
			case 2:
				gerenciador.registrarVoo();
				break;
			case 3:
				gerenciador.registrarDespesa();
				break;  
			case 4:
				gerenciador.registrarDiario();
				break; 
			case 0:
				break;
			default:
				System.out.println("Opção Inválida!");
				break;
			}
		} while (opcao != 0);
	}

}

