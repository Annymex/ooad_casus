package nl.han.ooad.quebble.vraag;

import java.util.ArrayList;

public class KortAntwoordVraag extends Vraag {

	public KortAntwoordVraag(String vraag, char letter, ArrayList<Antwoord> antwoorden) {
		super(vraag, letter, antwoorden);
	}

	@Override
	public boolean controleerAntwoord(String gegevenAntwoord) {
		return antwoorden.stream()
				.anyMatch( (antwoord) -> gegevenAntwoord.equals(antwoord.getAntwoord()));
	}

	@Override
	public void printToConsole() {
		System.out.println( "Vraag: " + vraag );
	}
}
