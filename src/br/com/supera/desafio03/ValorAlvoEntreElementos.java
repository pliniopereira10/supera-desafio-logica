package br.com.supera.desafio03;

import java.util.Scanner;

public class ValorAlvoEntreElementos {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

			int[] valores = new int[entrada.nextInt()];
			int valorAlvo = entrada.nextInt();
	
			adicionarElementos(valores, entrada);
	
			int quantidadeValoresPares = determinarNumerosPares(valores, valorAlvo);
			System.out.println(quantidadeValoresPares);

		entrada.close();

	}

	public static void adicionarElementos(int[] valores, Scanner entrada) {
		for (int i = 0; i < valores.length; i++) {
			valores[i] = entrada.nextInt();
		}

	}

	public static int determinarNumerosPares(int[] valores, int valorAlvo) {
		int contador = 0;

		for (int i = 0; i < valores.length; i++) {
			for (int j = 0; j < valores.length; j++) {
				int diferenca = valores[i] - valores[j];

				if (diferenca == valorAlvo) {
					contador++;
				}

			}

		}

		return contador;
	}
}
