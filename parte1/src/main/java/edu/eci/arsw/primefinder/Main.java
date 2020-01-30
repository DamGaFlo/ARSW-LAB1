package edu.eci.arsw.primefinder;


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		PrimeFinderThread pft=new PrimeFinderThread(0, 10000000);
		PrimeFinderThread pft2=new PrimeFinderThread(10000001, 20000000);
		PrimeFinderThread pft3=new PrimeFinderThread(20000001, 30000000);
		
		pft.start();
		pft2.start();
		pft3.start();

		try {
			Thread.sleep(5*1000);
		} catch (Exception e) {
			System.out.println(e);
		}

		pft.pausarHilo();
		pft2.pausarHilo();
		pft3.pausarHilo();

		System.out.println("ya pasaron 5 segundos");

		System.out.println("el numero de primos es "+PrimeFinderThread.contador.get());

		String entrada;

		entrada = in.nextLine();
		while(!entrada.isEmpty()){
			entrada = in.nextLine();
			System.out.println(entrada);
		}

		pft.reanudarHilo();
		pft2.reanudarHilo();
		pft3.reanudarHilo();




		
		
	}
	
}
