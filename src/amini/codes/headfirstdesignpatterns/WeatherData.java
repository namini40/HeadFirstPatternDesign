package amini.codes.headfirstdesignpatterns;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;

public class WeatherData{
    // private ArrayList observers;
    private float temperature = getTemperature();
    private float humidity = getHumidity();
    private float pressure = getPressure();


    private final PropertyChangeSupport pcs;

    public WeatherData(){
        pcs =  new PropertyChangeSupport(this);
         // observers = new ArrayList<>();
    }



    // @Override
    // public void registerObserver(Observer o) {
    //     observers.add(o);
        
    // }






    // @Override
    // public void removeObserver(Observer o) {
    //     int i = observers.indexOf(o);
    //     if(i>=0){
    //         observers.remove(i);
    //     }
        
    // }

    // @Override
    // public void notifyObservers() {
    //     for(int i=0; i<observers.size(); i++){
    //         Observer observer = (Observer) observers.get(i);
    //         observer.update(temperature, humidity, pressure);
    //     }
        
    // }

    public void measurementChanged(){
        // notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure){
       
        // measurementChanged();
        pcs.firePropertyChange("temperature", this.temperature, temperature);
        this.temperature = temperature;

        pcs.firePropertyChange("humidity", this.humidity, humidity);
        this.humidity = humidity;

        pcs.firePropertyChange("pressure", this.pressure, pressure);
        this.pressure = pressure;
    }


    float getTemperature() {
        // does not matter how the temperature is calculated
        return 23.45f;
    }

    float getPressure() {
        // does not matter how the pressure is calculated
        return 23.45f;
    }

    float getHumidity() {
        // does not matter how the humidity is calculated
        return 23.45f;
    }


    public void addPropertyChangeListener(PropertyChangeListener listener) {
        pcs.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        pcs.removePropertyChangeListener(listener);
    }



    
}
