package amini.codes.headfirstdesignpatterns;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class CurrentConditionsDisplay implements PropertyChangeListener, DisplayElement {

    private float temperature;
    private float humidity;
    private WeatherData weatherData;

    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        // weatherData.registerObserver(this);
        this.weatherData.addPropertyChangeListener(this);
    }

    @Override
    public void display() {
        System.out.println("Current Condition: " + temperature + " Degrees and " + humidity + "% humidity.");

    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
            if(evt.getPropertyName().equals("temperature")){
                this.temperature =(float) evt.getNewValue();
            }else if(evt.getPropertyName().equals("humidity")){
                this.humidity = (float) evt.getNewValue();
            }
            display();
    }

    // @Override
    // public void update(float temperature, float humidity, float pressure) {
    //     this.temperature = temperature;
    //     this.humidity = humidity;
    //     display();
    // }

   

}
