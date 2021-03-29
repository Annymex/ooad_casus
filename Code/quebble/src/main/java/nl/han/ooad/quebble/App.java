package nl.han.ooad.quebble;

<<<<<<< HEAD
=======
import java.lang.reflect.Array;
>>>>>>> 01025f824b7be2f946aca3ba6ddf943042d35456
import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ArrayList<Antwoord> antwoordenVraag1 = new ArrayList<>();
        antwoordenVraag1.add(new MeerkeuzeAntwoord ("fout1", false));
        antwoordenVraag1.add(new MeerkeuzeAntwoord ("fout2", false));
        antwoordenVraag1.add(new MeerkeuzeAntwoord ("fout3", false));
        antwoordenVraag1.add(new MeerkeuzeAntwoord ("correct", true));
//        MeerkeuzeAntwoord testAntwoord1 = new MeerkeuzeAntwoord ("fout1", false);
//        MeerkeuzeAntwoord testAntwoord2 = new MeerkeuzeAntwoord ("fout2", false);
//        MeerkeuzeAntwoord testAntwoord3 = new MeerkeuzeAntwoord ("fout3", false);
//        MeerkeuzeAntwoord testAntwoord4 = new MeerkeuzeAntwoord ("correct", true);

        ArrayList<Antwoord> antwoordenVraag2 = new ArrayList<>();
        antwoordenVraag2.add(new KortAntwoordVraagAntwoord ("goed"));
        antwoordenVraag2.add(new KortAntwoordVraagAntwoord ("ook goed"));

        ArrayList<Antwoord> antwoordenVraag3 = new ArrayList<>();
        antwoordenVraag3.add(new KortAntwoordVraagAntwoord ("goed"));
//        KortAntwoordVraagAntwoord testAntwoord5 = new KortAntwoordVraagAntwoord ("goed");
//        KortAntwoordVraagAntwoord testAntwoord6 = new KortAntwoordVraagAntwoord ("ook goed");
//        KortAntwoordVraagAntwoord testAntwoord7 = new KortAntwoordVraagAntwoord ("goed");

        MeerkeuzeVraag vraag1 = new MeerkeuzeVraag(antwoordenVraag1);
        KortAntwoordVraag vraag2 = new KortAntwoordVraag(antwoordenVraag2);
        KortAntwoordVraag vraag3 = new KortAntwoordVraag(antwoordenVraag3);

    }
}
