package tool;

import java.util.Random;

public class RandomWrapper { 
    public static double getRanDouble(double min, double max){
        Random r = new Random();
        return min + (max - min) * r.nextDouble();
    }
    public static int getRanInt(int min, int max){
        Random r = new Random();
        return min + (max - min) * r.nextInt();
    }

    public static boolean ranBoolean(){
        return new Random().nextBoolean();
    }
}