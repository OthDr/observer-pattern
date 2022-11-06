package channels;

import java.util.ArrayList;

public class Agence {
	
	ArrayList<Channel> observers = new ArrayList<Channel>(); // List of channels
	private boolean state;

	public boolean getState() {
		return state;
	}

	public void setState(boolean state) {
		this.state = state;
		notifyAllObservers();
	}

	void attach(Channel obs) {
		observers.add(obs);

	}

	void notifyAllObservers() {
		for(Channel element: observers) {
			element.update();
		}
	}

}
