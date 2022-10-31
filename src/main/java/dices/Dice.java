package dices;
import java.util.Random;


public class Dice {
	private final static Random random = new Random();

    public static int roll(int max) {
        return 1 + random.nextInt(max);
    }
    
    public static int roll2() {
    	return roll(2);
    }

    public static int roll6() {
        return roll(6);
    }
    
    public static int roll10() {
    	return roll(10);
    }
    
    public static int roll20() {
    	return roll(20);
    }
}
