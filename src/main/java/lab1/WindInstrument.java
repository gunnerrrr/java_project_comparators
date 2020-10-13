package lab1;

import console_colors.ConsoleColors;

class WindInstrument extends MusicalInstrument {
    private int countOfValves;
    private double airColumnLength;
    private double thicknessOfTheTube;
    private TypeOfWindInstrument type;
    private  String  manufacturingMaterial;

    public WindInstrument(String name, String builders, double price, int yearOfManufacture, double weight, int countOfValves,double airColumnLength, double thicknessOfTheTube, TypeOfWindInstrument type, String manufacturingMaterial) {
        super(name, builders, price, yearOfManufacture,weight);
        this.countOfValves=countOfValves;
        this.airColumnLength=airColumnLength;
        this.thicknessOfTheTube=thicknessOfTheTube;
        this.type=type;
        this.manufacturingMaterial=manufacturingMaterial;
    }

    public boolean isCooper() {
        return manufacturingMaterial.equals("Cooper");
    }
    @Override
    public String toString() {
        return "Instrument is "+ ConsoleColors.GREEN+getName()+ ConsoleColors.BLACK+ ", builders is "
                +getBuilders()+", price is "+ ConsoleColors.BLUE+getPrice()+ ConsoleColors.BLACK+", year of manufacture is "
                +getYearOfManufacture()+", weight is "+getWeight()+", count of valves is "+countOfValves
                +", air column length is "+airColumnLength+", thickness is "+thicknessOfTheTube+
                ", manufacturing material is " + manufacturingMaterial+ ", type is"+ type.toString()+"\n";
    }
}
enum TypeOfWindInstrument {
    HORN,
    TRUMPET,
    TROMBONE,
    EUPHONIUM,
    TUBA,
    FLUTE,
    CLARINET,
    SAXOPHONE,
    BASSOON
}

