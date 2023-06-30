package progettosett1;

public abstract class Media {

	public static void main(String[] args) {
	
		
	}

	private String title;

    public Media(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public abstract void play();
}

