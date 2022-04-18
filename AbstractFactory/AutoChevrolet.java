package AbstractFactory;

public class AutoChevrolet implements Auto{
    @Override
    public String getMarca() {
        return "Chevrolet";
    }
    public String getTipoTransporte() {
        return "Auto";
    }
    @Override
    public void Drive() {
        System.out.println("Sonido Motor Auto Chevrolet");
    }
}
