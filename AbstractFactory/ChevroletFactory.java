package AbstractFactory;

public class ChevroletFactory implements Factory{
    @Override
    public Auto createAuto(){
        return new AutoChevrolet();
    }

    @Override
    public Camioneta createCamioneta(){
        return new CamionetaChevrolet();
    }
}
