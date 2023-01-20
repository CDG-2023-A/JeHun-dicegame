package recorder;

import dice.FraudDice;
import player.FraudPlayer;
import player.Player;

import java.util.List;

public class Recorder {
    private int i = 0;
    public void scoreRecord(List<Player> playerList) { // 선수들의 점수 기록 및 출력 -> 선수들이 등록되어 있는 리스트 필요
        System.out.printf("[ ");
        //사기플레이어 이름 + " : " + 사기플레이어 점수 + 주사위 모드 + ", " + 일반플레이어 이름 + " : " + 일반플레이어 점수
        System.out.printf(playerList.get(i).getName() + " : " + playerList.get(i).getDice() + getDiceMode(playerList.get(i)) + ", " + playerList.get(i+1).getName() + " : " + playerList.get(i+1).getDicescore());
        System.out.println(" ]");
        System.out.println("");
    }
    // 주사위 모드를 불러와야 scoreRecord() 에서 printf 를 할 수 있음
    public String getDiceMode(FraudPlayer fraudPlayer) { // 주사위 모드가 있는 FraudPlayer 필요
        if(FraudDice.getMode() == 0) { //주사위 모드가 0이면
            return "[NORMAL]";
        }
        else if(FraudDice.getMode() == 1) { //주사위 모드가 1이면
            return "[WEAK]";
        }
        else { // 주사위 모드가 2이면
            return "[STRONG]";
        }
    }

    public void judge(List<Player> playerList) { //승자 출력
        System.out.println("승자를 기록합니다.");
        if (playerList.get(i).getDicescore() > playerList.get(i+1).getDicescore()) {// 사기플레이어의 점수가 더 높을시
            System.out.println(playerList.get(i) + "이/가 승리했습니다!");
        }
        else if (playerList.get(i).getDicescore() < playerList.get(i+1).getDicescore()) { // 일반플레이어의 점수가 더 높을시
            System.out.println(playerList.get(i+1) + "이/가 승리했습니다!");
        }
        else{ // 점수가 같은 경우
            System.out.println("무승부입니다");
        }
    }
}
