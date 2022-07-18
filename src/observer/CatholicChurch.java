package observer;

import observer.model.Observable;
import observer.model.Observer;

import java.util.ArrayList;
import java.util.List;

public class CatholicChurch implements Observable {

    private List<Observer> parishioners;
    private String newsChurch;

    public CatholicChurch() {
        parishioners = new ArrayList<>();
    }

    public void setNewsChurch(String newsChurch) {
        this.newsChurch = newsChurch;
        notifyParishioners();
    }

    @Override
    public void registerParishioner(Observer observer) {
        parishioners.add(observer);
    }

    @Override
    public void removeParishioner(Observer observer) {
        parishioners.remove(observer);
    }

    @Override
    public void notifyParishioners() {
        for (Observer observer : parishioners) {
            observer.update(newsChurch);
        }
    }
}
