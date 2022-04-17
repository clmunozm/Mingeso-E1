package AbstractFactory;

public class CamionetaFord implements Camioneta{
    @Override
    public String getMarca() {
        return "Ford";
    }
    public String getTipoTransporte() {
        return "Auto";
    }
    @Override
    public void Drive() {
    }
}
