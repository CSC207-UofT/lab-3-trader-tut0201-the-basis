public class Monkey implements Domesticatable, Tradable {

    private boolean True;

    @Override
    private String sound() {
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
