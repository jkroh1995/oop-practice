package password;

public class CorrectFixedPasswordGenerator implements PasswordGenerator {

    @Override
    public String generatePassword() {
        return "12345678";
    }
}
