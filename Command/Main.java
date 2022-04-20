package Command;

public class Main {
    public static void main(String[] args) {
        System.out.println("----------------------------------------");
		System.out.println("Patrón Command");
		System.out.println("----------------------------------------");
        Ampolleta ampolleta = new Ampolleta();
        OnCommand on = new OnCommand(ampolleta);
        OffCommand off = new OffCommand(ampolleta);
        Interruptor interruptor = new Interruptor();
        interruptor.takeOrder(on);
        interruptor.takeOrder(off);
        interruptor.takeOrder(on);
        interruptor.accionar();
    }
}