import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		exemploDadosDigitados();

	}
	
	public static void exemploDadosDigitados() {
		Scanner sc = new Scanner(System.in);

		String x;
		int y = 0;
		double z = 0.0;
		x = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble();

		System.out.println("Dados Digitados");
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		sc.close();
		
	}

	public static void exemplo() {

		double x = 10.35784;
		System.out.println(x);
		System.out.printf("%.2f%n", x);
		System.out.printf("%.4f%n", x);
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f%n", x);
		System.out.println("Resultado = " + x + " Metros");
		System.out.printf("Resultado = %.2f Metros%n", x);
		String nome = "Maria";
		int idade = 31;
		Double renda = 4000.0;
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);

	}

	public static void exemploExpressao() {
		double b, B, h, area;

		b = 6.0;
		B = 8.0;
		h = 5.0;

		area = (b + B) / 2.0 * h;
		System.out.println(area);

	}

	public static void exemploCasting() {
		int a, b;
		double resultado;
		a = 5;
		b = 2;

		resultado = (double) a / b;
		System.out.println(resultado);
	}

	// Ler palavra apartir do teclado:
	public static void lerTeclado() {
		Scanner sc = new Scanner(System.in);

		String x;
		x = sc.next();
		System.out.println("Você digitou:" + x);

		sc.close();
	}

	// Ler numero teclado
	public static void lerNumeroTeclado() {
		Scanner sc = new Scanner(System.in);

		int x;
		x = sc.nextInt();
		System.out.println("Você digitou:" + x);

		sc.close();
	}

	// Ler numero flutuante
	public static void lerNumeroFlutuante() {
		Scanner sc = new Scanner(System.in);

		double x;
		x = sc.nextDouble();
		System.out.println("Você digitou:" + x);

		sc.close();
	}

	// Ler apenas primeira letra digiada
	public static void lerPrimeiraLetraDigitada() {
		Scanner sc = new Scanner(System.in);

		char x;
		x = sc.next().charAt(0);
		System.out.println("Você digitou " + x);

		sc.close();
	}
}