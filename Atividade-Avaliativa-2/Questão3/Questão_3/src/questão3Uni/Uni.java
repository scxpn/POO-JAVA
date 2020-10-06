package questão3Uni;

import java.util.Locale;
import java.util.Scanner;

public class Uni {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		System.out.println("------------------------------------------------");
		System.out.println("--Informe o numero pessoas que seram avaliadas--");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double[] vect = new double[n];
		System.out.println("--------------------------------------------------");
		System.out.println("--Agora informe a altura de cada pessoa, ex:1.99--");
		for (int i=0; i<n; i++) {
		vect[i] = sc.nextDouble();
		}
		double sum = 0.0;
		for (int i=0; i<n; i++) {
		sum += vect[i];
		}
		double avg = sum / n;
		System.out.println("------------------------------------------------");
		System.out.printf("-Altura média da turma avaliada e de: %.2f%n-", avg);
		sc.close();

	}

}
