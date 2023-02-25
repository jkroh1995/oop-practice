package password;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatCode;

public class PasswordValidatorTest {

    @DisplayName("비밀번호가 최소 8자 이상, 12자 이하면 예외가 발생하지 않음.")
    @Test
    void validatePasswordLength() {
        assertThatCode(() -> PasswordValidator.validate("jkroh1995"))
                .doesNotThrowAnyException();
    }

    @DisplayName("비밀번호가 8자 미만, 12자 초과하는 경우 IllegalArgumentException 예외가 발생한다.")
    @ParameterizedTest
    @ValueSource(strings = {"1234567", "1234567891234"})
    void validateWrongPasswordLength(String password) {
        assertThatCode(() -> PasswordValidator.validate(password))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("비밀번호의 길이는 8이상 12이하여야 합니다.");
    }

}
