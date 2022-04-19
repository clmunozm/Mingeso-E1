package Adapter;

public class Main {
    public static void main(String[] args) {
        System.out.println("----------------------------------------");
		System.out.println("Patrón Adapter");
		System.out.println("----------------------------------------");
        TemperaturaKelvin temperatura = new TemperaturaKelvin(300);
        KelvinToCelsius temperatura2 = new KelvinToCelsius(temperatura);
        Termometro termometro = new Termometro();
        termometro.MostrarTemp(temperatura2);
    }
}
