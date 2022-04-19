package Adapter;

public class Termometro {

    public Termometro(){

    }
    
    public void MostrarTemp(TemperaturaCelsius temp){
        System.out.println ("La temperatura es de: " + temp.getTemp() + " Celsius");
    }
}
