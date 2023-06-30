package progettosett1;

public class Video implements Playable {

	public static void main(String[] args) {
		System.out.println();

	}

	private String title;
	private int duration;
	private int volume;
	private int luminosita;
	
	public Video(String title, int duration, int volume, int luminosita) {
		this.title = title;
		this.duration = duration;
		this.volume = volume;
		this.luminosita = luminosita;
	}
	
	@Override
	public String getTitle() {
		return title;
	}
	
	
	@Override
	public void play() {
		 System.out.println("Playing video: " + title + " (Duration: " + duration + " seconds)");
	        for (int i = 0; i < duration; i++) {
	            for (int j = 0; j < volume; j++) {
	                System.out.print("!");
	            }
	            for (int k = 0; k < luminosita; k++) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }
	    }
	
	public void abbassaVolume() {
		if (volume > 0) {
			volume --;
		}
	}
	public void alzaVolume() {
		volume++;
	}
	public void diminuisciLuminosita() {
		if (luminosita > 0) {
			luminosita--;
		}
	}
	public void aumentaLuminosita() {
		luminosita++;
	}
}
	
	
	

