package lab1;

import org.jetbrains.annotations.NotNull;

import java.util.Comparator;
import java.util.List;

public class MusicalInstrumentStoreManager {
    private List<MusicalInstrument> musicalInstruments;
    private List<StringInstrument> stringInstruments;
    private List<KeyboardInstrument> keyboardInstruments;
    private List<PercussionInstrument> percussionInstruments;


    MusicalInstrumentStoreManager(List<MusicalInstrument> musicalInstruments, List<StringInstrument> stringInstruments,
                                  List<KeyboardInstrument> keyboardInstruments, List<PercussionInstrument> percussionInstruments) {
        this.musicalInstruments=musicalInstruments;
        this.percussionInstruments=percussionInstruments;
        this.keyboardInstruments=keyboardInstruments;
        this.stringInstruments=stringInstruments;
    }
    public void findByType (MusicalInstrument musicalInstrument) {
        for(MusicalInstrument instrument:musicalInstruments) {
            if ( instrument.getClass() == musicalInstrument.getClass()) {
                System.out.println(instrument);
            }
        }
    }
    public void sortByNameUp(Comparator<MusicalInstrument> instrumentNameComparator) {
        musicalInstruments.sort(instrumentNameComparator);
    }
    public void sortByPriceUp(Comparator<MusicalInstrument> instrumentPriceComparator) {
        musicalInstruments.sort(instrumentPriceComparator);
    }    public void sortByPriceDown() {
        musicalInstruments.sort(new Comparator<MusicalInstrument>() {
            @Override
            public int compare(MusicalInstrument o1, MusicalInstrument o2) {
                if(o1.getPrice()==o2.getPrice())
                    return 0;
                return o1.getPrice()<o2.getPrice()? 1: -1;        }
        } );
    }    public void sortByNameDown() {
        musicalInstruments.sort((MusicalInstrument o1, MusicalInstrument o2) ->o2.getName().compareTo(o1.getName()));
    }
    public List<MusicalInstrument> findMusicalInstrumentsNeedForRockGroup (@NotNull List<MusicalInstrument> neededInstruments) {
        neededInstruments.clear();
        for(StringInstrument stringInstrument:stringInstruments) {
            if(stringInstrument.isElectric()|| stringInstrument.getType()==TypeOfStringInstrument.GUITAR) {
                neededInstruments.add(stringInstrument);
            }
        }
        for(KeyboardInstrument keyboardInstrument:keyboardInstruments) {
            if(keyboardInstrument.isElectric()) {
                neededInstruments.add(keyboardInstrument);
            }
        }
        for(PercussionInstrument percussionInstrument:percussionInstruments) {
            if(percussionInstrument.isDrums()) {
                neededInstruments.add(percussionInstrument);
            }
        }
        return neededInstruments;
    }
    public static class MusicalInstrumentPriceComparator implements Comparator<MusicalInstrument> {

        @Override
        public int compare(@NotNull MusicalInstrument o1, @NotNull MusicalInstrument o2) {
            if(o1.getPrice()==o2.getPrice())
                return 0;
            return o1.getPrice()>o2.getPrice()? 1: -1;
        }
    }
    public class MusicalInstrumentNameComparator implements Comparator<MusicalInstrument> {

        @Override
        public int compare(@NotNull MusicalInstrument o1, @NotNull MusicalInstrument o2) {
            return o1.getName().compareTo(o2.getName());
        }
    }
}


