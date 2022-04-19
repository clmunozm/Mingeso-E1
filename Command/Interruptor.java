package Command;

public class Interruptor {
    
    public Interruptor(){

    }
    public void Accionar(CommandClass command){
        command.change();
    }
}
