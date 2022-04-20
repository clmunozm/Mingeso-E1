package Command;

public class OffCommand implements Command{
    private Ampolleta ampolleta;
    public OffCommand(Ampolleta ampolleta){
        this.ampolleta = ampolleta;
    }

    public void execute() {
        ampolleta.setEstado("Off");
        
    }
}
