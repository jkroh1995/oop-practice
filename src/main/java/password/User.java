package password;

public class User {

    private String password;

    public void initPassword(PasswordGenerator passwordGenerator) {
        /*
         *  기존에는 내부에서 랜덤하게 받았기 때문에 테스트하기가 어렵다.
         *  그러나 이를 컨트롤하기 위해 상위에 인터페이스를 선언하고 테스트 코드를 위해 인터페이스를 구현한 클래스를 통해
         *  성공과 실패의 경우를 통제하였다.
         *  실제로 운영이 될 때는 랜덤한 패스워드가 생성될 것이지만, 내부에서 랜덤하게 생성하지 않기 때문에 결합도를 낮출 수 있다.
         */
        //as-is
//      RandomPasswordGenerator randomPasswordGenerator = new RandomPasswordGenerator();

        //to-be
        String password = passwordGenerator.generatePassword();

        if(password.length() >= 8 && password.length() <=12){
            this.password = password;
        }
    }

    public String getPassword() {
        return password;
    }
}
