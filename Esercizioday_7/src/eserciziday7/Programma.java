package eserciziday7;

import java.util.*;

public class Programma {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Inserisci il numero di elementi da aggiungere: ");
		int n = input.nextInt();
		
		Set<String> paroleSet = new HashSet<>();
		List<String> paroleDuplicate = new ArrayList<>();
		
		for (int i=0; i < n; i++) {
			System.out.println("Inserisci una parola: ");
			String parola = input.next();
			
			if (!paroleSet.add(parola)) {
				paroleDuplicate.add(parola);
			}
		}
		
		System.out.println("Parole duplicate: ");
		for (String parola : paroleDuplicate) {
			System.out.println(parola);
		}
		
		System.out.println("Numero delle parole distinte: " + paroleSet.size());
		
		System.out.println("Elenco delle parole distinte: ");
		for (String parola : paroleSet) {
			System.out.println(parola);
		}
	}
	

}
