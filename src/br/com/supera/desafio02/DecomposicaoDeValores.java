package br.com.supera.desafio02;

import java.util.Locale;
import java.util.Scanner;

public class DecomposicaoDeValores {

	public static void main(String[] args) {
		
		final int CEM = 100;
		final int CINQUENTA = 50;
		final int VINTE = 20;
		final int VINTE_E_CINCO = 25;
		final int DEZ = 10;
		final int CINCO = 5;
		final int DOIS = 2;
		
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);

			double valor = entrada.nextDouble();
	
			double qtdCedulas100 = valor / CEM;
			double resto = valor % CEM;
			
			double qtdCedulas50 = resto / CINQUENTA;
			resto = resto % CINQUENTA;
			
			double qtdCedulas20 = resto / VINTE;
			resto = resto % VINTE;
	
			double qtdCedulas10 = resto / DEZ;
			resto = resto % DEZ;
	
			double qtdCedulas5 = resto / CINCO;
			resto = resto % CINCO;
			
			double qtdCedulas2 = resto / DOIS;
			resto = resto % DOIS;
			
			resto = resto * CEM;
			
			double qtdMoedas1 = resto / CEM;
			resto = resto % CEM;
			
			double qtdMoedas050 = resto / CINQUENTA;
			resto = resto % CINQUENTA;
			
			double qtdMoedas020 = resto / VINTE_E_CINCO;
			resto = resto % VINTE_E_CINCO;
			
			double qtdMoedas010 = resto / DEZ;
			resto = resto % DEZ;
			
			double qtdMoedas005 = resto / CINCO;
			resto = resto % CINCO;
			
			double qtdMoedas001 = resto;
			
			System.out.println();
			System.out.println("NOTAS:");
			System.out.println((int) qtdCedulas100 + "	notas(s)	de	R$	100.00");
			System.out.println((int) qtdCedulas50 + "	notas(s)	de	R$	 50.00");
			System.out.println((int) qtdCedulas20 + "	notas(s)	de	R$	 20.00");
			System.out.println((int) qtdCedulas10 + "	notas(s)	de	R$	 10.00");
			System.out.println((int) qtdCedulas5 + "	notas(s)	de	R$	  5.00");
			System.out.println((int) qtdCedulas2 + "	notas(s)	de	R$	  2.00");
			System.out.println("MOEDAS:");
			System.out.println((int) qtdMoedas1 + "	moeda(s)	de	R$	  1.00");
			System.out.println((int) qtdMoedas050 + "	moeda(s)	de	R$	  0.50");
			System.out.println((int) qtdMoedas020 + "	moeda(s)	de	R$	  0.20");
			System.out.println((int) qtdMoedas010 + "	moeda(s)	de	R$	  0.10");
			System.out.println((int) qtdMoedas005 + "	moeda(s)	de	R$	  0.05");
			System.out.println((int) qtdMoedas001 + "	moeda(s)	de	R$	  0.01");

		entrada.close();

	}

}
