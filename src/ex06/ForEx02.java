package ex06;

//2의 i승 구하기
public class ForEx02 {
    public static void main(String[] args) {
        long result = 1;
        for (int i = 1; i < 25; i++) {

            result = result * 2;
        }
        System.out.println(result);
    } // main 끝
}
