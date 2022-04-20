package Command;

public class OnCommand implements Command{
    private Ampolleta ampolleta;
    public OnCommand(Ampolleta ampolleta){
        this.ampolleta = ampolleta;
    }

    public void execute() {
        ampolleta.setEstado("On");
    }
}
