package racingcar;

public class ErrorMessageUtils {

    private static final String ERROR_MESSAGE_PREFIX = "[ERROR]";

    public static String createMessage(String errorMessage) {
        return ERROR_MESSAGE_PREFIX + errorMessage;
    }
}
