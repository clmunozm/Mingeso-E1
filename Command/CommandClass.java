package Command;

public class CommandClass {
    public Ampolleta ampolleta;
    public OnCommand on;
    public OffCommand off;

    CommandClass(Ampolleta ampolleta) {
        this.ampolleta = ampolleta;
        this.on = new OnCommand(this.ampolleta);
        this.off = new OffCommand(this.ampolleta);
    }

    public void change() {
        if(ampolleta.getEstado() == "On"){
            off.execute();
            System.out.println ("La ampolleta se ha apagado");
        }
        else{
            on.execute();
            System.out.println ("La ampolleta se ha encendido");
        }

    }

}
