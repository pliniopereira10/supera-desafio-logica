package br.com.supera.desafio01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class OrdenacaoDeValores {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		List<Integer> valores = new ArrayList<>();

		int quantidadeDeValores = entrada.nextInt();
		for (int i = 0; i < quantidadeDeValores; i++) {
			valores.add(entrada.nextInt());
		}

		imprimir(listarValoresPares(ordenarValoresCrescente(valores)));
		imprimir(listarValoresImpares(ordenarValoresDecrescente(valores)));

		entrada.close();

	}

	public static void imprimir(List<Integer> valores) {
		valores.forEach(System.out::println);
	}

	public static List<Integer> listarValoresPares(List<Integer> valores) {
		return valores.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
	}

	public static List<Integer> listarValoresImpares(List<Integer> valores) {
		return valores.stream().filter(x -> x % 2 != 0).collect(Collectors.toList());
	}

	public static List<Integer> ordenarValoresCrescente(List<Integer> valores) {
		return valores.stream().sorted((x, y) -> x.compareTo(y)).collect(Collectors.toList());
	}

	public static List<Integer> ordenarValoresDecrescente(List<Integer> valores) {
		return valores.stream().sorted((x, y) -> y.compareTo(x)).collect(Collectors.toList());
	}

}
