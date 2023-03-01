package br.com.dio.exercicios.loop;

import java.util.Scanner;

public class ParImpar {
	
	/*
	Faça um programa que peça N números inteiros,
	calcule e mostre a quantidade de números pares
	e a quantidade de números impares.
	*/

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int par = 0, impar = 0, x;
		System.out.println("Digite a quantidade: ");
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			x = sc.nextInt();
			if(x%2 == 0) par++;
			else impar++;
		}
		System.out.println("Par: " + par + "\nImpar: " + impar);
		sc.close();

	}

}
