package judge;

import player.Player;
import recorder.Recorder;

import java.util.ArrayList;
import java.util.List;

public class Judge {
    private List<Player> playerList = new ArrayList<Player>();
    //배열이 아닌 ArratList 사용해서 해보자.
    private String name;

    //  judge 로 Recorder 불러오는 방법 ?

    public void start(int round) { // 게임 시작
        System.out.println("게임 시작");
        for (int i = 0; i < round; i++) {
        }
    }

    public void register(Player player) { // 선수 등록
        playerList.add(player);
    }

    
}
