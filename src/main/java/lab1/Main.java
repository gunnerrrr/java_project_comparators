package lab1;

import console_colors.ConsoleColors;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<MusicalInstrument> musicalInstruments = new ArrayList<MusicalInstrument>();
        List<StringInstrument> stringInstruments=new ArrayList<StringInstrument>();
        List<KeyboardInstrument> keyboardInstruments=new ArrayList<KeyboardInstrument>();
        List<PercussionInstrument> percussionInstruments=new ArrayList<PercussionInstrument>();
        List<WindInstrument> windInstruments=new ArrayList<WindInstrument>();
        List<MusicalInstrument> neededInstruments = new ArrayList<MusicalInstrument>();

        MusicalInstrumentStoreManager musicalInstrumentStoreManager = new MusicalInstrumentStoreManager(
                musicalInstruments,stringInstruments,keyboardInstruments,percussionInstruments
        );

        StringInstrument violin1= new StringInstrument("Violin","Stradivari", 3000,1520,1.23, 3, TypeOfStringInstrument.VIOLIN);
        StringInstrument violin2= new StringInstrument("Violin","Amati", 3000,1720,1.33, 3, TypeOfStringInstrument.VIOLIN);
        StringInstrument guitar= new StringInstrument("Guitar","Domingo Lopez ", 4000,2000,1.73, 6, TypeOfStringInstrument.GUITAR);
        StringInstrument electricBass= new StringInstrument("Electric Bass","Gibson", 10000,2010,2.23, 4, TypeOfStringInstrument.ELECTRIC_BASS);
        StringInstrument electricViolin= new StringInstrument("Electric Violin","Landman", 5000,2020,1.63, 3, TypeOfStringInstrument.ELECTRIC_VIOLIN);

        stringInstruments.add(violin1);
        stringInstruments.add(violin2);
        stringInstruments.add(guitar);
        stringInstruments.add(electricBass);
        stringInstruments.add(electricViolin);

        musicalInstruments.add(violin1);
        musicalInstruments.add(violin2);
        musicalInstruments.add(guitar);
        musicalInstruments.add(electricBass);
        musicalInstruments.add(electricViolin);

        PercussionInstrument drums1= new PercussionInstrument("Bass Drums","A. Adams", 8000,2019,5.63, TypeOfPercussionInstrument.BASS_DRUMS);
        PercussionInstrument drums2= new PercussionInstrument("Bass Drums","Avedis Zildjian Company", 22000,2020,7.63, TypeOfPercussionInstrument.BASS_DRUMS);
        PercussionInstrument maracas= new PercussionInstrument("Maracas","Abeba Corp.", 1000,2019,5.63, TypeOfPercussionInstrument.MARACAS);

        percussionInstruments.add(drums1);
        percussionInstruments.add(drums2);
        percussionInstruments.add(maracas);

        musicalInstruments.add(maracas);
        musicalInstruments.add(drums1);
        musicalInstruments.add(drums2);

        KeyboardInstrument piano= new KeyboardInstrument("Piano","Ukraine", 10000,2019,50.63, 61, TypeOfKeyboardInstrument.PIANO);
        KeyboardInstrument organ= new KeyboardInstrument("Organ","Cornel Zimmer", 100000,2006,200.63, 88, TypeOfKeyboardInstrument.ORGAN);
        KeyboardInstrument synthesizer= new KeyboardInstrument("Synthesizer","Korg", 12000,2015,3.63, 73, TypeOfKeyboardInstrument.SYNTHESIZER);

        keyboardInstruments.add(piano);
        keyboardInstruments.add(organ);
        keyboardInstruments.add(synthesizer);

        musicalInstruments.add(piano);
        musicalInstruments.add(organ);
        musicalInstruments.add(synthesizer);

        WindInstrument trumpet= new WindInstrument("Trumpet","Margraten", 3000,2012,1.63, 3, 30.1, 12.1, TypeOfWindInstrument.TRUMPET, "Cooper");
        WindInstrument saxophone= new WindInstrument("Saxophone","Yamaha", 5000,2019,2.63, 6, 50.1, 22.1, TypeOfWindInstrument.SAXOPHONE, "Gold");

        windInstruments.add(trumpet);
        windInstruments.add(saxophone);

        musicalInstruments.add(trumpet);
        musicalInstruments.add(saxophone);

        System.out.println("\n\n\n");
        System.out.println(musicalInstruments);

        musicalInstrumentStoreManager.sortByNameUp(musicalInstrumentStoreManager.new MusicalInstrumentNameComparator());
        System.out.println("\n\n\n Instruments after sorting name up:\n"+musicalInstruments);
        musicalInstrumentStoreManager.sortByNameDown();
        System.out.println("\n\n\n Instruments after sorting name down:\n"+musicalInstruments);
        musicalInstrumentStoreManager.sortByPriceUp(new MusicalInstrumentStoreManager.MusicalInstrumentPriceComparator());
        System.out.println("\n\n\n Instruments after sorting price up:\n"+musicalInstruments);
        musicalInstrumentStoreManager.sortByPriceDown();
        System.out.println("\n\n\n Instruments after sorting price down:\n"+musicalInstruments);

        System.out.println("\n\n\n All string instruments ");
        musicalInstrumentStoreManager.findByType(violin1);

        System.out.println("\n\n\n All keyboard instruments ");
        musicalInstrumentStoreManager.findByType(piano);

        System.out.println("\n\n\n All wind instruments ");
        musicalInstrumentStoreManager.findByType(trumpet);

        System.out.println("\n\n\n All percussion instruments ");
        musicalInstrumentStoreManager.findByType(drums1);

        neededInstruments=musicalInstrumentStoreManager.findMusicalInstrumentsNeedForRockGroup(musicalInstruments);
        System.out.println("\n\n\nNeeded instruments is:"+neededInstruments);

    }
}
