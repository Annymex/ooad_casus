package nl.han.ooad.quebble;

public class KortAntwoordVraag extends Vraag {

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
