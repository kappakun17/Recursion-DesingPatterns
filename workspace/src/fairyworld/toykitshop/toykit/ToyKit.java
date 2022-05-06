package toykitshop.toykit;

public interface ToyKit{
    abstract public String getName();
    abstract public String getDescription();
    abstract public int getTotalCost();
    abstract public ToyHead getToyHead();
    abstract public ToyBody getToyBody();
    abstract public ToyLeftArm getToyLeftArm();
    abstract public ToyRightArm getToyRightArm();
    abstract public ToyLeftFoot getLeftFoot();
    abstract public ToyRightFoot getRightFoot();
    abstract public ArrayList<String> checkRecommendedAge(Person person);
    abstract public void getRecommendedAge(Person person);
}