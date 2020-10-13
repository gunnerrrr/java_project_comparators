package lab1;

import console_colors.ConsoleColors;

class StringInstrument extends MusicalInstrument {
    private int countOfStrings;
    private TypeOfStringInstrument type;

    public TypeOfStringInstrument getType() {
        return type;
    }

    public void setType(TypeOfStringInstrument type) {
        this.type = type;
    }

    public StringInstrument(String name, String builders, double price, int yearOfManufacture, double weight, int countOfStrings, TypeOfStringInstrument type) {
        super(name, builders, price, yearOfManufacture,weight);
        this.countOfStrings=countOfStrings;
        this.type=type;
    }

    public boolean isElectric() {
        return type == TypeOfStringInstrument.ELECTRIC_BASS || type==TypeOfStringInstrument.ELECTRIC_VIOLIN;
    }
    @Override
    public String toString() {
        return "Instrument is "+ConsoleColors.GREEN+getName()+ ConsoleColors.BLACK+ ", builders is "
                +getBuilders()+", price is "+ ConsoleColors.BLUE+getPrice()+ ConsoleColors.BLACK+", year of manufacture is "
                +getYearOfManufacture()+", weight is "+getWeight()+", count of strings is "+countOfStrings
                +", type is "+type.toString()+"\n";
    }

}
enum TypeOfStringInstrument {
    VIOLIN,
    GUITAR,
    ELECTRIC_BASS,
    ELECTRIC_VIOLIN,
    VIOLA,
    CELLO,
    DOUBLE_BASS,
    BANJO,
    MANDOLIN,
    HARP,
    UKULELE
}
