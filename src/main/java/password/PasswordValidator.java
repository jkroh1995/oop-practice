package password;

public class PasswordValidator {

    public static final String ERROR_LENGTH_MESSAGE = "비밀번호의 길이는 8이상 12이하여야 합니다.";

    public static void validate(String password) {
        int length = password.length();

        if(length <8|| length >12){
            throw new IllegalArgumentException(ERROR_LENGTH_MESSAGE);
        }
    }
}
