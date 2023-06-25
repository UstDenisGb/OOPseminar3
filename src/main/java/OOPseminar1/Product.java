package OOPseminar1;

public abstract class Product {
    private String name1;
    private int volume;
    private int temperature;

    public Product(String name1, int volume, int temperature) {
        this.name1 = name1;
        this.volume = volume;
        this.temperature = temperature;
    }

    public String getName() {
        return name1;
    }
    public void setName(String name1) {
        this.name1 = name1;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
}
