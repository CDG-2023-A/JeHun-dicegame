package player;

import dice.FraudDice;

public class FraudPlayer extends Player {
    private FraudDice fraudDice; // 사기플레이어가 사용할 사기 주사위

    public FraudPlayer(String name, FraudDice fraudDice) {
        super(name, fraudDice);
        this.fraudDice = fraudDice;
    }

    public int cheat1() {
        fraudDice.setMode(2); // strongmode
        return fraudDice.strongMode();
    }
    public int cheat2() {
        fraudDice.setMode(1); // weakmode
        return fraudDice.weakMode();
    }
    public int cheat3() {
        fraudDice.setMode(0);
        return fraudDice.normalMode();
    }
}
