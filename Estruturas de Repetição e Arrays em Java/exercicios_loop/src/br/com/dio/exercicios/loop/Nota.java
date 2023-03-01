package br.com.dio.exercicios.loop;

import java.util.Locale;
import java.util.Scanner;

public class Nota {
	
	/*
	Faça um programa que peça uma nota, entre zero e dez.
	Mostre uma mensagem caso o valor seja inválido
	e continuo pedindo 	até que o usuário informe um valor válido.
	*/

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite uma nota entre 0.0 e 10.0:");
		double nota = sc.nextDouble();
		while(nota < 0.0 || nota > 10.0) {
			System.out.printf("%.1f = Valor inválido. Tente outro valor entre 0.0 e 10.0\n", nota);
			nota = sc.nextDouble();
		}
		System.out.printf("%.1f = Valor válido", nota);
		sc.close();

	}

}
