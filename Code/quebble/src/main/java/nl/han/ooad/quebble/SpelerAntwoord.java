package nl.han.ooad.quebble;

public class SpelerAntwoord {

	private boolean isCorrect;
    private String antwoord;
	private Vraag vraag;

    public SpelerAntwoord(String antwoord, Vraag vraag) {
        this.antwoord = antwoord;
        this.vraag = vraag;
        isCorrect = vraag.controleerAntwoord(antwoord);
    }


    public Character getLetter() {
        return vraag.getLetter();
    }

    public boolean isCorrect() {
        return isCorrect;
    }
}
