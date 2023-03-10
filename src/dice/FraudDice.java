package dice;

public class FraudDice extends Dice{
    private int mode = 0; // mode에 따라 weak와 strong을 나눠주기 위해

    // 각 클래스에서의 멤버 변수는 private으로 해주는 것이 좋다. (캡슐화)
    // 캡슐화는 하는 이유 : 잘못된 값이 실수로 들어오는 경우를 방지할 수 있음. (다른 사람이 개발할 때도 이상 없게 할 수 있음)
    // private 변수에 값을 대입하기 위해서는 public으로 제공되는 set함수를 사용하는 방식 사용

    public void setMode(int mode) { // 모드를 지정해주기 위해 set, get 이용 -> dice와 관련짓기 위한 방법?
        this.mode = mode;
    }

    public int getMode() {
        return mode;
    }

    public int weakMode() { // 메소드명은 카멜케이스
        while (true) {
            int randomnum2 = (int)(Math.random() * 6) + 1; //1부터 6까지 랜덤
            if(randomnum2 <= 4) { // 만약 randomnum2가 4 이하이면
                return randomnum2;
            }
        }
    }
    public int strongMode() { // 카멜케이스
        while (true) {
            int randomnum2 = (int)(Math.random() * 6) + 1; //1부터 6까지 랜덤
            if(randomnum2 >= 3) { // 만약 randomnum2가 3 이상이면
                return randomnum2;
            }
        }
    }
}
