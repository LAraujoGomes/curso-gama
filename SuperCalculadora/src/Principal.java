import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		//Entrada de 2 números
		//Menu SwitchCase
		//1 - Adição | 2 - Subtração | 3 - Multiplicação | 4 - Divisão
		Scanner input = new Scanner(System.in);
		System.out.println("-------Super Calculadora-------");
		System.out.println("Primeiro número:");
		double n1 = input.nextDouble();
		System.out.println("Segundo número:");
		double n2 = input.nextDouble();
		
		System.out.println("Agora digite a opção que preferir\n"
				+ "0 - Fechar\n"
				+ "1 - Adição\n"
				+ "2 - Subtração\n"
				+ "3 - Multiplicação\n"
				+ "4 - Divisão");
		int op = input.nextInt();
		
		switch(op) {
		case 1:
			Adicao ad = new Adicao();
			ad.adic(n1, n2);
			main(args);
		case 2:
			Subtracao sb = new Subtracao();
			sb.subt(n1, n2);
			main(args);
		case 3:
			Multiplicacao mp = new Multiplicacao();
			mp.mult(n1, n2);
			main(args);
		case 4:
			Divisao dv = new Divisao();
			dv.divs(n1, n2);
			main(args);
		default:
			System.out.println("Finalizando");
			break;
		}
	}

}
