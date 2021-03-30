package nl.han.ooad.quebble;

import java.util.ArrayList;

public class GespeeldeQuiz {

    private int datum;
    private int speelduur;
    private int score;
    private int vraagIndex;
    private QuizState quizState;
    private Woord woord;
    private Quiz quiz;
    private ArrayList<SpelerAntwoord> spelerAntwoorden;
    private ScoreBerekeningsStrategy scoreBerekening;
    private Letters letters;

    public GespeeldeQuiz(Quiz quiz) {
        this.quiz = quiz;
        this.vraagIndex = 0;
        this.quizState = QuizState.VRAGEN;
        this.spelerAntwoorden = new ArrayList<>();
        this.scoreBerekening = new StandaardBerekeningsStrategy();
    }

    public boolean nogEenActie() {
        return !quizState.equals( QuizState.SCORE );
    }

    public IPritableToConsole getActie() {
        IPritableToConsole actie;
        if (quiz.heeftNogEenVraag(vraagIndex)) {
            actie = quiz.getVraag(vraagIndex);
        } else {
            letters = getLetters();
            actie = letters;
            this.quizState = QuizState.LETTERS;
        }
        return actie;
    }

    private Letters getLetters() {

        ArrayList<Character> letters = new ArrayList<>();

        spelerAntwoorden.forEach(spelerAntwoord -> {
                    if (spelerAntwoord.isCorrect()) {
                        letters.add(spelerAntwoord.getLetter());
                    }
                }
        );
        return new Letters(letters);
    }

    public void verwerkReactie(String reactie) {

        switch(quizState) {
            case VRAGEN:
                verwerkAntwoord(reactie);
                break;
            case LETTERS:
                verwerkGemaaktWoord(reactie);
                break;
        }
    }

    private void verwerkAntwoord(String antwoord) {
        // verwerken antwoord
        Vraag huidigeVraag = quiz.getVraag(vraagIndex);
        vraagIndex++;
        spelerAntwoorden.add(new SpelerAntwoord(antwoord, huidigeVraag));
        // controleren of gamestate verandert moet worden
        if(quiz.isLaatsteVraag(vraagIndex)){
            this.quizState = QuizState.LETTERS;
        }
    }

    private void verwerkGemaaktWoord(String gemaaktWoord) {
        this.woord = new Woord(gemaaktWoord, letters);
        this.quizState = QuizState.SCORE;
    }

    public int getScore() {
        return scoreBerekening.berekenScore(this);
    }
}
