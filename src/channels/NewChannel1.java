package channels;

public class NewChannel1 extends Channel {

	public NewChannel1(Agence agence) {
		this.agence = agence;
		this.agence.attach(this);
	}

	@Override
	void update() {
		System.out.println("channel 1 updated, state = " + agence.getState() );
	}

	
}
