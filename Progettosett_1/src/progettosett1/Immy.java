package progettosett1;

public class Immy extends PlayerMultimediale implements luminosita {

	public static void main(String[] args) {
		

	}
	
private int luminosita;
	
public Immy(String title, int luminosita) {
	super(title);
	this.luminosita = luminosita;
}

public void diminuisciLuminosita() {
	if (luminosita > 0) {
		luminosita--;
	}
}
public void aumentaLuminosita() {
	luminosita++;
}


public void show() {
	System.out.print(getTitle());
	for (int i = 0; i < luminosita; i++) {
		System.out.print("*");
	}
}


}


	
	

