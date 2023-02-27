package grade;

public class Course {

    private final String subject; // 과목명
    private final int credit; //학점
    private final String grade; //성적

    public Course(String subject, int credit, String grade) {
        this.subject = subject;
        this.credit = credit;
        this.grade = grade;
    }

    public int getCredit() {
        return credit;
    }

    private double getGradeToNumber() {
        switch (this.grade){
            case "A+" :
                return 4.5;
            case "A" :
                return 4;
            case "B+" :
                return 3.5;
            case "B" :
                return 3;
            case "C+" :
                return 2.5;
            case "C" :
                return 2;
            case "D+" :
                return 1.5;
            case "D" :
                return 1;
        }
        return 0;
    }

    public double multiplyCreditAndGrade() {
        return credit * getGradeToNumber();
    }
}
