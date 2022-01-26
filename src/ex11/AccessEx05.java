package ex11;

//하나의 자바 파일에 두개의 public class 가 있을 수 없다. import 때문에
class 엘리스 {
    private int 목마름; // 상태에 접근 할 수 없게 private

    엘리스(int 목마름) {
        this.목마름 = 목마름;
    }

    // 통로
    public void 물마시기() { // 행위에는 public -> 상태를 행위를 통해 변경시키게 하기 위해
        목마름 = 목마름 - 20;
    }

    public int 갈증확인하기() { // 확인 메서드
        return 목마름;
    }

}

public class AccessEx05 {
    public static void main(String[] args) {
        엘리스 e1 = new 엘리스(100); // 엘리스 생성자를 만들어줬기 때문에 에러 -> 디폴트 생성자 만들기 or 숫자 넣어주기
        System.out.println("엘리스의 갈증지수" + e1.갈증확인하기());
        e1.물마시기();
        System.out.println("엘리스의 갈증지수" + e1.갈증확인하기()); // 문자열과 결합하면 문자열로 바뀜

        e1.물마시기();
        e1.물마시기();
        System.out.println("엘리스의 갈증지수" + e1.갈증확인하기());
    }
}
