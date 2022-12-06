package baseball.domain;

import static baseball.domain.ScoreResult.BALL;
import static baseball.domain.ScoreResult.NONE;
import static baseball.domain.ScoreResult.STRIKE;

import baseball.BaseBallRandomNumberGenerator;
import java.util.ArrayList;
import java.util.List;

public class BaseBallGame {

    private final NumberMaker numberMaker;
    private final Computer computer;

    public BaseBallGame() {
        numberMaker = new NumberMaker(new BaseBallRandomNumberGenerator());
        computer = new Computer(numberMaker.makeNumbers());
    }

    public List<ScoreResult> guess(List<Integer> numbers) {
        List<ScoreResult> scoreResults = new ArrayList<>();

        numbers.forEach(n -> scoreResults.add(
                judgeNumber(numbers.indexOf(n), n)));

        return scoreResults;
    }


    private ScoreResult judgeNumber(int index, int value) {
        if (computer.hasValue(value)) {
            return judgeBallAndStrike(index, value);
        }
        return NONE;
    }

    private ScoreResult judgeBallAndStrike(int index, int value) {
        if (computer.hasValueAndLocation(index, value)) {
            return STRIKE;
        }
        return BALL;
    }
}
