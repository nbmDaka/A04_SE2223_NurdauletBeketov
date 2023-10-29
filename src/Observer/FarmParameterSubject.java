package Observer;

import Observer.FarmParameterObserver;

public interface FarmParameterSubject {
    void attach(FarmParameterObserver observer);
    void detach(FarmParameterObserver observer);
    void notifyObservers();
}
