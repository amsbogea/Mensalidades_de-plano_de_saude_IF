package mensalidades_de_plano_de_saude_IF;

import java.util.Scanner;

public class Mensalidades_de_plano_de_saude_IF {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Informe a idade.");
		int idade = input.nextInt();
		
		if (idade <= 10) {
			System.out.println("Valor a pagar 30,00");
		}else if (idade > 10 && idade <=29) {
			System.out.println("Valor a pagar 60,00");
		}else if (idade > 29 && idade <=45) {
			System.out.println("Valor a pagar 120,00");
		}else if (idade > 45 && idade <=59) {
			System.out.println("Valor a pagar 150,00");
		}else if (idade > 59 && idade <=65) {
			System.out.println("Valor a pagar 250,00");
		}else {
			System.out.println("Valor a pagar 400,00");
		}
	}

}
