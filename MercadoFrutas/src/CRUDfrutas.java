import java.util.ArrayList;
import java.util.Scanner;

public class CRUDfrutas {

	public static void main(String[] args) {
		//Variaveis
		
		Scanner input = new Scanner(System.in);
		
		ArrayList<String> Frutas = new ArrayList<String>();
		int opcao;
		
		do {
			System.out.println("Escolha uma das seguintes opções: "
					+ "\n 1: Cadastrar frutas "
					+ "\n 2: Listar Frutas"
					+ "\n 3: Excluir frutas"
					+ "\n 4: Listar frutas com ID"
					+ "\n 5: Modificar o nome de uma fruta");
			opcao = input.nextInt();
			
			switch(opcao) {
			
			//Adicionando fruta
			case 1:
				System.out.println("Digite o nome da fruta que deseja adicionar: ");
				String addFruta = input.next();
				Frutas.add(addFruta);
				break;
				
			// Listando Frutas
			case 2:
				System.out.println(Frutas);
				break;
				
			//Removendo frutas
			case 3:
				System.out.println("Qual Item você deseja remover(ID)");
				int rem = input.nextInt();
				Frutas.remove(rem);
				System.out.println("Item de ID" + rem + "foi excluido com sucesso");
				break;	
				
			//Vizualização por ID	
			case 4:
				System.out.println("Digite a fruta que deseja visualizar pelo ID");
				int idF = input.nextInt();
				System.out.println(Frutas.get(idF));
				break;
				
			//Alteração por ID	
			case 5:
				System.out.println("Digite a fruta que deseja alterar pelo ID");
				int idAlt = input.nextInt();
				System.out.println("Digite o novo nome:");
				String mod = input.next();
				
				Frutas.set(idAlt,mod);
				System.out.println("A fruta " + Frutas.get(idAlt) + "foi substituido por " + mod);
				break;
			default:
				System.out.println("Digite uma opção válida");
			}
			
		}
		while(opcao != 0);
	}

}
