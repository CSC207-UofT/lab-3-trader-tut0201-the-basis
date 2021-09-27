public class Monkey implements Domesticatable, Tradable {

    private boolean True;

    @Override
    public String sound() {
        return "OOh OOh Ahh Ahh";
    }

    @Override
    public int getPrice() {
        return 100;
    }

    public boolean canClimb() {
        return True;
    }

}
