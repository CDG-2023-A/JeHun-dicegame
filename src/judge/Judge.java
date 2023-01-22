package judge;

import player.FraudPlayer;
import player.Player;
import recorder.Recorder;

import java.util.ArrayList;
import java.util.List;

public class Judge {
    private List<Player> playerList = new ArrayList<Player>();
    //배열이 아닌 ArratList 사용해서 해보자.
    Recorder recorder = new Recorder();
    public void register(Player player) { // 선수 등록
        playerList.add(player);
    }
    public void start(int round) { // 게임 시작
        System.out.println("게임 시작");
        Recorder recorder1 = recorder;
        for( int j = 0; j < playerList.size(); j++) {
            if (playerList.get(j) == playerList.get(0)) { // playerList의 0번째는 사기플레이어
                // 사기플레이어의 치트 사용 FraudPlayer의 cheat() 메소드 불러오는 방법?
                // PlayerList에서 get을 이용해서 불러오면 player 클래스의 메소드만 사용가능한데, FraudPlayer 클래스에서 불러오는 방법은?

            }
            else { // 일반 플레이어는 일반 주사위 굴리기
                playerList.get(j).getDiceScore();
            }
        }
        for (int i = 0; i < round; i++) {
            recorder1.scoreRecord(playerList);
        }
        recorder1.judgeWin(playerList);
        // 점수, 승자 출력하기
    }




}
