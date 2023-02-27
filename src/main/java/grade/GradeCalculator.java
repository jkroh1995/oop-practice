package grade;

import java.util.List;

public class GradeCalculator {

    private final Courses courses;

    public GradeCalculator(List<Course> courses) {
        this.courses = new Courses(courses);
    }

    public double calculateGrade() {
        //일급 콜렉션 사용
        double multipliedCreditAndCourseGrade = courses.multiplyCreditAndCourseGrade();

        int totalCompletedCredit = courses.calculateTotalCompletedCredit();

        return multipliedCreditAndCourseGrade/totalCompletedCredit;
    }
}
