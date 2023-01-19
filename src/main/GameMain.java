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
    public static int round = 5;
    public static void main(String[] args) {
        System.out.printf("플레이어1 이름 입력 : "); //플레이어1을 Player.FraudPlayer 로
        Scanner Scanner = new Scanner(System.in);
        String name1 = Scanner.next();

        System.out.printf("플레이어2 이름 입력 : "); //플레이어2를 일반 Player.Player 로
        String name2 = Scanner.next();

        FraudPlayer fraudPlayer = new FraudPlayer(name1, new FraudDice(), player1);
        Player player = new Player(name2, new Dice());
        Judge judge = new Judge();

        judge.register(fraudPlayer);
        judge.register(player);
        judge.start(round);

        Recorder scoreRecord = new Recorder();

        // 클래스가 나눠진 상태에서 fraudPlayer의 점수, Player의 점수를 나누는 방법 -> 상속을 이용

        Scanner.close();
    }

}
