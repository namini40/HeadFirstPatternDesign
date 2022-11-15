package amini.codes.headfirstdesignpatterns;

public class Run {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay display = new CurrentConditionsDisplay(weatherData);
        
        weatherData.setMeasurements(23.12f, 13.56f, 67.89f);
        weatherData.setMeasurements(26.11f, 63.55f, 92.52f);
        weatherData.setMeasurements(33.17f, 15.59f, 78.43f);

    }
}
