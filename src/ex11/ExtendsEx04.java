package ex11;

/**
 * 신입이 실수하지 않는 설계를 해보자!
 */
// abstract class 추상 class
// 1.new 할 수 없다.
// 2. 추상 메서드를 만들 수 있다. (객체의 행위를 알 수 없을 때)
// 3.일반 메서드도 만들 수 있다.(모든 구체적인 것들의 공통적인 것)

abstract class ProtossUnit { // 종족이름
    abstract void setHp(int hp); // 매개변수로 hp 받아야 변경 가능

    abstract int getHp();

    abstract int getAttack();

}

// extends 는 하나만 가능하다.
// 일반 클래스는 추상 메서드를 가질 수 없다. -> 행위를 지정해줘야 한다.
class Zealot extends ProtossUnit { // 근거리 공격
    String name = "질럿"; // 상태변수 : new 할 때 뜸(heap)
    int hp = 100;
    int attack = 10;

    @Override
    void setHp(int hp) {
        this.hp = hp;

    }

    @Override
    int getHp() {
        return hp;

    }

    @Override
    int getAttack() {
        return attack;

    }
}

class Dragon extends ProtossUnit { // 원거리 공격
    String name = "드라곤";
    int hp = 100;
    int attack = 20;

    @Override
    void setHp(int hp) {
        this.hp = hp;

    }

    @Override
    int getHp() {
        return hp;
    }

    @Override
    int getAttack() {
        return attack;
    }

    class DarkTempler extends ProtossUnit { // 원거리 공격
        String name = "다크템플러";
        int hp = 100;
        int attack = 50;

        @Override
        void setHp(int hp) {
            this.hp = hp;

        }

        @Override
        int getHp() {

            return hp;
        }

        @Override
        int getAttack() {

            return attack;
        }

    }

    // DarkTempler
    // name = 다크 템플러
    // hp= 100
    // attack =50
    // Protossunit으로 추상화

    public class ExtendsEx04 {

        // static void attack(ProtossUnit u1, ProtossUnit u2) {
        // 1.u1이 u2 공격 -> u2.hp = u2.hp -u1.attack -> 자식변수에 접근 할 수 없음 -> 오버라이드 하기 / hp는
        // 찾는 메서드 변경하는 메서드, attack는 찾는 메서드 1개
        // u2.setHp(u2.getHp() - u1.getAttack());
        // 2.u2의 hp를 출력 -> sysout(u2.hp)
        // System.out.println(u2.getHp());
    }

    public static void main(String[] args) {
        ProtossUnit z1 = new Zealot();
        ProtossUnit d1 = new Dragon();
        ProtossUnit k1 = new Dragon();
        // attack(d1, z1);
        // attack(k1, z1);
    }
}
