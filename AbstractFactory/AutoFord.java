package AbstractFactory;

public class AutoFord implements Auto{
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
