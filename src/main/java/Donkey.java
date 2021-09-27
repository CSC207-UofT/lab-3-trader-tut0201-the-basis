public class Donkey implements Drivable, Domesticatable, Tradable{
    private int maxSpeed = 10;
    private String[] children = {};
    private boolean reproductive = true;
    private int numberOfChildren = 1;

    public void reproduce(Donkey other){
        if (this.reproductive) {
            children[this.numberOfChildren] = "achraf " + this.numberOfChildren;
            other.children[other.numberOfChildren] = "achraf " + other.numberOfChildren;
            this.numberOfChildren++;
        }
    }
    public void setReproductive(boolean b){
        this.reproductive = b;
    }
    public int getNumberOfChildren(){
        return this.numberOfChildren;
    }

    @Override
    public String sound() {
        return "Neighhh";
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
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    @Override
    public int getPrice() {
        return 20;
    }

    @Override
    public String toString(){
        String id = super.toString();
        return id + " (Max speed: " + this.maxSpeed +")";
    }
}
