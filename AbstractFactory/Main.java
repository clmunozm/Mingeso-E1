package AbstractFactory;

public class Main {
    public static void main(String[] args) {
        System.out.println("----------------------------------------");
		System.out.println("Patrón Abstract Factory");
		System.out.println("----------------------------------------");
        Factory Ford = new FordFactory();
        Factory Chevrolet = new ChevroletFactory();
        Auto auto1 = Ford.createAuto();
        auto1.Drive();
        Camioneta camioneta1 = Chevrolet.createCamioneta();
        camioneta1.Drive();
    }
}
