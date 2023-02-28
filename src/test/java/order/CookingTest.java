package order;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CookingTest {

    @DisplayName("메뉴에 해당하는 음식을 만든다.")
    @Test
    void makeCookTest() {
        Cooking cooking = new Cooking(); // 요리사 객체 만듦
        MenuItem menuItem = new MenuItem("돈가스", 5000); //내가 원하는 메뉴를 선택

        Cook cook = cooking.makeCook(menuItem); //요리하라고 시킴.

        assertThat(cook).isEqualTo(new Cook("돈가스", 5000));
    }
}
