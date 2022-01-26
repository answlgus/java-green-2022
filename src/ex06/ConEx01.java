package ex06;

public class ConEx01 {
    public static void main(String[] args) {
        int point = 80; // 성적 (변수의 초기화)

        // 자바에서 괄호가 나오고 중괄호가 나오면 행위의 영역
        if (point >= 90) {
            System.out.println("A학점입니다");
        } else { // if 가 아니면
            System.out.println("A학점이 아닙니다");
        }
    }
}
