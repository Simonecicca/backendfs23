package eserciziday8;

public class Threads {

	public static void main(String[] args) {
		
		Thread thread1 = new Thread(new StampaSimbolo("*"));
		Thread thread2 = new Thread(new StampaSimbolo("#"));
		
		thread1.start();
		thread2.start();
	}
	
	private static class StampaSimbolo implements Runnable {
		private final String simbolo;
		
	public StampaSimbolo(String simbolo) {	
		this.simbolo = simbolo;
		}
	
	@Override
	public void run() {
		for (int i=0; i<10; i++) {
			System.out.println(simbolo);
			
			try {
				Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
