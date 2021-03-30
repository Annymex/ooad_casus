package nl.han.ooad.quebble;

public class SpelerAntwoord {

    private final String antwoord;
    private final Vraag vraag;

    public SpelerAntwoord(String antwoord, Vraag vraag) {
        this.antwoord = antwoord;
        this.vraag = vraag;
    }

    public Character getLetter() {
        return vraag.getLetter();
    }

    public boolean isCorrect() {
        return vraag.controleerAntwoord(antwoord);
    }
}
