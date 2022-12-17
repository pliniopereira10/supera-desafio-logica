package br.com.supera.desafio04;

import java.util.Scanner;

public class ImpressaoInversa {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int quantidadeTeste = Integer.parseInt(entrada.nextLine());
		for (int i = 0; i < quantidadeTeste; i++) {
			String frase = entrada.nextLine();

			int tamanhoDaFrase = frase.length() / 2;

			String primeiraParteFrase = new StringBuilder(frase.substring(0, tamanhoDaFrase)).reverse().toString();
			String segundaParteFrase = new StringBuilder(frase.substring(tamanhoDaFrase, frase.length())).reverse()
					.toString();

			System.out.println(primeiraParteFrase + segundaParteFrase);
		}

		entrada.close();

	}

}
