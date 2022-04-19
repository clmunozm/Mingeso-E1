package Command;

public class OffCommand extends CommandClass{

    public OffCommand(Ampolleta ampolleta){
        super(ampolleta);
    }

    public Ampolleta execute() {
        ampolleta.setEstado("Off");
        return ampolleta;
    }
}
