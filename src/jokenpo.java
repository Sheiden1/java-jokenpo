import java.util.Random;
import java.util.Scanner;

public class jokenpo {

	public static void main(String[] args) {
		int jogador, computador;
		Scanner teclado = new Scanner(System.in);  // Cria um objeto Scanner para receber entrada do jogador;
		System.out.println("Pedra, Papel e Tesoura");  // Mostra o título do jogo
		System.out.println("1. Pedra");  // Mostra as opções disponíveis para o jogador
		System.out.println("2. Papel");
		System.out.println("3. Tesoura");
		System.out.println("Digite qual a opção você deseja jogar:");
		System.out.println("");
		
		// lógica para receber a escolha do jogador
		jogador = teclado.nextInt();  // Recebe a escolha do jogador
		System.out.println("");
		
		// Mostra qual opção o jogador escolheu
		switch (jogador) {  
		case 1: 
			System.out.println("Jogador escolheu Pedra");
			break;
		case 2: 
			System.out.println("Jogador escolheu Papel");
			break;
		case 3: 
			System.out.println("Jogador escolheu Tesoura");
			break;
		default:
				System.out.println("Opção inexistente");  // Caso o jogador escolha uma opção inválida, mostra uma mensagem de erro
			break;
		}
		
		// lógica para gerar a escolha do adversário (computador)
		computador = (int)(Math.random()*3 + 1);  // Gera um número aleatório entre 1 e 3 (incluindo 1 e 3) para representar a escolha do computador
		
		teclado.close();  // Fecha o objeto Scanner
		
		// Mostra qual opção o computador escolheu
		switch (computador) {
		case 1: 
			System.out.println("Computador escolheu Pedra");
			break;
		case 2: 
			System.out.println("Computador escolheu Papel");
			break;
		case 3: 
			System.out.println("Computador escolheu Tesoura");
			break;
		default:
				System.out.println("Opção inexistente");  // Caso o computador escolha uma opção inválida, mostra uma mensagem de erro
			break;
		}
		
		// lógica para determinar o vencedor
		System.out.println("");
		if (jogador==computador) {
			System.out.println("Empate");
		}else {
			if ((jogador == 1 && computador == 3) || (jogador == 2 && computador == 1) || (jogador == 3 && computador == 2)){
				System.out.println("Jogador Venceu");
		
			}else {
				System.out.println("Computador venceu");
			}
			
		}
	}

}
