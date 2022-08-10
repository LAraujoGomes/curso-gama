import java.util.Random;
import java.util.Scanner;
public class PedraPapelTesoura {

	public static void main(String[] args) {
		// Pedra > Tesoura > Papel > Pedra
		int op = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Seja Bem vindo ao JOKEMPÔ, um jogo de sorte muito popular ao redor do mundo!");
		do{
			System.out.println("Escolha sua Jogada:\n"
					+ "0 - Sair\n"
					+ "1 - Pedra\n"
					+ "2 - Papel\n"
					+ "3 - Tesoura");
			int choice = input.nextInt();
			String[] ia = {"Pedra","Papel","Tesoura"}; 
			Random gerador = new Random();
			int id = gerador.nextInt(3)+1;
			
			if (choice == 1 && id == 3) 
			{
				System.out.println("Player: Pedra VS PC: Tesoura");
				System.out.println("Vitória!\n");
			}
			
			if (choice == 1 && id == 2) 
			{
				System.out.println("Player: Pedra VS PC: Papel");
				System.out.println("Derrota!\n");
			}
			
			if (choice == 2 && id == 1) 
			{
				System.out.println("Player: Papel VS PC: Pedra");
				System.out.println("Vitória!\n");
			}
			
			if (choice == 2 && id == 3) 
			{
				System.out.println("Player: Papel VS PC: Tesoura");
				System.out.println("Derrota!\n");
			}
			
			if (choice == 3 && id == 2) 
			{
				System.out.println("Player: Tesoura VS PC: Papel");
				System.out.println("Vitória!\n");
			}
			
			if (choice == 3 && id == 1) 
			{
				System.out.println("Player: Tesoura VS PC: Pedra");
				System.out.println("Derrota!\n");
			}
			if(choice == id) {
				System.out.println("Player: " + ia[choice-1] + " VS PC: " + ia[id-1]);
				System.out.println("Empate!\n");
			}
			System.out.println("Deseja continuar? (S/N)");
			String continuar = input.next();
			if(continuar == "S") {
				op = 0;
			}
			else if(continuar == "N"){
				op = 1;
			}
			else {
				System.out.println("Opção escrita de maneira incorreta, finalizando o programa");
			}
			
		}while(op != 0);
		
		
	}

}
