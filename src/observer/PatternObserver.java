package observer;

import observer.model.Parishioner;

public class PatternObserver {

    public static void main(String[] args) {
        CatholicChurch catholicChurch = new CatholicChurch();

        new Parishioner("Мартин Лютер", catholicChurch);
        new Parishioner("Жан Кальвин", catholicChurch);

        catholicChurch.setNewsChurch("Инквизиция была ошибкой... месса Mea Culpa 12 марта 2000 года");
    }
}