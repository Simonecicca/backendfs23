package it.epicode.be;

import java.util.Scanner;

public class Helloworld {

public static void main (String[] args)
		{
		// Stampa a console  la frase
		System.out.println("This is my first Epicode Java Project!");
		System.out.println(conca("Aoa", 5));
		System.out.println(perimetroRettangolo(6,8));
		}


//Esercizio2

//	public static int moltiplicazione(int x, int y); {
//		int result = x * y;
//		return result;
//		System.out.println(moltiplicazione(5,5));
//	}
		public static String conca(String x, int y) {
			String result = " " + y;
			return result;
		
	}
		
//Esercizio 3
		
		public static void array(){
			Scanner sc = new Scanner(System.in);
			System.out.print("nome: ");
			String nome = sc.nextLine();
			System.out.print("cognome: ");
			String cognome = sc.nextLine();
			System.out.print("citta': ");
			String citta = sc.nextLine();
			System.out.println ("Ciao sono " + nome + " " + cognome + " da " + citta);
			System.out.println ("Ciao sono " + cognome + " " + nome + " da " + citta);	
		
		}
		
//Esercizio 4
		
		public static float perimetroRettangolo(float x, float y) {
			float result = x + y;
			return result;
			
			
		}
		
		
}





