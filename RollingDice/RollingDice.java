import java.util.Random;
public class RollingDice {
    
    public static void main(String[] args) {

        Random diceNumber = new Random();
        int x = diceNumber.nextInt(6) + 1;

        System.out.println("You rolled a: " + x);
    }
}
