package br.com.dio.exercicios.loop;

import java.util.Scanner;

public class Maior_Media {

	/*
	 * Faça um programa que leia 5 números e informe o maior número ea média números
	 * desses.
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int maior = 0;
		double media = 0.0;
		Double[] vet = new Double[5];

		for (int i = 0; i < vet.length; i++) {
			vet[i] = sc.nextDouble();
			media += vet[i];
		}

		for (int i = 1; i < vet.length; i++) {
			if (vet[i] > vet[maior]) {
				maior = i;
			}
		}

		System.out.println("Maior valor: " + vet[maior]);
		System.out.println("Media: " + media / vet.length);

		sc.close();

	}

}
