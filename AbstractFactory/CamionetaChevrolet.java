package AbstractFactory;

public class CamionetaChevrolet implements Camioneta{
    @Override
    public String getMarca() {
        return "Chevrolet";
    }
    public String getTipoTransporte() {
        return "Camioneta";
    }
    @Override
    public void Drive() {
    }
}
