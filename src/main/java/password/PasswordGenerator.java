package password;

@FunctionalInterface // 기능이 하나밖에 없는 인터페이스라는 의미.
public interface PasswordGenerator {
    String generatePassword();
}
