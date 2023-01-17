package dice;

public class FraudDice {
    int mode = 0; // mode에 따라 weak와 strong을 나눠주기 위해

    public void setMode(int mode) { // 모드를 지정해주기 위해 set, get 이용 -> dice와 관련짓기 위한 방법?
        this.mode = mode;
    }

    public int getMode() {
        return mode;
    }

    public int weakmode() {
        while (true) {
            int randomnum2 = (int)(Math.random() * 6) + 1; //1부터 6까지 랜덤
            if(randomnum2 <= 4) { // 만약 randomnum2가 4 이하이면
                return randomnum2;
            }
        }
    }
    public int strongmode() {
        while (true) {
            int randomnum2 = (int)(Math.random() * 6) + 1; //1부터 6까지 랜덤
            if(randomnum2 >= 3) { // 만약 randomnum2가 3 이상이면
                return randomnum2;
            }
        }
    }
}
