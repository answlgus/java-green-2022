package ex05;

public class LogiclaOperator {
    public static void main(String[] args) {
        int x = 3; // x, y 는 stack 에 뜨는 데이터
        int y = 4;
        System.out.println((x == 3) && (y == 7)); // 둘 다 맞아야 함
        System.out.println((x == 3) || (y == 4)); // 둘 중 하나만 맞아도 됨
    }
}
