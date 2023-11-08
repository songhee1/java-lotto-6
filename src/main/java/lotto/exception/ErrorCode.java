package lotto.exception;

public enum ErrorCode {
    NOT_DIVISIBLE_BY_1000("구입금액은 1000원으로 나누어 떨어져야 합니다.", IllegalArgumentException.class),
    NOT_SIX_SIZE_OF_LIST("6개의 숫자를 입력하셔야 합니다.", IllegalArgumentException.class),
    NOT_SAME_NUMBER_IN_LIST("중복되지 않은 숫자를 입력하셔야 합니다.", IllegalArgumentException.class),
    NOT_ALL_NUMBER("모두 숫자만 입력하셔야 합니다.", IllegalArgumentException.class),
    NOT_COMMA_SPLITTER("숫자는 콤마로 구분하셔야 합니다.", IllegalArgumentException.class),
    NOT_IN_RANGE("1부터 45 사이의 숫자를 입력하셔야 합니다.", IllegalArgumentException.class);
    private final String message;
    private final Class exception;

    ErrorCode(final String message, final Class exception){
        this.message = message;
        this.exception = exception;
    }

    public String getMessage(){
        return message;
    }

    public Class getExceptionClass() {
        return exception;
    }
}
