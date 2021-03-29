package nl.han.ooad.quebble;

import java.util.ArrayList;

public class MeerkeuzeVraag extends Vraag {

	public MeerkeuzeVraag(String vraag, char letter, ArrayList<Antwoord> antwoorden) {
		super(vraag, letter, antwoorden);
	}

	@Override
	public boolean controleerAntwoord(String gegevenAntwoord) {
		return antwoorden.stream()
				.anyMatch( (antwoord) -> antwoord.isGelijk(gegevenAntwoord) && ((MeerkeuzeAntwoord)antwoord).isCorrect() );
	}

	@Override
	public void printToConsole() {

		System.out.println("Vraag: " + vraag);
		System.out.println("A. " + antwoorden.get(0));
		System.out.println("B. " + antwoorden.get(1));
		System.out.println("C. " + antwoorden.get(2));
		System.out.println("D. " + antwoorden.get(3));

	}
}
