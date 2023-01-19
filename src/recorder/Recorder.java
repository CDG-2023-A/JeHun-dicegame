package recorder;

public class Recorder {
    public void scoreRecord() { //점수 출력
        System.out.printf("[ ");
        for (int i = 0; i < 10; i++) { //5번 주사위 던지기 때문에 0부터 9까지 10번 반복
            System.out.printf(); //사기플레이어 이름 + " : " + 사기플레이어 점수 + 주사위 모드 + ", " + 일반플레이어 이름 + " : " + 일반플레이어 점수
        }
        System.out.println(" ]");
        System.out.println("");
    }

    public void judge() { //승자 출력
        System.out.println("승자를 기록합니다.");
        if () {// 사기플레이어의 점수가 더 높을시

        }
        else if () { // 일반플레이어의 점수가 더 높을시

        }
        else{ // 점수가 같은 경우

        }
    }
}
