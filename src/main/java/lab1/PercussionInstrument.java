package lab1;

import console_colors.ConsoleColors;

class PercussionInstrument extends MusicalInstrument {
    private TypeOfPercussionInstrument type;

    public PercussionInstrument(String name, String builders, double price, int yearOfManufacturing, double weight, TypeOfPercussionInstrument type) {
        super (name, builders, price, yearOfManufacturing, weight);
        this.type=type;
    }
    public TypeOfPercussionInstrument getType() {
        return type;
    }

    public void setType(TypeOfPercussionInstrument type) {
        this.type = type;
    }
    public boolean isDrums(){
        return type==TypeOfPercussionInstrument.BASS_DRUMS||type==TypeOfPercussionInstrument.SNARE_DRUMS;
    }
    @Override
    public String toString() {
        return "Instrument is "+ ConsoleColors.GREEN+getName()+ ConsoleColors.BLACK+ ", builders is "
                +getBuilders()+", price is "+ ConsoleColors.BLUE+getPrice()+ ConsoleColors.BLACK+", year of manufacture is "
                +getYearOfManufacture()+", weight is "+getWeight()+", type is "+type.toString()+"\n";
    }
}
enum TypeOfPercussionInstrument {
    TIMPANI,
    XYLOPHONE,
    CYMBALS,
    TRIANGLE,
    SNARE_DRUMS,
    BASS_DRUMS,
    TAMBOURINE,
    MARACAS,
    GONG,
    CHIMES
}
