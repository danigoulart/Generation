package br.com.generation.Listas.VertoresMatrizes;

public class Exercicio2 {
	public static void main(String[] args) {
		int[] lancamentos = new int[10];
		int total = 0;
		double valorAleatorio;
		
		for (int i = 0; i < lancamentos.length; i++) {
			valorAleatorio = Math.random()*5;
			lancamentos[i] = (int) Math.ceil(valorAleatorio);
			total += lancamentos[i];
		}
		
		for (int i = 0; i < lancamentos.length; i++) {
			System.out.printf("O %d� lan�amento � de %d\n", i+1, lancamentos[i]);
		}
		System.out.println("A m�dia de lancamentos �: " + (double) total/10);
	}
}
