package application;

import java.util.Locale;
import java.util.Scanner;

import entitels.util;

public class Funcionario {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		
		int escolha = 0;
		
		Scanner esc = new Scanner(System.in);
		util utililatario = new util();
		
		
		while(escolha != 3){
			
		System.out.println( );
		System.out.println("1 – Cadastrar Funcionario");
		System.out.println("2 – Mostrar os dados sobre o Funcionário");
		System.out.println("3 – Sair do Programa");
		System.out.println( );
		
		escolha = esc.nextInt();
		
		
		
		
		if(escolha == 1) {
			
			System.out.println( );
			System.out.print("Digite o nome do funcionario: ");
			esc.nextLine();
			utililatario.nome = esc.nextLine();
			System.out.println( );
			System.out.print("Digite o Sobrenome do funcionario: ");
			utililatario.sobreNome = esc.nextLine();
			System.out.println( );
			System.out.print("Digite o Salario Mensal: ");
			utililatario.salarioMensal = esc.nextDouble();
			System.out.println( );
			System.out.print("Digite a gratificacao: ");
			utililatario.gratificacao = esc.nextInt();
			System.out.println( );
			
			if (utililatario.salarioMensal < 0){
				
				utililatario.setSalaryEqualsZero();
			}
		
			
		}
		
		else if(escolha == 2) {
			
				
				System.out.println( );
				System.out.print("Nome do funcionario: " + utililatario.getName());
				
				System.out.println( );
				System.out.print("Sobrenome do funcionario: " + utililatario.getlastName());
				
				System.out.println( );
				System.out.print("Salario Mensal: " +  utililatario.getsalarioMensal());
				
				System.out.println( );
				System.out.print("A gratificacao: " +  utililatario.getGratificacao() + "%");
				
				System.out.println( );
				System.out.print("Salario apos a gratificacao: " +  utililatario.getSalary());
				
				System.out.println( );
				System.out.print("Salario Anual apos a gratificacao: " +  (utililatario.getSalary() * 12));
				System.out.println( );
				
				System.out.println( );
				System.out.print("Quanto deseja aumentar na gratificacao: ");
				utililatario.setAumento(esc.nextDouble());
				System.out.println( );
				
				System.out.print("Salario Anual apos o aumento da gratificacao: " +  (utililatario.getSalary() * 12));
				System.out.println( );
				
				
				
			
		}
		
		else {
			System.out.println( );
			System.out.println("Voce optou por nos abandonar :/");
			break;
		}
	}
		
		
		
		
		
		
		
		
		esc.close();
	
}

	
}