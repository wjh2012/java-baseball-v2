package baseball.domain;

import static baseball.domain.BaseBallResult.*;

import baseball.BaseBallRandomNumberGenerator;
import java.util.Arrays;
import java.util.List;

public class BaseBallGame {

    private NumberMaker numberMaker;
    private Computer computer;

    public BaseBallGame() {
        numberMaker = new NumberMaker(new BaseBallRandomNumberGenerator());
        computer = new Computer(numberMaker.makeNumbers());
    }

    public List<Integer> guess(List<Integer> numbers) {
        int ball = 0;
        int strike = 0;

        for (int i = 0; i < 3; i++) {
            int value = numbers.get(i);
            judgeNumber(i, value);
        }

        return Arrays.asList(ball, strike);
    }

    private BaseBallResult judgeNumber(int index, int value) {
        if (computer.hasValue(value)) {
            return judgeBallAndStrike(index, value);
        }
        return NONE;
    }

    private BaseBallResult judgeBallAndStrike(int index, int value) {
        if (computer.compareValue(index, value)) {
            return STRIKE;
        }
        return BALL;
    }
}
