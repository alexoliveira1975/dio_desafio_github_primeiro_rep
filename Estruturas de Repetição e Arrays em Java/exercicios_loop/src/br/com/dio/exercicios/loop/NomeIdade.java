package br.com.dio.exercicios.loop;

import java.util.Scanner;

public class NomeIdade {
	
	/*
	Faça um programa que leia conjuntos de dois valores,
	o primeiro representando o nome do aluno e o segundo representando a sua idade.
	(Pare o programa inserindo o valor 0 no campo nome)
	*/

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			System.out.println();
			System.out.println("Digite o Nome: ");
			String nome = sc.nextLine();
			if(nome.equals("0")) break;
			System.out.println("Digite a Idade: ");
			int idade = sc.nextInt();
			sc.nextLine();
			
			System.out.println("Nome: " + nome);
			System.out.println("Idade: " + idade);
		}
		
		sc.close();

	}

}
