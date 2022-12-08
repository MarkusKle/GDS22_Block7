package Hase;

public class HaseDemoApp {
    public static void main(String[] args) {

        Hase hase = new Hase("Normaler Feldhase");

        hase.fressen();
        hase.verteilen();

        Weihnachtshase santa = new Weihnachtshase("Santa", "Christkind");
        santa.fressen();
        santa.schlafen();
        santa.verteilen();

        Osterhase felix =new Osterhase("Felix");

        felix.schlafen();
        felix.fressen();
        felix.verteilen();

        // Up-Casting
        System.out.println("-------------");
        Hase h1 = santa;
        h1.verteilen();


        System.out.println(santa.getBestFriend());

        Hasenstall hoppelWiese = new Hasenstall();
        hoppelWiese.add(hase);
        hoppelWiese.add(santa);
        hoppelWiese.add(felix);

        System.out.println("----------------- Verteilen von HoppleWiese");
        hoppelWiese.verteilen();

        hoppelWiese.fuettern();

        // Down-Casting
        Weihnachtshase wh = (Weihnachtshase) h1;
        System.out.println(wh.getBestFriend());


        // Down-Casting mit ClassCastExceptions Fehler beim Ausführen, da hase kein getBestFriend kennt
        Weihnachtshase wh1 = (Weihnachtshase) hase;
        System.out.println(wh1.getBestFriend());


    }
}
