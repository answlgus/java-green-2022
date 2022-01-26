package ex10;

import java.util.Scanner;

public class ArrayTest1 {
    public static void main(String[] args) {
        final int Student = 5;
        int total = 0;
        Scanner scan = new Scanner(System.in);
        int[] scores = new int[Student]; // 배열과 선언 동시에 가능
        for (int i = 0; i < Student; i++) {
            scores[i] = scan.nextInt();
        }

    }

}
