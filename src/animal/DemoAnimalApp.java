package animal;

public class DemoAnimalApp {
    public static void main(String[] args) {


        Beagle b = new Beagle("Schokolade");

        b.eyeColor = "Brown";
        b.weight = 4900;

        b.doSomething();
        System.out.println(b.eyeColor);

    }
}
