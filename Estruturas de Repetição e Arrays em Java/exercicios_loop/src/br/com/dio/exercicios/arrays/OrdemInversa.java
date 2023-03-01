package br.com.dio.exercicios.arrays;

import java.util.Scanner;

public class OrdemInversa {
	
	/*
	Crie um vetor de 6 números inteiros
	e mostre-os na ordem inversa.
	*/

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int vet[] = {1, 2, 3, 4, 5};
		
		for(int i = 0; i<vet.length; i++) {
			System.out.printf("%d  ",vet[i]);
			
		}
		
		System.out.println();
		
		for(int i = vet.length - 1; i >= 0; i--) {
			System.out.printf("%d  ",vet[i]);
		}
		
		sc.close();		

	}

}
