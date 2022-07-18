package observer.model;

public class Parishioner implements Observer{

    private String name;

    public Parishioner(String name, Observable observable) {
        this.name = name;
        observable.registerParishioner(this);
    }

    public void update(String newsChurch) {
        System.out.println(name + "узнал новость: " + newsChurch);
    }
}
