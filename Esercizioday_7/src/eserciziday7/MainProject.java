package eserciziday7;

import java.util.Map;

public class MainProject {
	 private static Map<String, String> rubrica = new HashMap<String, String>();

	public static void main(String[] args) {
		
	}
	
	public static void aggiungiContatto(String nome, String telefono) throws Exception {
	if(rubrica.containsKey(nome)) {
		throw new Exception("Chiave già presente nella rubrica!");
	} else {
		rubrica.put(nome, telefono);
		}
		
	}
	
	
	public static void rimuoviContatto(String nome) throws Exception  {
		if(rubrica.containsKey(nome)) {
			rubrica.remove(nome);
		} else {
			throw new Exception("Chiave NON presente nella rubrica.");
		}
	}
	
	public static String ricercaContattoDaNome(String nome) {
		return rubrica.get(nome); 
	}
	
	public static void stampaContatti() {
		System.out.println("**** Contatti ****");
		Set<String> key = rubrica.keySet();
		for (String k : key) {
			System.out.println("Nome: " + k + "Numero: " + rubrica.get(k));
		}
	}

}
