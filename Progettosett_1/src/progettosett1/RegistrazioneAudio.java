package progettosett1;

public class RegistrazioneAudio extends PlayerMultimediale implements volume {


	
	
	private int duration;
	private int volume;
	
	public RegistrazioneAudio(String title, int duration, int volume) {
		super(title);
		this.duration = duration;
		this.volume = volume;
	}
	
	public int getVolume() {
		return volume;
	}
	
	

	
	
	public void play() {
		System.out.println("Play registrazione audio: " + getTitle());
		for (int i=0; i < duration; i++) {
			System.out.println(getTitle() + " ");
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
