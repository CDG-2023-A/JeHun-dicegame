package judge;

import player.FraudPlayer;
import player.Player;
import recorder.Recorder;

import java.util.ArrayList;
import java.util.List;

public class Judge {
    private List<Player> playerList = new ArrayList<Player>();
    private List<FraudPlayer> fraudPlayerList = new ArrayList<FraudPlayer>();
    private Recorder recorder;
    private int k = 1;
    //배열이 아닌 ArratList 사용해서 해보자.
    public Judge(Recorder recorder) {
        this.recorder = recorder;
    }
    public void register(Player player) { // 선수 등록
        playerList.add(player);
    }
    public void register2(FraudPlayer fraudPlayer) {
        fraudPlayerList.add(fraudPlayer);
    }
    public void start(int round) { // 게임 시작
        System.out.println("게임 시작");
        for (int i = 0; i < round; i++) {
            if (i == 0) {
                fraudPlayerList.get(0).fraudAdd(fraudPlayerList.get(0).getDiceScore());
                playerList.get(1).normalAdd(playerList.get(1).getDiceScore());
            }
            else {
                trick();
            }
            recorder.scoreRecord1(fraudPlayerList);
            recorder.scoreRecord2(playerList); // 점수 출력
        }
        announce(); // 승자 출력하기
    }

    public void trick() { //2번째부터 사기플레이어의 주사위 결정해주는 메소드
        for( int j = 0; j < fraudPlayerList.size(); j++) {
            if (fraudPlayerList.get(j) instanceof FraudPlayer) {
                if (fraudPlayerList.get(j).versus() - playerList.get(1).versus() < 0) {
                    fraudPlayerList.get(j).fraudAdd(fraudPlayerList.get(j).cheat1());
                }
                else if (fraudPlayerList.get(j).versus() - playerList.get(1).versus() >= 6) {
                    fraudPlayerList.get(j).fraudAdd(fraudPlayerList.get(j).cheat2());
                }
                else {
                    fraudPlayerList.get(j).fraudAdd(fraudPlayerList.get(j).cheat3());
                }
            }
        }
        if (playerList.get(k) instanceof  Player) {
            playerList.get(k).normalAdd(playerList.get(k).getDiceScore());
        }
    }
    public void announce() {
        if (recorder.recorderWin(playerList, fraudPlayerList) == 1) {
            System.out.println(playerList.get(0).getName() + "이/가 승리했습니다!");
        }
        else if (recorder.recorderWin(playerList, fraudPlayerList) == 2) {
            System.out.println(playerList.get(1).getName() + "이/가 승리했습니다!");
        }
        else if (recorder.recorderWin(playerList, fraudPlayerList) == 3) {
            System.out.println(playerList.get(1).getName() + "이/가 승리했습니다!");
        }
        else if (recorder.recorderWin(playerList, fraudPlayerList) == 4) {
            System.out.println(playerList.get(0).getName() + "이/가 승리했습니다!");
        }
        else System.out.println("무승부입니다");
    }
}
