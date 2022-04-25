package racingcar;

public class RacingCarName {

    private static final int MAX_NAME_LENGTH = 5;

    private final String racingCarName;

    public String getRacingCarName() {
        return racingCarName;
    }

    public RacingCarName(String racingCarName) {
        if (!validateRacingCarName(racingCarName))
            throw new IllegalArgumentException(ErrorMessageUtils.createMessage("자동차 이름을 5글자 이내로 입력해주세요."));
        this.racingCarName = racingCarName;
    }

    private static boolean validateRacingCarName(String racingCarName) {
        return racingCarName.length() < MAX_NAME_LENGTH;
    }
}
