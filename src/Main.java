import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) { 
		horasTrabalhadas();
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

// Funcoes Matematicas 1
	public static void funcoesMatematicas1() {
		double x = 3.0;
		double y = 4.0;
		double z = -5.0;
		double A, B, C;
		A = Math.sqrt(x);
		B = Math.sqrt(y);
		C = Math.sqrt(25.0);
		System.out.println("Raiz quadrada de " + x + " = " + A);
		System.out.println("Raiz quadrada de " + y + " = " + B);
		System.out.println("Raiz quadrada de 25 = " + C);
		A = Math.pow(x, y);
		B = Math.pow(x, 2.0);
		C = Math.pow(5.0, 2.0);
		System.out.println(x + " elevado a " + y + " = " + A);
		System.out.println(x + " elevado ao quadrado = " + B);
		System.out.println("5 elevado ao quadrado = " + C);
		A = Math.abs(y);
		B = Math.abs(z);
		System.out.println("Valor absoluto de " + y + " = " + A);
		System.out.println("Valor absoluto de " + z + " = " + B);

	}

// fomula de Baskara
	public static void forumaladeBaskara() {

		double delta;
		double a = 2;
		double b = 10;
		double c = 4;
		double x1;
		double x2;

		delta = Math.pow(b, 2.0) - 4 * a * c;
		x1 = (-b + Math.sqrt(delta)) / (2.0 * a);
		x2 = (-b - Math.sqrt(delta)) / (2.0 * a);
		System.out.println("delta" + "=" + delta);
		System.out.println("Resultado1" + "=" + x1);
		System.out.println("Resultado2" + "=" + x2);

	}
// Quebradelinha

	public static void quebradeLinha() {
		Scanner sc = new Scanner(System.in);

		int x;
		String s1, s2, s3;

		x = sc.nextInt();
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();

		System.out.println("DADOS DIGITADOS:");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		sc.close();
	}

// Exercicios
// Exercicio1

	public static void exercicio1() {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double largura = sc.nextDouble();
		double comprimento = sc.nextDouble();
		double metroQuadrado = sc.nextDouble();

		double area = largura * comprimento;
		double preco = area * metroQuadrado;

		System.out.printf("AREA = %.2f%n", area);
		System.out.printf("PRECO = %.2f", preco);
		sc.close();

	}

// Exercicio2

	public static void exercicio2() {

		Scanner sc = new Scanner(System.in);

		double entradax = sc.nextDouble();
		double entraday = sc.nextDouble();
		double entradax2 = sc.nextDouble();
		double entraday2 = sc.nextDouble();
		double entradax3 = sc.nextDouble();
		double entraday3 = sc.nextDouble();

		double saida1 = entradax + entraday;
		double saida2 = entradax2 + entraday2;
		double saida3 = entradax3 + entraday3;

		System.out.println("Saida1 = " + saida1);
		System.out.println("Saida2 = " + saida2);
		System.out.println("Saida3 = " + saida3);
		sc.close();

	}

// Area

	public static void area() {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double pi = 3.14159;
		double a = 2;
		double raio = sc.nextDouble();
		double area;

		area = pi * Math.pow(raio, a);

		System.out.printf("Area = %.4f", area);
		sc.close();

	}

// Produto Diferença
	public static void diferenca() {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int dif;

		dif = (a * b) - (c * d);
		System.out.println("DIFERENÇA = " + dif);
		sc.close();
	}

// Horas Trabalhadas

	public static void horasTrabalhadas() {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double funcionario;
		double qntfuncionario = sc.nextDouble();
		double qnthorastrabalhadas = sc.nextDouble();
		double valorhora = sc.nextDouble();

		funcionario = qnthorastrabalhadas * valorhora;
		System.out.println("Funcionario = " + qntfuncionario);
		System.out.printf("Salario = U$%.2f", funcionario);
		sc.close();

	}

}
