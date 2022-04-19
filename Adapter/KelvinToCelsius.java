package Adapter;

public class KelvinToCelsius extends TemperaturaCelsius{
    private TemperaturaKelvin temperatura;
    public KelvinToCelsius(TemperaturaKelvin temperatura){
        this.temperatura = temperatura;
    }

    @Override
    public double getTemp(){
        return (temperatura.getTemp() - 273.15);
    }
}
