package gale_shapley;

import java.util.ArrayList;

public class B {
	private String id;
	private boolean free;
	private ArrayList<A> preferences;
	private A match;
	
	public B(String id, ArrayList<A> preferences) {
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

	public ArrayList<A> getPreferences() {
		return preferences;
	}
	
	public A getMatch() {
		return match;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public void setMatch(A match) {
		this.match = match;
	}
}
