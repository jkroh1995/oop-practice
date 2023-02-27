package grade;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

public class GradeCalculatorTest {
    // 학점 계산기 도메인 : 이수한 과목, 학점 계산기
    // 이수한 과목 - 객체지향 프로그래밍, 자료구조, 중국어회화  ---> 과목(코스) 클래스로 표현 = 동적인 객체를 정적인 타입으로 추상화해서 도메인모델링한다.

    /**
     * 핵심 포인트
     */
    // 이수한 과목을 전달해 평균학점 계산을 요청한다. --> 학점 계산기 --->(학점수 * 교과목 평점)의 합계 ---> 과목(코스) 에게 요청
    //                                                       --->수강신청 총학점 수           ---> 과목(코스) 에게 요청

    // 과목은 해당 과목이 몇 학점인지, 어떤 등급을 받았는지를 알고 있다. 즉 얘들은 각각의 점수를 알고 있으니까 이 점수들을 받고 나눠주기만 하면 된다.

    @DisplayName("평균 학점을 계산한다.")
    @Test
    void calculateGradeTest() {
        List<Course> courses = List.of(new Course("OOP", 3, "A+"),
                new Course("자료구조", 3, "A+"));

        GradeCalculator gradeCalculator = new GradeCalculator(courses);
        double gradeResult = gradeCalculator.calculateGrade();

        assertThat(gradeResult).isEqualTo(4.5);
    }
}
