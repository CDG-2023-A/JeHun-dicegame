package player;

import dice.Dice;

public class Player {
    private String name; //일반플레이어의 이름 (플레이어2의 이름)
    private Dice dice;
    private int dicescore = 0; //일반플레이어의 주사위 수
    private int tmp = getDice().roll(); //1~6까지 랜덤한 수를
    //변수들을 private으로 캡슐화한 뒤, getter를 사용

    public Player (String name, Dice dice) {
        this.name = name;
        this.dice = dice;
    }

    public String getName() {
        return this.name;
    }
    public Dice getDice() {
        return this.dice;
    }

    public int setDiceScore() { // DiceScore에 넣어주고
        return this.dicescore = tmp;
    }

    public int getDiceScore() { // 그것을 리턴
        return this.setDiceScore();
    }
}
