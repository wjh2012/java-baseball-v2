package baseball;

import camp.nextstep.edu.missionutils.Randoms;

public class BaseBallRandomNumberGenerator implements BaseBallNumberGenerator{

    private static final int START_INCLUSIVE = 1;
    private static final int END_INCLUSIVE = 9;

    public int generate() {
        return Randoms.pickNumberInRange(START_INCLUSIVE, END_INCLUSIVE);
    }
}
