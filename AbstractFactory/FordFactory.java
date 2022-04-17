package AbstractFactory;

public class FordFactory implements Factory{

    @Override
    public Auto createAuto(){
        return new AutoFord();
    }

    @Override
    public Camioneta createCamioneta(){
        return new CamionetaFord();
    }
}
