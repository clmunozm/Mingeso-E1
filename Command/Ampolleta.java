package Command;

public class Ampolleta {
    String estado;
    public Ampolleta(){
        this.estado = "Off";
    }
    public void setEstado(String estado) {
        this.estado = estado;
        if (estado == "On"){
            System.out.println("La Ampolleta esta encendida");
        }
        else{
            System.out.println("La Ampolleta esta apagada");
        }
    }

    public String getEstado() {
        return estado;
    }
}
