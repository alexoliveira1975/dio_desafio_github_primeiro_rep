package application;

import java.util.Scanner;

import entities.SmartTv;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		SmartTv smartTv = new SmartTv();
		System.out.println(smartTv);
		
		smartTv.ligar();
		System.out.println(smartTv);
		
		smartTv.diminuirVolume();
		smartTv.diminuirVolume();
		smartTv.diminuirVolume();
		smartTv.aumentarVolume();
		
		smartTv.aumentarCanal();
		smartTv.aumentarCanal();
		smartTv.setCanal(13);
		
		System.out.println(smartTv);
		
		sc.close();
	}

}
