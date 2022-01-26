package ex00;

//오버로딩 = over-loading (과적재)

/**
 * 1. 메서드는 동일한 이름으로 만들 수 없다.
 * 2.단 매개변수의 타입, 위치, 개수가 다른 경우 다른 메서드로 인식 -> 오버로딩
 * 3.장점: 개발자 입장에서 함수이름을 하나만 기억하면 된다.
 * 4.단점:경우의 수가 너무 많아지면 못 쓴다.(너무 많은 메서드가 필요하기 때문)
 * 5.사용 경우 -> 갯수가 적을 때!
 */

class 사자1 {
    String name = "사자1";
    int hp = 100;
    int attack = 10;
}

class 호랑이1 {
    String name = "호랑이1";
    int hp = 100;
    int attack = 15;
}

class 곰1 {
    String name = "곰1";
    int hp = 100;
    int attack = 50;
}

public class MethEx05 {

    // 사자 -> 호랑이 공격
    static void attack(사자1 unit1, 호랑이1 unit2) {
        System.out.println(unit2.name + "가 공격당하고 있습니다");
        unit2.hp = unit2.hp - unit1.attack;
        System.out.println(unit2.name + "의 hp: " + unit2.hp);
    }

    // 사자 -> 곰 공격
    static void attack(사자1 unit1, 곰1 unit3) {
        System.out.println(unit3.name + "이 공격당하고 있습니다");
        unit3.hp = unit3.hp - unit1.attack;
        System.out.println(unit3.name + "의 hp: " + unit3.hp);
    }

    // 호랑이 -> 사자 공격
    static void attack(호랑이1 unit2, 사자1 unit1) {
        System.out.println(unit1.name + "가 공격당하고 있습니다");
        unit1.hp = unit1.hp - unit2.attack;
        System.out.println(unit1.name + "의 hp: " + unit1.hp);
    }

    // 호랑이 -> 곰 공격
    static void attack(호랑이1 unit2, 곰1 unit3) {
        System.out.println(unit3.name + "이 공격당하고 있습니다");
        unit3.hp = unit3.hp - unit2.attack;
        System.out.println(unit3.name + "의 hp: " + unit3.hp);
    }

    // 곰-> 호랑이
    static void attack(곰1 unit3, 호랑이1 unit2) {
        System.out.println(unit2.name + "이 공격당하고 있습니다");
        unit2.hp = unit2.hp - unit3.attack;
        System.out.println(unit2.name + "의 hp: " + unit2.hp);
    }

    // 곰 -> 사자
    static void attack(곰1 unit3, 사자1 unit1) {
        System.out.println(unit3.name + "이 공격당하고 있습니다");
        unit3.hp = unit3.hp - unit1.attack;
        System.out.println(unit3.name + "의 hp: " + unit3.hp);
    }

    public static void main(String[] args) {
        사자1 u1 = new 사자1();
        호랑이1 u2 = new 호랑이1();
        곰1 u3 = new 곰1();

        attack(u1, u3);
        attack(u1, u2);

        attack(u2, u1);
        attack(u2, u3);

        attack(u3, u1);
        attack(u3, u2);
        // heap 영역의 데이터가 계속 바뀜

        System.out.println(1);
        System.out.println(1.0);
        System.out.println(true);
    }
}
