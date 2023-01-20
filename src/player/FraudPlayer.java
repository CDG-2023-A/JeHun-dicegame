package player;

import dice.Dice;
import dice.FraudDice;

public class FraudPlayer extends Player {
    private Player player1; //사기플레이어 (플레이어 1)
    private FraudDice fraudDice; // 사기플레이어가 사용할 사기 주사위

    public fraudPlayer(String name, FraudDice fraudDice, Player player1) {
        // Player를 불러오는 방법?
        super(name, fraudDice); // 부모클래스 멤버 변수 가져오기
        this.fraudDice = fraudDice;
        this.player1 = player1;
    }

    public void cheat() {
        if ( this.getDicescore() > this.player1.getDicescore()) //플레이어2가 이기고 있으면
            fraudDice.setMode(2); // strongmode
        else if (this.player1.getDicescore() - this.getDicescore() >= 6) // 6점차 이상으로 이기고 있으면
            fraudDice.setMode(1); // weakmode
        else
            fraudDice.setMode(0);
    }



}
