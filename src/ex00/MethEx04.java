package ex00;

//오버로딩 = over-loading (과적재)

class 사자1 {
    String name = "사자";
    int hp = 100;
    int attack = 10;
}

class 호랑이1 {
    String name = "호랑이";
    int hp = 100;
    int attack = 15;
}

class 곰1 {
    String name = "곰";
    int hp = 100;
    int attack = 50;
}

public class MethEx04 {

    // 사자 -> 호랑이 공격
    static void attackLionToTiger(사자1 unit1, 호랑이1 unit2) {
        System.out.println(unit2.name + "가 공격당하고 있습니다");
        unit2.hp = unit2.hp - unit1.attack;
        System.out.println(unit2.name + "의 hp: " + unit2.hp);
    }

    // 사자 -> 곰 공격
    static void attackLionToBear(사자1 unit1, 곰1 unit3) {
        System.out.println(unit3.name + "이 공격당하고 있습니다");
        unit3.hp = unit3.hp - unit1.attack;
        System.out.println(unit3.name + "의 hp: " + unit3.hp);
    }

    // 호랑이 -> 사자 공격
    static void attackTigerToLion(호랑이1 unit2, 사자1 unit1) {
        System.out.println(unit1.name + "가 공격당하고 있습니다");
        unit1.hp = unit1.hp - unit2.attack;
        System.out.println(unit1.name + "의 hp: " + unit1.hp);
    }

    // 호랑이 -> 곰 공격
    static void attackTigerToBear(호랑이1 unit2, 곰1 unit3) {
        System.out.println(unit3.name + "이 공격당하고 있습니다");
        unit3.hp = unit3.hp - unit2.attack;
        System.out.println(unit3.name + "의 hp: " + unit3.hp);
    }

    // 곰-> 호랑이
    static void attackBearToTiger(곰1 unit3, 호랑이1 unit2) {
        System.out.println(unit2.name + "이 공격당하고 있습니다");
        unit2.hp = unit2.hp - unit3.attack;
        System.out.println(unit2.name + "의 hp: " + unit2.hp);
    }

    // 곰 -> 사자
    static void attackBeartoLion(곰1 unit3, 사자1 unit1) {
        System.out.println(unit3.name + "이 공격당하고 있습니다");
        unit3.hp = unit3.hp - unit1.attack;
        System.out.println(unit3.name + "의 hp: " + unit3.hp);
    }

    public static void main(String[] args) {
        사자1 u1 = new 사자1();
        호랑이1 u2 = new 호랑이1();
        곰1 u3 = new 곰1();

        attackLionToTiger(u1, u2);
        attackLionToBear(u1, u3);

        attackTigerToLion(u2, u1);
        attackTigerToBear(u2, u3);

        attackBeartoLion(u3, u1);
        attackBearToTiger(u3, u2);
        // heap 영역의 데이터가 계속 바뀜
    }
}
