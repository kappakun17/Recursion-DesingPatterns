package tool;

public class BMI{
    private double heightM;
    private double weightKg;

    public BMI(double heightM, double weightKg){
        this.heightM = heightM;
        this.weightKg = weightKg;
    }

    public double getHeightM(){
        return this.heightM;
    }

    public double getWeightKg(){
        return this.weightKg;
    }

    public double getValue(){
        return this.weightKg / (this.heightM*this.heightM);
    }

    public String toString(){
        return this.heightM + " merters, " + this.weightKg + "kg BMI:" + this.getValue();
    }


}