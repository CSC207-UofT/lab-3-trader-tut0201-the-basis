import java.util.Objects;

public class Gorilla implements Drivable, Domesticatable, Tradable {
    private int maxSpeed;

    public Gorilla() {
        this.maxSpeed = 10;
    }

    @Override
    public String sound() {
        return "meowwww!";
    }

    @Override
    public void upgradeSpeed() {
        this.maxSpeed++;
    }

    @Override
    public void downgradeSpeed() {
        this.maxSpeed--;
    }

    @Override
    public void getMaxSpeed() {
        return this.maxSpeed;
    }

    @Override
    public String toString(){
        String id = super.toString();
        return id + " (Gorrilla man speed: " + this.maxSpeed +")";
    }
    @Override
    public int getPrice() {
        return 10000000000000000000000000;
    }
    public String similarity(String person) {
        String k = "";
        if (Objects.equals(person, "black")){
            k = "yes" + person + " people are similarity to Gorillas";
        }
        return k;


    }
}
