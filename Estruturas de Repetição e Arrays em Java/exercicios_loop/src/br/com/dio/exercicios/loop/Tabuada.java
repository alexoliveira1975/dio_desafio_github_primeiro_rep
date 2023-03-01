package br.com.dio.exercicios.loop;

import java.util.Scanner;

public class Tabuada {
	
	/*
	Desenvolva um gerador de tabuada, capaz de gerar a tabuada de 
	qualquer número inteiro entre 1 a 10. O usuário deve informar 
	de qual numero ele deseja ver a tabuada.
	
	A saída deve ser conforme o exemplo abaixo:
	Tabuada de 5:
	5 X 1 = 5
	5 X 2 = 10
	...
	5 X 10 = 50
	*/

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe um valor entre 1 e 10:");
		int n = sc.nextInt();
		System.out.println("Tabuada de " + n + ":");
		for(int i = 1; i<=10; i++) {
			System.out.printf("%d x %d = %d\n", n, i, n*i);	
		}
	
		sc.close();

	}

}
