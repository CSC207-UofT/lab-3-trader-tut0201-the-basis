public class Panda implements Drivable, Domesticatable, Tradable {

    @Override
    public String sound() {
        return null;
    }

    @Override
    public void upgradeSpeed() {

    }

    @Override
    public void downgradeSpeed() {

    }

    @Override
    public int getMaxSpeed() {
        return 1;
    }

    @Override
    public int getPrice() {
        return 1000;
    }
}
