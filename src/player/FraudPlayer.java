package player;

import dice.Dice;
import dice.FraudDice;

public class FraudPlayer extends Player {
    private Player player1; //사기플레이어 (플레이어 1)
    private FraudDice fraudDice; // 사기플레이어가 사용할 사기 주사위

    public FraudPlayer(String name, FraudDice fraudDice) {
        super(name, fraudDice);
        this.fraudDice = fraudDice;
    }

    public int cheat(Player player) {
        if ( this.getDiceScore() > this.player1.getDiceScore()) { //플레이어2가 이기고 있으면
            fraudDice.setMode(2); // strongmode
            return fraudDice.strongMode();
        }
        else if (this.player1.getDiceScore() - this.getDiceScore() >= 6) {// 6점차 이상으로 이기고 있으면
            fraudDice.setMode(1); // weakmode
            return fraudDice.weakMode();
        }
        else {
            fraudDice.setMode(0);
            return getDice().roll();
        }
    }



}
