package eserciziday2;

public class Sim {

	public static void main(String[] args) {
		
		Sim telefono1 = new Sim (12345678, 6);
		
		telefono1.stampaDati();
	}
	
	public int numero;
	public int credito;
	
	Chiamata[] List = {
			new chiamata (6, 2345678),
			new chiamata (8, 8765432),
			new chiamata (12, 1567893),
			new chiamata (1, 9128374),
			new chiamata (22, 5638742)
	};
	
	public Sim (int numero, int credito) {
		this.numero = numero;
		this.credito = 0;
	}
	
	public void stampaDati() {
		for (Chiamata i : List) {
			System.out.println(i.chiamata + " " + i.numero);
		}
		System.out.println(numero);
		System.out.println(credito);
	}

}
