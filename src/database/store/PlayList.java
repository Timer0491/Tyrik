//package LA1;

import java.util.ArrayList;

public class PlayList {
	
	private String title;
	private ArrayList<Song> body;
	private String type;
	
	//Constructors
	public PlayList(String title) {
		this.title = title;
		this.body = new ArrayList<Song>();
		this.type = "PLAYLIST";
	}
	
	public PlayList(PlayList p) {
		this.title = p.getTitle();
		this.body = p.getBody();
	}

	//Getters
	public String getTitle() {
		return this.title;
	}

	public ArrayList<Song> getBody() {
		return new ArrayList<>(body);
	}
	
	public String getType() {
		return this.type;
	}
	
	
	//Methods
	public void addSong(Song s) {
		body.add(new Song(s));
	}
	
	public void remove(Song s) {
		body.remove(s);
	}
	
	//StringMethod
	public String toString(){
		String result = "";
		for(Song song : body) {
			result = "\n-" + song.toString();
		}
		result += "\n";
		return result;
	}

}
