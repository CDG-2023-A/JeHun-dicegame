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

    public void cheat(Player player) {
        if ( this.getDicescore() > this.player1.getDicescore()) { //플레이어2가 이기고 있으면
            fraudDice.setMode(2); // strongmode
            fraudDice.strongMode();
        }
        else if (this.player1.getDicescore() - this.getDicescore() >= 6) {// 6점차 이상으로 이기고 있으면
            fraudDice.setMode(1); // weakmode
            fraudDice.weakMode();
        }
        else
            fraudDice.setMode(0);
    }



}
