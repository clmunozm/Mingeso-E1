package Command;

import java.util.ArrayList;
import java.util.List;

public class Interruptor {
    private List<Command>commandList = new ArrayList<Command>(); 
    public void takeOrder(Command command){
        commandList.add(command);		
    }
    public void accionar(){
        for (Command command :commandList) {
            command.execute();
        }
        commandList.clear();
    }
}
