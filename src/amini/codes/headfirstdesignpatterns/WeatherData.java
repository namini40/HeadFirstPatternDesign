package amini.codes.headfirstdesignpatterns;

import java.util.ArrayList;

public class WeatherData implements Subject {
    private ArrayList observers;
    private float temperature = getTemperature();
    private float humidity = getHumidity();
    private float pressure = getPressure();

    public WeatherData(){
        observers = new ArrayList<>();
    }



    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
        
    }






    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if(i>=0){
            observers.remove(i);
        }
        
    }

    @Override
    public void notifyObservers() {
        for(int i=0; i<observers.size(); i++){
            Observer observer = (Observer) observers.get(i);
            observer.update(temperature, humidity, pressure);
        }
        
    }

    public void measurementChanged(){
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementChanged();
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
}
