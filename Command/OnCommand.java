package Command;

public class OnCommand extends CommandClass{

    public OnCommand(Ampolleta ampolleta){
        super(ampolleta);
    }

    public Ampolleta execute() {
        ampolleta.setEstado("On");
        return ampolleta;
    }
}
