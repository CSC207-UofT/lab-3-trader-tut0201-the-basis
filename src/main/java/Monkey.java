public class Monkey implements Domesticatable, Tradable {

    @Override
    private String sound() {
        return "OOh OOh Ahh Ahh";
    }

    @Override
    public int getPrice() {
        return 100;
    }
}
