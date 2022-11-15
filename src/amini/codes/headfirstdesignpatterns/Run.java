package amini.codes.headfirstdesignpatterns;

public class Run {
    /*
    Due to the deprication of Observable (java.util.Observable) the alternative used is 
    PropertyChangeListener. the implementation is similar but a little needs a little notice for notifying 
    observers (aka listeners)
    Subject: PropertyChangeSupport
    Observer: PropertyChangeListener
    */
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay display = new CurrentConditionsDisplay(weatherData);
        
        weatherData.setMeasurements(23.12f, 13.56f, 67.89f);
        // weatherData.setMeasurements(26.11f, 63.55f, 92.52f);
        // weatherData.setMeasurements(33.17f, 15.59f, 78.43f);

    }
}
