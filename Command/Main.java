package Command;

public class Main {
    public static void main(String[] args) {
        System.out.println("----------------------------------------");
		System.out.println("Patrón Command");
		System.out.println("----------------------------------------");
    }
    
    Interruptor interr = new Interruptor();
    Ampolleta ampolleta = new Ampolleta();
    CommandClass command = new CommandClass(ampolleta);
    String h = ampolleta.getEstado();
