package ex07;

//설계도
class 마법사 {
    int hp = 30; // 상태
    int mp = 100; // 상태

    // 행위 = method
    // 1. 행위는 행위 안에 추가할 수 없다.
    // 2. 헹위는 method 이름 + () + {}로 만들어진다.
    void drink() {
        System.out.println("에너지 마시기"); // heap에 띄우기
        hp = 100; // 행위를 통해 상태 바꾸기 체력을 100으로
    }
}

public class OOPEx03 {
    public static void main(String[] args) {
        마법사 s1 = new 마법사();
        System.out.println("첫번째 마법사가 생성되었습니다");
        System.out.println("체력 :" + s1.hp);
        System.out.println("마나 :" + s1.mp);

        s1.drink(); // 메서드 호출(call)
        System.out.println("체력변경: " + s1.hp);

        // 마법금지 => 상태는 행위를 통해서 변경
        // s1.hp = 50;
        // System.out.println("체력변경: " + s1.hp);

        마법사 s2 = new 마법사();
        System.out.println("두번째 마법사가 생성되었습니다");
        System.out.println("체력 :" + s2.hp);
        System.out.println("마나 :" + s2.mp);

    }
}
