package ex06;

import java.util.Scanner;

public class WhileEx01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int num = sc.nextInt(); // 사용자가 입력할 때까지 대기
            System.out.println("사용자 입력:" + num);

            if (num == 0) {
                break; // 반복문을 빠져나가는 키워드
            }
        }
    } // 메인 끝
}
