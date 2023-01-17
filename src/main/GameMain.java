package main;

import dice.Dice;
import dice.FraudDice;
import judge.Judge;
import player.FraudPlayer;
import player.Player;
import recorder.Recorder;

import java.util.Scanner;

// 주사위 게임
// 2명의 플레이어가 주사위를 각각 5번 번갈아 던져서 주사위 눈금의 총합이 높은 플레이어가 승자가 되는 프로그램
public class GameMain {
    static Judge [] judges = new Judge[100];
    static int n = 0;
    public static void main(String[] args) {
        System.out.printf("플레이어1 이름 입력 : "); //플레이어1을 Player.FraudPlayer 로
        Scanner kb = new Scanner(System.in);
        String name1 = kb.next();

        judges[n] = new Judge();
        judges[n].name = name1;
        n++;

        System.out.printf("플레이어2 이름 입력 : "); //플레이어2를 일반 Player.Player 로
        Scanner kb2 = new Scanner(System.in);
        String name2 = kb2.next();

        judges[n] = new Judge();
        judges[n].name = name2;

        FraudPlayer fraudPlayer = new FraudPlayer(name1, new FraudDice());
        Player player = new Player(name2, new Dice());
        Judge Judge = new Judge();
        //  Recorder 사용..?

        System.out.println("게임 시작");
        ScoreRecord();
        System.out.println("승자를 기록합니다.");
        Winner();
        // 클래스가 나눠진 상태에서 fraudPlayer의 점수, Player의 점수를 나누는 방법...?

        kb.close();
        kb2.close();
    }

    private static void ScoreRecord() {
        System.out.printf("[ ");
        for (int i = 0; i < 10; i++) { //5번 주사위 던지기 때문에 0부터 9까지 10번 반복
            System.out.printf(); //사기플레이어 이름 + " : " + 사기플레이어 점수 + 주사위 모드 + ", " + 일반플레이어 이름 + " : " + 일반플레이어 점수
        }
        System.out.println(" ]");
        System.out.println("");
    }

    private static void Winner() {
        if () {// 사기플레이어의 점수가 더 높을시

        }
        else if () { // 일반플레이어의 점수가 더 높을시

        }
        else{ // 점수가 같은 경우

        }
    }
}
