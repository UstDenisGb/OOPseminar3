package OOPseminar1;

import static java.lang.Character.getName;

public class HotDrink extends Product {
    public HotDrink(String name, int volume, int temperature) {
        super(name, volume, temperature);
    }

    @Override
    public String toString() {
        return String.format("У напитка " + getName() + " объем " + getVolume() + " и температура " + getTemperature());
    }
}

