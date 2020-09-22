package application;

import java.util.Locale;
import java.util.Scanner;

import entites.opera;

public class Calculadora {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		opera operacao = new opera();

		char opcao = 'y';

		
		// reptidor do menu'
		while (opcao != '$') {

			System.out.println("------------------------------------------");
			System.out.println("+ - Somar");
			System.out.println("+ - Subtrair");
			System.out.println("* - Multiplicar");
			System.out.println("/ - Dividir");
			System.out.println("$ - Sair");
			System.out.println("------------------------------------------ ");

			opcao = sc.next().charAt(0);
			
			if (opcao != '+' && opcao != '-' && opcao != '*' && opcao != '/' && opcao != '$') {
				System.out.println("Digite uma opcao valida");
				
				break;
				
				

			}else if (opcao == '$') {
				break;

			}

			System.out.println("------------------------------------------");
			System.out.print("Digite o primeiro numero abaixo: ");
			operacao.numero1 = sc.nextInt();
			System.out.println("------------------------------------------");
			System.out.print("Digite o segundo numero abaixo: ");
			operacao.numero2 = sc.nextInt();

			

				if (opcao == '-') {
					operacao.subtrair();
					System.out.println(" O resultado da operacao eh: " + operacao.resultado);
					

				} else if (opcao == '+') {

					operacao.adicao();
					System.out.println(" O resultado da operacao eh: " + operacao.resultado);
					

				} else if (opcao == '*') {

					operacao.multiplicar();
					System.out.println(" O resultado da operacao eh: " + operacao.resultado);
					

				} else {

					if (operacao.numero1 == 0 || operacao.numero2 == 0) {

						System.out.println("Nao eh possivel dividir por 0");
						
					} else {

						operacao.dividir();
						System.out.println(" O resultado da operacao eh: " + operacao.resultado);
						

					}
				}

			
		}
		sc.close();
		System.out.println("Fim do Programa");

	}
}
