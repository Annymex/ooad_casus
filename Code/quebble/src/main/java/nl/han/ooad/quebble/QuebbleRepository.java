package nl.han.ooad.quebble;

import java.util.ArrayList;

public class QuebbleRepository {

    ArrayList<Speler> spelers;
    ArrayList<Quiz> quizen;

    public QuebbleRepository() {
        spelers = initializeSpelers();
        quizen = initializeQuizen();
    }

    public Speler getSpeler(String username) {
        Speler speler = null;
        for (Speler s : spelers) {
            if (s.getGebruikersnaam().equals(username)) {
                speler = s;
            }
        }
        return speler;
    }

    private ArrayList<Speler> initializeSpelers() {
        spelers = new ArrayList<>();
        spelers.add(new Speler("Yab", "wachtwoord", 1000));
        return spelers;
    }

    private ArrayList<Quiz> initializeQuizen() {
        ArrayList<Antwoord> antwoordenVraag1 = new ArrayList<>();
        antwoordenVraag1.add(new MeerkeuzeAntwoord("fout1", false));
        antwoordenVraag1.add(new MeerkeuzeAntwoord("fout2", false));
        antwoordenVraag1.add(new MeerkeuzeAntwoord("fout3", false));
        antwoordenVraag1.add(new MeerkeuzeAntwoord("correct", true));

        ArrayList<Antwoord> antwoordenVraag2 = new ArrayList<>();
        antwoordenVraag2.add(new KortAntwoordVraagAntwoord("goed"));
        antwoordenVraag2.add(new KortAntwoordVraagAntwoord("ook goed"));

        ArrayList<Antwoord> antwoordenVraag3 = new ArrayList<>();
        antwoordenVraag3.add(new KortAntwoordVraagAntwoord("goed"));

        MeerkeuzeVraag vraag1 = new MeerkeuzeVraag(antwoordenVraag1);
        KortAntwoordVraag vraag2 = new KortAntwoordVraag(antwoordenVraag2);
        KortAntwoordVraag vraag3 = new KortAntwoordVraag(antwoordenVraag3);
    }

}
