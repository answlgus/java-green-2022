package ex05;

public class VarEx04 {
    public static void main(String[] args) {
        // 1. 4가지 자료형 int, double, long, boolean --> 메모리 사이즈 미리 정할 수 있음
        // 2.문자열은 사이즈를 알 수 없다. 이런 것은 자료형이 아님! -> 자료형은 미리 세팅 할 수 있는데 문자열은 세팅을 할 수 없다.
        String s1 = "안녕하세요";
        System.out.println(s1);
        String s2 = s1; // *2 --> 주소가 저장된다
        s2 = "바보"; // 새로운 heap 공간이 할당된다.

        System.out.println(s1);
        System.out.println(s2);
    }
}
