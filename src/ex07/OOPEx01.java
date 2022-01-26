package ex07;

class Car {
    int speed = 90; // 상태

}

public class OOPEx01 {

    public static void main(String[] args) {
        // new 는 heap에 할당해라는 키워드 + class 이름
        // car class 가 가지고 있는 static이 아닌 모든 것들이 heap에 뜬다.(static은 이미 떠 있기 때문)
        Car s1 = new Car();
        System.out.println(s1.speed);

        Car s2 = new Car();
        System.out.println(s2.speed);

    }
}
