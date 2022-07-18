package observer.model;

public interface Observable {
    void registerParishioner(Observer o);
    void removeParishioner(Observer o);
    void notifyParishioners();
}
