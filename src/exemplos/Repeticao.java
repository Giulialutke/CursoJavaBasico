package exemplos;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author juh_l
 *
 */
public class Repeticao {
	public static void main(String[] args) {
		impares();
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

		for (int i = 0; i < 5; i++) {
			System.out.println("Valor de i :" + i);
		}
	}

	public static void contagemregressiva() {

		for (int i = 4; i >= 0; i--) {
			System.out.println("Valor de i :" + i);
		}

	}

	public static void senhainvalida() {
		Scanner sc = new Scanner(System.in);

		int senha = sc.nextInt();

		while (senha != 2002) {
			System.out.println("Senha invalida");
			senha = sc.nextInt();
		}
		System.out.println(" Acesso permitido");
		sc.close();

	}

	public static void codigo() {
		Scanner sc = new Scanner(System.in);

		int opc = sc.nextInt();
		int a = 0;
		int g = 0;
		int d = 0;

		while (opc != 4) {

			if (opc == 1) {
				a = a + 1;
			} else if (opc == 2) {
				g = g + 1;
			} else if (opc == 3) {
				d = d + 1;
			}
			opc = sc.nextInt();
		}
		System.out.println("Muito Obrigado");
		System.out.println("Alcool: " + a);
		System.out.println("Gasolina: " + g);
		System.out.println("Diesel: " + d);
		sc.close();
	}

	public static void impares() {
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();

		for (int i = 1; i <= x; i ++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
			
		}

		sc.close();
	}

}
