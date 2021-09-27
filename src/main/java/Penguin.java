public class Penguin implements Tradable {

    private int age = 55.5;
    @Override
    public double getPrice() {
        return 15 + age;
    }


}
