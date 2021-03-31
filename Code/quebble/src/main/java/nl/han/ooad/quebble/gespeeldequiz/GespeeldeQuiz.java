package nl.han.ooad.quebble.gespeeldequiz;

import nl.han.ooad.quebble.IPrintableToConsole;
import nl.han.ooad.quebble.Quiz;
import nl.han.ooad.quebble.score.ScoreBerekeningsStrategy;
import nl.han.ooad.quebble.score.StandaardBerekeningsStrategy;
import nl.han.ooad.quebble.vraag.Vraag;
import nl.han.ooad.quebble.woord.Woord;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class GespeeldeQuiz {

    private final Quiz quiz;
    private final ArrayList<SpelerAntwoord> spelerAntwoorden;
    private final LocalDate datum;
    private final LocalDateTime start;
    private ScoreBerekeningsStrategy scoreBerekeningsStrategy;
    private LocalDateTime eind;
    private int vraagIndex;
    private QuizState quizState;
    private Woord gemaaktWoord;
    private Letters letters;

    public GespeeldeQuiz(Quiz quiz) {
        this.quiz = quiz;
        this.vraagIndex = 0;
        this.quizState = QuizState.VRAGEN;
        this.start = LocalDateTime.now();
        this.datum = LocalDate.now();
        this.spelerAntwoorden = new ArrayList<>();
        this.scoreBerekeningsStrategy = new StandaardBerekeningsStrategy();
    }

    public boolean nogEenActie() {
        return !quizState.equals(QuizState.SCORE);
    }

    public IPrintableToConsole getActie() {

        IPrintableToConsole actie = null;

        switch (quizState) {
            case VRAGEN:
                actie = quiz.getVraag(vraagIndex);
                break;
            case LETTERS:
                this.letters = getLetters();
                actie = letters;
                this.quizState = QuizState.LETTERS;
                break;
        }

        return actie;
    }

    public void verwerkReactie(String reactie) {

        switch (quizState) {
            case VRAGEN:
                verwerkAntwoord(reactie);
                break;
            case LETTERS:
                verwerkGemaaktWoord(reactie);
                break;
        }
    }

    public int getScore() {
        return scoreBerekeningsStrategy.berekenScore(this);
    }

    public void setScoreBerekeningStrategy(ScoreBerekeningsStrategy scoreBerekeningStrategy) {
        this.scoreBerekeningsStrategy = scoreBerekeningStrategy;
    }

    private void verwerkAntwoord(String antwoord) {
        // verwerken antwoord
        Vraag huidigeVraag = quiz.getVraag(vraagIndex);
        vraagIndex++;
        spelerAntwoorden.add(new SpelerAntwoord(antwoord, huidigeVraag));
        // controleren of gamestate verandert moet worden
        if (!quiz.heeftNogEenVraag(vraagIndex)) {
            this.quizState = QuizState.LETTERS;
        }
    }

    private void verwerkGemaaktWoord(String gemaaktWoord) {
        this.gemaaktWoord = new Woord(gemaaktWoord, letters);
        this.eind = LocalDateTime.now();
        this.quizState = QuizState.SCORE;
    }

    private Letters getLetters() {

        ArrayList<Character> letters = spelerAntwoorden.stream()
                .filter(SpelerAntwoord::isCorrect)
                .map(SpelerAntwoord::getLetter)
                .collect(Collectors.toCollection(ArrayList::new));

        return new Letters(letters);
    }

    public ArrayList<SpelerAntwoord> getSpelerAntwoorden() {
        return this.spelerAntwoorden;
    }

    public LocalDateTime getStart() {
        return start;
    }

    public LocalDateTime getEind() {
        return eind;
    }
}
