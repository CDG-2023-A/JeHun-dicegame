package judge;

import player.FraudPlayer;
import player.Player;
import recorder.Recorder;

import java.util.ArrayList;
import java.util.List;

public class Judge {
    private List<Player> playerList = new ArrayList<Player>();
    private List<FraudPlayer> fraudPlayerList = new ArrayList<FraudPlayer>();
    //배열이 아닌 ArratList 사용해서 해보자.
    Recorder recorder = new Recorder();
    public void register(Player player) { // 선수 등록
        playerList.add(player);
    }
    public void register2(FraudPlayer fraudPlayer) {
        fraudPlayerList.add(fraudPlayer);
    }
    public void start(int round) { // 게임 시작
        System.out.println("게임 시작");
        Recorder recorder1 = recorder;
        for (int i = 0; i < round; i++) {
            if (i == 0) {
                fraudPlayerList.get(0).fraudAdd(fraudPlayerList.get(0).getDiceScore());
                playerList.get(1).normalAdd(playerList.get(1).getDiceScore());
            }
            else {
                trick();
            }
            recorder1.scoreRecord1(fraudPlayerList);
            recorder1.scoreRecord2(playerList);
        }
        recorder1.judgeWin(playerList, fraudPlayerList); // 점수, 승자 출력하기
    }

    public void trick() { //2번째부터 사기플레이어의 주사위 결정해주는 메소드
        for( int j = 0; j < playerList.size(); j++) {
            if (playerList.get(j) == playerList.get(0)) {
                if (fraudPlayerList.get(0).versus() - playerList.get(1).versus() < 0) {
                    fraudPlayerList.get(0).fraudAdd(fraudPlayerList.get(0).cheat1());
                }
                else if (fraudPlayerList.get(0).versus() - playerList.get(1).versus() >= 6) {
                    fraudPlayerList.get(0).fraudAdd(fraudPlayerList.get(0).cheat2());
                }
                else {
                    fraudPlayerList.get(0).fraudAdd(fraudPlayerList.get(0).cheat3());
                }
            }
            else { // 일반 플레이어는 일반 주사위 굴리기
                playerList.get(1).normalAdd(playerList.get(1).getDiceScore());
            }
        }
    }
}
