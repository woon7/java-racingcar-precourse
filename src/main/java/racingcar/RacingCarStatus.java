package racingcar;

public enum RacingCarStatus {

    MOVE, STOP;

    static RacingCarStatus of(RacingCarCommand racingCarCommand) {
        if (racingCarCommand.isMoveCommand())
            return MOVE;
        if (racingCarCommand.isStopCommand())
            return STOP;
        throw new IllegalStateException(ErrorMessageUtils.createMessage("정의되지 않은 Status 입니다."));
    }

    public static boolean isMoveStatus(RacingCarStatus racingCarStatus) {
        return racingCarStatus == MOVE;
    }

    public static boolean isStopStatus(RacingCarStatus racingCarStatus) {
        return racingCarStatus == STOP;
    }

}
