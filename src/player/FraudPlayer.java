package player;

import dice.FraudDice;

public class FraudPlayer{
    public Player player1; //사기플레이어 (플레이어 1)
    public FraudDice fraudDice; // 사기플레이어가 사용할 사기 주사위

    public void cheat() {
        if () //플레이어2가 이기고 있으면 -> 현재 점수 플레이어1과 2를 비교해야 함.. -> 클래스가 나눠진 상태로는 어떻게?
            fraudDice.setMode(2); // strongmode
        else if () // 6점차 이상으로 이기고 있으면
            fraudDice.setMode(1); // weakmode
        else
            fraudDice.setMode(0);
    }


}
