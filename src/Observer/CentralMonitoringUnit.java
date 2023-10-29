package Observer;

import java.util.ArrayList;

public class CentralMonitoringUnit  implements FarmParameterSubject {
    private ArrayList<FarmParameterObserver> observers = new ArrayList<>();
    public String monitoredParameter;

    public CentralMonitoringUnit(String soilMoisture) {
    }

    public void collectData() {
        System.out.println("Analyzing " + monitoredParameter + " data...");
        notifyObservers();
    }

    @Override
    public void attach(FarmParameterObserver observer) {
        observers.add(observer);
    }

    @Override
    public void detach(FarmParameterObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (FarmParameterObserver observer : observers) {
            observer.update();
        }
    }
}
