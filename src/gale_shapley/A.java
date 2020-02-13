package gale_shapley;

import java.util.ArrayList;

public class A {
	private String id;
	private boolean free;
	private ArrayList<B> preferences;
	private B match;
	
	public A(String id, ArrayList<B> preferences) {
		this.id = id;
		this.free = true;
		this.preferences = preferences;
		this.match = null;
	}

	public String getId() {
		return id;
	}

	public boolean isFree() {
		return free;
	}

	public ArrayList<B> getPreferences() {
		return preferences;
	}
	
	public B getMatch() {
		return match;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public void setMatch(B match) {
		this.match = match;
	}
	
	public void removeMatch() {
		this.match = null;
	}
}
