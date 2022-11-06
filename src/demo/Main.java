package demo;

import channels.Agence;
import channels.NewChannel1;
import channels.NewChannel2;

public class Main {
	public static void main(String[] args) {

		Agence agence = new Agence();

		new NewChannel1(agence);
		new NewChannel2(agence);
		
		System.out.println("\n--------------------------------------\nstate changed to TRUE \n");
		agence.setState(true);
		
		System.out.println("\n--------------------------------------\nstate changed to FALSE \n");
		agence.setState(false);

	}
}
