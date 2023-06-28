package eserciziday2;

public class Rettangolo {

	public static void main(String[] args) {
		
		
		Rettangolo rettangolo1 = new Rettangolo(6,8);
		Rettangolo rettangolo2 = new Rettangolo(8,4);
		
		stampaRettangoli(rettangolo1, rettangolo2);
	}
	
	public int altezza; 
	public int larghezza;
	
	public Rettangolo (int altezza, int larghezza) {
		this.altezza = altezza;
		this.larghezza = larghezza;
	}

	public int perimetro() {
		int n = (altezza + larghezza) * 2;
		return n;
	}
	
	public int area() {
		int n = altezza * larghezza;
		return n;
	}
	
	public void stampaRettangolo() {
		System.out.println(perimetro());
		System.out.println(area());
	}
	
	public static void stampaRettangoli(Rettangolo x, Rettangolo y) {
		int area = x.area() + y.area();
		int perimetro = x.perimetro() + y.perimetro();
		
		System.out.println(x.area());
		System.out.println(x.perimetro());
		System.out.println(y.area());
		System.out.println(y.perimetro());
		System.out.println(perimetro);
		System.out.println(area);
	}
}
