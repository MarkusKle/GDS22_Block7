package Hase;

public class Osterhase extends Hase{

    public Osterhase(String name) {
        super(name);
    }

    @Override
    public void verteilen(){
        System.out.println(name +" verteilt Ostergeschenke und Eier");
    }

    @Override
    public void schlafen(){
        System.out.println(name + "schläft nie");
    }
}
