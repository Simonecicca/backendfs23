package eserciziday3;

import java.util.Iterator;
import java.util.Scanner;

public class Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(stringaPariDispari("Okkay"));
		System.out.println(annoBisestile(29));
		
	}
	
	public static boolean stringaPariDispari(String x) {
		if (x.length() % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}


	public static boolean annoBisestile(int x) {
		if (x % 4 == 0 || x % 100 == 0 && x % 400 == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	
	//Esercizio 2
	
	public static void Switch () {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Inserisci un numero: ");
		int x = sc.nextInt();
	
	switch (x) {
	case 0:
		System.out.println("zero");
		break;
	case 1:
		System.out.println("uno");
		break;
	case 2:
		System.out.println("due");
		break;
	case 3:
		System.out.println("tre");
		break;
		
	default:
		System.out.println("Error!");
	}
	
}
	
	
		//Esercizio 3
	
	
	public static void While () {
		Scanner sc = new Scanner(System.in);
		String x;
		
			do {
				System.out.println(""
						+ "x = sc.nextInt(parola: ");
				x = sc.nextLine();
				String[] xAr = x.split("");
				String xArJ = xAr.toString().join("," , xAr);
				System.out.print(xArJ);
			}	while (!x.equals(":q")); 
	}
	
	//Esercizio 4
	
	public static void For() {
		int x;
		Scanner sc = new Scanner(System.in);
		System.out.println("numero: ");
		x = sc.nextInt();
		for (int i =x; i>= 1; i--) {
			System.out.println(i-1);
		}
	}
}
