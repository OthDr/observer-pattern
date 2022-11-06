package channels;

public class NewChannel2 extends Channel {

	public NewChannel2(Agence agence) {
		this.agence = agence;
		this.agence.attach(this);
	}

	@Override
	void update() {
		System.out.println("channel 2 updated, state = " + agence.getState() );
	}
}
