package Observer;

import Observer.FarmParameterObserver;

public class SoilMoistureSensor implements FarmParameterObserver {
    @Override
    public void update() {
        System.out.println("Soil moisture sensor received updated data.");
    }
}
