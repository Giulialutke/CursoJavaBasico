import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		diadasemana2();
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

	// Peças

	public static void pecas() {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double peca;
		double cod1 = sc.nextDouble();
		double qnt1 = sc.nextDouble();
		double vl1 = sc.nextDouble();
		double cod2 = sc.nextDouble();
		double qnt2 = sc.nextDouble();
		double vl2 = sc.nextDouble();

		peca = (qnt1 * vl1) + (qnt2 * vl2);

		System.out.printf("Valor  Peça R$%.2f ", peca);
		sc.close();
	}

	// Geometria

	public static void geometria() {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double a, b, c;

		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();

		System.out.printf("Triangulo Retângulo = %.3f%n", ((a * c) / 2));
		System.out.printf("Area circulo = %.3f%n", (3.14159 * Math.pow(c, 2.0)));
		System.out.printf("Area Trapezio = %.3f%n", ((a + b) / 2) * c);
		System.out.printf("Area Quadrado = %.3f%n", b * b);
		System.out.printf("Area Retangulo = %.3f", (a * b));
		sc.close();

		// Exemplo IF

	}

	public static void exemploif() {

		int x = 5;

		System.out.println("Bom dia");

		if (x < 0) {
			System.out.println("Boa tarde");
		}

		System.out.println("Boa noite");
	}

	// Exemploelse

	public static void exemploeslse() {
		Scanner sc = new Scanner(System.in);
		int hora;

		System.out.println("Quantas horas?");
		hora = sc.nextInt();

		if (hora < 12) {
			System.out.println("Bom dia");
		}

		else {
			System.out.println("Boa tarde");
		}
		sc.close();
	}
	// Exemplo encadeamento de estruturas condições

	public static void exemploeslseif() {
		Scanner sc = new Scanner(System.in);
		int hora;

		System.out.println("Quantas horas?");
		hora = sc.nextInt();

		if (hora < 12) {
			System.out.println("Bom dia");
		} else if (hora < 18) {
			System.out.println("Boa tarde");
		} else {
			System.out.println("Boa noite");
		}
		sc.close();
	}

	// Exercicios estrutura de condicional

	public static void numeronegativo() {
		Scanner sc = new Scanner(System.in);
		int numero;
		numero = sc.nextInt();

		if (numero < 0) {
			System.out.println("Negativo");
		} else {
			System.out.println("Não Negativo");
		}
		sc.close();
	}

	// Numero impar ou par

	public static void imparPar() {
		Scanner sc = new Scanner(System.in);

		int numero;
		numero = sc.nextInt();

		if (numero % 2 == 0) {
			System.out.println("Par");
		} else {
			System.out.println("Impar");
		}

		sc.close();

	}

	// Exemplo calculo minutos

	public static void calculominutos() {
		Scanner sc = new Scanner(System.in);

		int minutos = sc.nextInt();

		double conta = 50.0;
		if (minutos > 100) {
			conta = conta + (minutos - 100) * 2.0;
		}

		System.out.printf("Valor da conta = R$ %.2f%n", conta);
		sc.close();

	}

	// Exemplo calculo minutos simplificado

	public static void calculominutoscumulativa() {
		Scanner sc = new Scanner(System.in);

		int minutos = sc.nextInt();

		double conta = 50.0;
		if (minutos > 100) {
			conta += +(minutos - 100) * 2.0;
		}

		System.out.printf("Valor da conta = R$ %.2f%n", conta);
		sc.close();

	}

	// exemplo dia da semana

	public static void diadasemana() {
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		String dia;
		if (x == 1) {
			dia = "domingo";
		} else if (x == 2) {
			dia = "segunda";
		} else if (x == 3) {
			dia = "terca";
		} else if (x == 4) {
			dia = "quarta";
		} else if (x == 5) {
			dia = "quinta";
		} else if (x == 6) {
			dia = "sexta";
		} else if (x == 7) {
			dia = "sabado";
		} else {
			dia = "valor invalido";
		}
		System.out.println("Dia da semana: " + dia);
		sc.close();

	}

	// exemplo dia da semana 2

	public static void diadasemana2() {

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		String dia;
		switch (x) {
		case 1:
			dia = "domingo";
			break;
		case 2:
			dia = "segunda";
			break;
		case 3:
			dia = "terca";
			break;
		case 4:
			dia = "quarta";
			break;
		case 5:
			dia = "quinta";
			break;
		case 6:
			dia = "sexta";
			break;
		case 7:
			dia = "sabado";
			break;
		default:
			dia = "valor invalido";
			break;
		}
		System.out.println("Dia da semana: " + dia);
		sc.close();

	}
}
