package progettosett1;

public class Playlist {

	public static void main(String[] args) {
		
	}
	
	 private List<Media> mediaList;
	    private int currentIndex;

	    public Playlist() {
	        mediaList = new ArrayList<>();
	        currentIndex = 0;
	    }

	    public void addMedia(Media media) {
	        mediaList.add(media);
	    }

	    public void removeMedia(Media media) {
	        mediaList.remove(media);
	    }

	    public Media getNextMedia() {
	        if (currentIndex < mediaList.size()) {
	            Media nextMedia = mediaList.get(currentIndex);
	            currentIndex++;
	            return nextMedia;
	        } else {
	            currentIndex = 0;
	            return null;
	        }
	    }

}
