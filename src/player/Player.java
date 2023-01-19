package player;

import dice.Dice;

public class Player {
    private String name; //일반플레이어의 이름 (플레이어2의 이름)
    private Dice dice;
    private int dicescore = 0; //일반플레이어의 주사위 수
    //변수들을 private으로 캡슐화한 뒤, getter를 사용

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
