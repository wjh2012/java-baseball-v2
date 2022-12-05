package baseball.controller;

import baseball.domain.BaseBallGame;
import baseball.view.InputView;
import baseball.view.OutputView;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BaseBallController {

    BaseBallGame baseBallGame;
    OutputView outputView;
    InputView inputView;

    public BaseBallController() {
        baseBallGame = new BaseBallGame();
        outputView = new OutputView();
        inputView = new InputView();
    }

    private void start() {
        outputView.greetings();
    }

    private void play() {
        outputView.requestNumber();
    }

    private List<Integer> stringToInteger(String input) {
        try {
            return Arrays.stream(input.split(""))
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());
        } catch (Exception e) {
            throw new IllegalArgumentException("입력 에러", e);
        }
    }
}
