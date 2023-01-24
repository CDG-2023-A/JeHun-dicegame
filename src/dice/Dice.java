package dice;

import java.util.Random;
public class Dice {
    Random random = new Random();
    public int roll() {
        return random.nextInt(6) + 1; //1~6까지의 주사위 굴리기
    }
}
