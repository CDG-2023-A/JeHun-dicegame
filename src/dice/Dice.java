package dice;

import java.util.Random;
public class Dice {
    Random randomnum = new Random();
    public int roll() {
        return randomnum.nextInt(6) + 1; //1~6까지의 주사위 굴리기
    }
}
