package order;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThatCode;

/**
 * 음식점에서 음식을 주문할 때 도메인을 구성하는 객체는 무엇이 있을까
 *  ㄴ 손님, 메뉴판 , 메뉴, 요리사, 요리
 *
 * 객체들 간에는 어떤 관계가 있을까
 *    ㄴ 손님 -- 메뉴판
 *    ㄴ 손님 -- 요리사
 *    ㄴ 요리사 -- 요리
 *
 * 동적인 객체를 정적인 타입으로 추상화해서 도메인 모델링
 *  ㄴ 손님 -- 손님 타입
 *  ㄴ 메뉴 -- 메뉴 타입
 *  ㄴ 메뉴판 -- 메뉴판 타입
 *  ㄴ 요리 -- 요리타입   =>  메뉴랑 같다.
 */

public class CustomerTest {

    @DisplayName("메뉴 이름에 해당하는 요리를 주문한다.")
    @Test
    void orderTest() {
        Customer customer = new Customer();
        Menu menu = new Menu(List.of(new MenuItem("돈가스", 5000), new MenuItem("냉면", 7000)));
        Cooking cooking = new Cooking();
        assertThatCode(() -> customer.order("냉면", menu, cooking))
                .doesNotThrowAnyException();
    }
}
