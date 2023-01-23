package player;

import dice.Dice;

public class Player {
    private String name; //일반플레이어의 이름 (플레이어2의 이름)
    private Dice dice;
    private int diceScore = 0; //일반플레이어의 주사위 수
    private int result = 0; //주사위 합산
    private int [] fraudAddScore = new int [5];
    private int [] normalAddScore = new int [5];
    private int i = 0;
    private int j = 0;

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
    public int getDiceScore() {
        return this.diceScore = getDice().roll();
    }
    public int getResult() {
        return this.result;
    }
    public int fraudAdd(int score) {
        if (i<5) {
            this.fraudAddScore[i] = score;
            this.result += this.fraudAddScore[i];
            i++;
            return getResult();
        }
        return getResult();
    }
    public int normalAdd(int score) {
        if (j<5) {
            this.normalAddScore[j] = score;
            this.result += this.normalAddScore[j];
            j++;
            return getResult();
        }
        return getResult();
    }
    public int versus() {
        return getResult();
    }
}
