package ex11;

class 가구 {
    String name = "가구";

    가구(int num) {
        System.out.println("나 실행돼?");

    }
}
// 1.super는 부모의 heap 공간, this는 자신의 heap 공간
// 2.자식을 new하면 자식 생성자에 super() 문장이 생략되어 있음(상속의 관계)

// 자식을 new 하면 자식의 생성자에 super() 문장이 생략되어 있음
class 침대 extends 가구 {
    String name = "침대";

    침대() {
        super(1);
        System.out.println(super.name);
    }
}

// super 부모, this 자신의 heap 메모리공간
public class SuperEx01 {
    침대 s = new 침대();
}