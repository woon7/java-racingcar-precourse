package racingcar;

public class RacingCarCommand {

    private static final int MIN_COMMAND_NUMBER = 0;

    private static final int MAX_COMMAND_NUMBER = 9;

    private static final int MIN_MOVE_COMMAND_NUMBER = 4;

    private static final int MAX_STOP_COMMAND_NUMBER = 3;

    private final int command;

    public RacingCarCommand(String command) {
        int parsedCommand = StringUtils.toIntDigit(command);
        if (!validationCommandNumber(parsedCommand)) {
            throw new IllegalArgumentException(ErrorMessageUtils.createMessage("0 ~ 9 사이의 숫자를 입력해주세요."));
        }
        this.command = parsedCommand;
    }

    private boolean validationCommandNumber(int command) {
        return command >= MIN_COMMAND_NUMBER && command <= MAX_COMMAND_NUMBER;
    }

    public boolean isMoveCommand() {
        return command >= MIN_MOVE_COMMAND_NUMBER;
    }

    public boolean isStopCommand() {
        return command <= MAX_STOP_COMMAND_NUMBER;
    }

}
