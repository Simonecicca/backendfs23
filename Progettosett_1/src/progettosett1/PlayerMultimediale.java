package progettosett1;

import Scanner

public class PlayerMultimediale {

	public static void main(String[] args) {
		  
	        
	}
	
	 	private Playlist playlist;
	    private boolean isPlaying;

	    public PlayerMultimediale() {
	        playlist = new Playlist();
	        isPlaying = false;
	    }

	    public void addMedia(Media media) {
	        playlist.addMedia(media);
	    }

	    public void removeMedia(Media media) {
	        playlist.removeMedia(media);
	    }

	    public void play() {
	        if (!isPlaying) {
	            Media media = playlist.getNextMedia();
	            if (media != null) {
	                System.out.println("Playing: " + media.getTitle());
	                isPlaying = true;
	            } else {
	                System.out.println("Playlist is empty.");
	            }
	        } else {
	            System.out.println("Player is already playing.");
	        }
	    }

}
