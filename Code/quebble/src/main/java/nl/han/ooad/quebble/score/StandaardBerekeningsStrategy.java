package nl.han.ooad.quebble.score;

import nl.han.ooad.quebble.gespeeldequiz.GespeeldeQuiz;

public class StandaardBerekeningsStrategy implements ScoreBerekeningsStrategy {

    public int berekenScore(GespeeldeQuiz quiz) {
        return 100;
    }

}
