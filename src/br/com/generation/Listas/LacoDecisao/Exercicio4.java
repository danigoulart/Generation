package br.com.generation.Listas.LacoDecisao;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		double numero;
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Digite um n�mero: ");
		numero = sc.nextDouble();
		sc.close();

		if ((int) numero % 2 == 0) {
			System.out.println("N�mero � par.");
		} else {
			System.out.println("N�mero � �mpar.");
		}
	}
}
