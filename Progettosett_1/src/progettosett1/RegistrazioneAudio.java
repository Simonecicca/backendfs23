package progettosett1;

public class RegistrazioneAudio implements Playable {

	public static void main(String[] args) {
		
	}
	
	private String title;
	private int duration;
	private int volume;
	
	public RegistrazioneAudio(String title, int duration, int volume) {
		this.title = title;
		this.duration = duration;
		this.volume = volume;
	}
	
	@Override
	public String getTitle() {
		return title;
	}
	
	@Override
	public void play() {
		System.out.println("Play registrazione audio: " + title + "(Duration: " + duration + " seconds");
		for (int i=0; i < duration; i++) {
			for (int j=0; j <volume; j++) {
				System.out.println("!");
			}
			System.out.println();
		}
	}

	public void abbassaVolume() {
		if (volume > 0) {
			volume--;
		}
	}
	
	public void alzaVolume() {
		volume++;
	}
}
