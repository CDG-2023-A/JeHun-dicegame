package recorder;

import dice.FraudDice;
import player.FraudPlayer;
import player.Player;

import java.util.List;

public class Recorder {
    private int i = 0;
    private Player player;
    private Recorder Recorder;

    public Recorder getRecorder() {return this.Recorder;}
    public String returnDiceMode(Player player) { // 주사위 모드가 있는 FraudPlayer 필요 > 어차피 FraudPlayer는 Player 안에 있다.
        // FraudDice 꺼내오기
        FraudDice fraudDice = (FraudDice) player.getDice();
        this.player = player;
        if(fraudDice.getMode() == 0) { //주사위 모드가 0이면
            return "[NORMAL]";
        }
        else if(fraudDice.getMode() == 1) { //주사위 모드가 1이면
            return "[WEAK]";
        }
        else { // 주사위 모드가 2이면
            return "[STRONG]";
        }
    }
    public void scoreRecord1(List<FraudPlayer> fraudPlayerList) { // 사기 플레이어의 이름, 점수, 모드 출력
        System.out.printf("[ ");
        //[ 사기플레이어 이름 + " : " + 사기플레이어 점수 + 주사위 모드 + ", "
        System.out.printf(fraudPlayerList.get(i).getName() + " : " + fraudPlayerList.get(i).getResult() + returnDiceMode(fraudPlayerList.get(i)) + ", ");
    }
    public void scoreRecord2(List<Player> playerList) { // 선수들의 점수 기록 및 출력 -> 선수들이 등록되어 있는 리스트 필요
        //일반플레이어 이름 + " : " + 일반플레이어 점수 ]
        System.out.printf(playerList.get(i+1).getName() + " : " + playerList.get(i+1).getResult());
        System.out.println(" ]");
        System.out.println("");
    }


    public int recorderWin(List<Player> playerList, List<FraudPlayer> fraudPlayerList) { //승자 출력
        System.out.println("승자를 기록합니다.");
        if (fraudPlayerList.get(i) instanceof FraudPlayer) {
            if (fraudPlayerList.get(i).versus() > playerList.get(i + 1).versus()) {// 사기플레이어의 점수가 더 높을시
                return 1;
            } else if (fraudPlayerList.get(i).versus() < playerList.get(i + 1).versus()) { // 일반플레이어의 점수가 더 높을시
                return 2;
            }
        }
        else if (playerList.get(i) instanceof Player) {
            if (fraudPlayerList.get(i + 1).versus() > playerList.get(i).versus()) {// 사기플레이어의 점수가 더 높을시
                return 3;
            } else if (fraudPlayerList.get(i + 1).versus() < playerList.get(i).versus()) { // 일반플레이어의 점수가 더 높을시
                return 4;
            }
        }
        else { // 점수가 같은 경우
            return 5;
        }
        return 0;
    }
}
