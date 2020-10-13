package lab1;

import console_colors.ConsoleColors;

class  KeyboardInstrument extends MusicalInstrument {
private int countOfKeyboards;
private TypeOfKeyboardInstrument type;

public KeyboardInstrument(String name, String builders, double price, int yearOfManufacture, double weight, int countOfKeyboards, TypeOfKeyboardInstrument type) {
        super(name, builders, price, yearOfManufacture, weight);
        this.countOfKeyboards=countOfKeyboards;
        this.type=type;
        }
public int getCountOfKeyboards() {
        return countOfKeyboards;
        }
public void setCountOfKeyboards(int countOfKeyboards) {
        this.countOfKeyboards = countOfKeyboards;
        }
public TypeOfKeyboardInstrument getType() {
        return type;
        }
public void setType(TypeOfKeyboardInstrument type) {
        this.type = type;
        }
public boolean isElectric () {
        return type==TypeOfKeyboardInstrument.SYNTHESIZER;
        }

@Override
public String toString() {
        return "Instrument is "+ ConsoleColors.GREEN+getName()+ ConsoleColors.BLACK+ ", builders is "
        +getBuilders()+", price is "+ ConsoleColors.BLUE+getPrice()+ ConsoleColors.BLACK+", year of manufacture is "
        +getYearOfManufacture()+", weight is "+getWeight()+", count of keyboards is "+countOfKeyboards
        +", type is "+type.toString()+"\n";
        }
}
enum TypeOfKeyboardInstrument {
    ACCORDION,
    HARMONIUM,
    HARPSICHORD,
    ORGAN,
    PIANO,
    SYNTHESIZER
}

