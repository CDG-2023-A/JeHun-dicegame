package player;

import dice.Dice;

public class Player {
    public String name; //일반플레이어의 이름 (플레이어2의 이름)
    public Dice dice;
    public int dicescore = 0; //일반플레이어의 주사위 수

    public String getName() {
        return this.name;
    }
    public Dice getDice() {
        return this.dice;
    }
    public Player (String name, Dice dice) {
        this.name = name;
        this.dice = dice;
    }
}
