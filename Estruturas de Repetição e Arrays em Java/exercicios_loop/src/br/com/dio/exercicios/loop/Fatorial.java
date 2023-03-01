package br.com.dio.exercicios.loop;

import java.util.Scanner;

public class Fatorial {
	
	/*
	Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
	Ex.: 5!= 120 (5 X 4 X 3 X 2 X 1)
	*/

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor:");
		int x = sc.nextInt();
		int fat = x;
		
		for(int i = 1; i < x; i++) {
			fat *= i;
		}
		System.out.println(x+ "! = " + fat);
		sc.close();

	}

}
