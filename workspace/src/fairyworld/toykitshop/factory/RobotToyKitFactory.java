package toykitshop.factory;


public class RobotToyKitFactory implements ToyKitFactory{
    public ToyKit createToyByKit(){
        return new RobotToyKit();
    }
}