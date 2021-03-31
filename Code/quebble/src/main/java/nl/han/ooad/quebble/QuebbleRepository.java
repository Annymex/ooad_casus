package nl.han.ooad.quebble;

import nl.han.ooad.quebble.vraag.*;

import java.util.ArrayList;

public class QuebbleRepository {

    ArrayList<Speler> spelers;
    ArrayList<Quiz> quizen;

    public QuebbleRepository() {
        spelers = initializeSpelers();
        quizen = initializeQuizen();
    }

    public Speler getSpeler(String username) {
        return spelers.get(0);
    }

    public Quiz getGeschikteQuiz(Speler speler){
        return quizen.get(0);
    }

    private ArrayList<Speler> initializeSpelers() {
        spelers = new ArrayList<>();
        spelers.add(new Speler("Yab", "wachtwoord", 1000));
        return spelers;
    }

    private ArrayList<Quiz> initializeQuizen() {

        ArrayList<Quiz> quizen = new ArrayList<>();

        // quiz 1
        ArrayList<Vraag> vragen = new ArrayList<>();

        String vraag1 = "Wat is de hoofdstad van Peru?";
        Character letter1 = 'L';
        ArrayList<Antwoord> antwoorden1 = new ArrayList<>();
        antwoorden1.add(new MeerkeuzeAntwoord("Arequipa", false));
        antwoorden1.add(new MeerkeuzeAntwoord("Caracas", false));
        antwoorden1.add(new MeerkeuzeAntwoord("Lima", true));
        antwoorden1.add(new MeerkeuzeAntwoord("Santiago", false));
        vragen.add(new MeerkeuzeVraag(vraag1, letter1, antwoorden1));

        String vraag2 = "Hoe heet het officieuze landenkampioenschap tennis voor mannen?";
        Character letter2 = 'D';
        ArrayList<Antwoord> antwoorden2 = new ArrayList<>();
        antwoorden2.add(new MeerkeuzeAntwoord("Davis Cup", true));
        antwoorden2.add(new MeerkeuzeAntwoord("Diamond League", false));
        antwoorden2.add(new MeerkeuzeAntwoord("Fed Cup", true));
        antwoorden2.add(new MeerkeuzeAntwoord("Nations League", false));
        vragen.add(new MeerkeuzeVraag(vraag2, letter2, antwoorden2));

        String vraag3 = "Wat is de voornaam van de schepper van Miss Marple en Hercule Poirot?";
        Character letter3 = 'D';
        ArrayList<Antwoord> antwoorden3 = new ArrayList<>();
        antwoorden3.add(new MeerkeuzeAntwoord("Ruth", true));
        antwoorden3.add(new MeerkeuzeAntwoord("Emmy", false));
        antwoorden3.add(new MeerkeuzeAntwoord("Joanne", false));
        antwoorden3.add(new MeerkeuzeAntwoord("Agatha", true));
        vragen.add(new MeerkeuzeVraag(vraag3, letter3, antwoorden3));

        String vraag4 = "Welke van de volgende Engelse voetbalclub is afkomstig uit Liverpool?";
        Character letter4 = 'E';
        ArrayList<Antwoord> antwoorden4 = new ArrayList<>();
        antwoorden4.add(new MeerkeuzeAntwoord("Arsenal", false));
        antwoorden4.add(new MeerkeuzeAntwoord("Chelsea", false));
        antwoorden4.add(new MeerkeuzeAntwoord("Everton", true));
        antwoorden4.add(new MeerkeuzeAntwoord("Tottenham Hotspur", false));
        vragen.add(new MeerkeuzeVraag(vraag4, letter4, antwoorden4));

        String vraag5 = "Wat is de hoofdstad van het Franse departement Vaucluse die we kennen uit een heel bekend liedje over een\n" +
                "brug?";
        Character letter5 = 'A';
        ArrayList<Antwoord> antwoorden5 = new ArrayList<>();
        antwoorden5.add(new KortAntwoordVraagAntwoord("Avignon"));
        vragen.add(new KortAntwoordVraag(vraag5, letter5, antwoorden5));

        String vraag6 = "Welke band stond in 2008 in de hitparade met de song Viva La Vida?";
        Character letter6 = 'C';
        ArrayList<Antwoord> antwoorden6 = new ArrayList<>();
        antwoorden6.add(new KortAntwoordVraagAntwoord("Coldplay"));
        vragen.add(new KortAntwoordVraag(vraag6, letter6, antwoorden6));

        String vraag7 = "Wat is de bijnaam van de Conservatieve Partij in Engeland?";
        Character letter7 = 'T';
        ArrayList<Antwoord> antwoorden7 = new ArrayList<>();
        antwoorden7.add(new KortAntwoordVraagAntwoord("Tory"));
        antwoorden7.add(new KortAntwoordVraagAntwoord("Tories"));
        antwoorden7.add(new KortAntwoordVraagAntwoord("The Tories"));
        vragen.add(new KortAntwoordVraag(vraag7, letter7, antwoorden7));

        String vraag8 = "Welke stad ligt in twee continenten?";
        Character letter8 = 'I';
        ArrayList<Antwoord> antwoorden8 = new ArrayList<>();
        antwoorden8.add(new KortAntwoordVraagAntwoord("Instanboel"));
        antwoorden8.add(new KortAntwoordVraagAntwoord("Instanbul"));
        vragen.add(new KortAntwoordVraag(vraag8, letter8, antwoorden8));

        quizen.add(new Quiz(vragen));

        return quizen;
    }

}
