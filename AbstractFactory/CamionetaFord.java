package AbstractFactory;

public class CamionetaFord implements Camioneta{
    @Override
    public String getMarca() {
        return "Ford";
    }
    public String getTipoTransporte() {
        return "Camioneta";
    }
    @Override
    public void Drive() {
    System.out.println("Sonido Motor Camioneta Ford");
    }
}
