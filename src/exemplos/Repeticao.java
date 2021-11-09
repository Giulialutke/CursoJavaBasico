package exemplos;

import java.util.Locale;
import java.util.Scanner;

public class Repeticao {
	public static void main(String[] args) {
		contagemregressiva();
	}

	public static void enquanto() {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();

		int soma = 0;
		while (x != 0) {
			soma = soma + x;
			x = sc.nextInt();
		}

		System.out.println(soma);
		sc.close();
	}

	public static void para() {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int soma = 0;
		for (int i = 0; i < N; i++) {
			int x = sc.nextInt();
			soma = soma + x;
		}
		System.out.println(soma);
		sc.close();
	}
	
	public static void para2() {
		
		for( int i = 0; i<5; i++) {
			System.out.println("Valor de i :" + i);
		}
	}

		public static void contagemregressiva() {
			
			for( int i = 4; i>=0; i--) {
				System.out.println("Valor de i :" + i);
			}
		}
	}
