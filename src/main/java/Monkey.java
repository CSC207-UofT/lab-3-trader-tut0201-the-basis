public class Monkey implements Domesticatable, Tradable {

    @Override
    public String sound() {
        return "OOh OOh Ahh Ahh";
    }

    @Override
    public int getPrice() {
        return 100.5;
    }
}
