package baseball.view;

public class OutputView {

    private static String BALL = "볼";
    private static String STRIKE = "스트라이크";
    private static String NOTHING = "낫싱";

    public void greetings() {
        System.out.println("숫자 야구 게임을 시작합니다.");
    }

    public void requestNumber() {
        System.out.println("숫자를 입력해주세요 : ");
    }

    public void gameOver() {
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
    }

    public void requestRestart() {
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
    }

    public void ball() {
        System.out.println(BALL);
    }

    public void strike() {
        System.out.println(STRIKE);
    }

    public void nothing() {
        System.out.println(NOTHING);
    }
}
