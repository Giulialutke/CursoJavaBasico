package exemplos;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author juh_l
 *
 */
public class Repeticao {
	public static void main(String[] args) {
		Formatacao();
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

		for (int i = 1; i <= x; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}

		}

		sc.close();
	}

	public static void sequencia() {
		Scanner sc = new Scanner(System.in);

		for (int i = 1; i <= 14; i++) {
			System.out.println(i);

		}

		sc.close();
	}

	public static void sequencia5em5() {
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i <= 20; i += 5) {
			System.out.println(i);

		}

		sc.close();
	}

	public static void numeracao() {
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();

		for (int i = 1; i <= x; i++) {
			// || = ou

			if (i == 2 || i == 7) {
				System.out.println(i);
			}
		}

		sc.close();

	}

	public static void numeracao1() {
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();

		for (int i = 1; i <= x; i++) {
			// || = ou

			if (i == 2 || i == 7) {
				System.out.println(i);
			} else {
				System.out.println("Esse numero não é 2 nem 7");
			}
		}

		sc.close();
	}

	public static void façaenquanto() {
		Scanner sc = new Scanner(System.in);

		char resp;

		do {
			System.out.println("Digite a temperatua em Celcius: ");
			double C = sc.nextDouble();
			double F = 9.0 * C / 5.0 + 32.0;
			System.out.printf("Equivalente em Fahrenheit: %.2f%n", F);
			System.out.println("Deseja repetir (s/n)?");
			resp = sc.next().charAt(0);

		} while (resp != 'n');

		sc.close();
	}

	public static void bitwise() {
		Scanner sc = new Scanner(System.in);

		int n1 = 89;
		int n2 = 60;
		System.out.println(n1 & n2);
		System.out.println(n1 | n2);
		System.out.println(n1 ^ n2);

		sc.close();

	}

	public static void bitwise2() {
		Scanner sc = new Scanner(System.in);

		int mask = 0b100000;
		int n = sc.nextInt();
		if ((n & mask) != 0) {
			System.out.println("6th bit is true!");
		} else {
			System.out.println("6th bit is false");
		}
		sc.close();
	}
	
	public static void Formatacao() {
		
		String original = "abcde FGHIJ ABC abc DEFG ";
		
		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase();
		String s03 = original.trim();//remove espaço do traço
        String s04 = original.substring(2);
        String s05 = original.substring(2, 9);
        String s06 = original.replace('a', 'x');
        String s07 = original.replace("abc", "xy");
        
        int i = original.indexOf("bc");
        int j = original.lastIndexOf("bc");
        
		
		System.out.println("Original : " + original +  "-");
		System.out.println("toLowerCase : " + s01 +  "-");
		System.out.println("toUpperCase : " + s02 +  "-");
		System.out.println("trim : " + s03 +   "-");
		System.out.println("substring : " +  s04 + "-");
		System.out.println("substring : " +  s05 + "-");
		System.out.println("replace : " +  s06 + "-");
		System.out.println("replace : " +  s07 + "-");
		System.out.println("indexOf 'bc': " + i);
		System.out.println("LastIndexOf 'bc': " + j);
		
	}
}

