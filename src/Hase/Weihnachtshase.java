package Hase;

public class Weihnachtshase extends Hase {

    public String bestFriend;

    public Weihnachtshase(String name, String bestFriend) {
        super(name);
        this.bestFriend = bestFriend;
    }

    public String getBestFriend() {
        return bestFriend;
    }

    @Override
    public void verteilen(){
        System.out.println(name + " verteilt die Geschenke unter dem Christbaum. " + bestFriend + " hilft beim Verteilen");
    }

    @Override
    public String toString() {
        return "Weihnachtshase{" +
                "bestFriend='" + bestFriend + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
