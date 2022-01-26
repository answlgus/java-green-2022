package ex11;

class 엔진 {
    int power = 5000;
}
// has 관계를 만드는 법 : composition
// 생성자로 주입받기

// 소나타는 엔진에 의존적이다
// 구체적인 것에 의존하는 것 -> 강한 결합 (코드 수정을 요함)
// 추상적인 것에 의존하는 것 -> 느슨한 결합 (코드 수정이 필요없다)
class 소나타 { // 엔진이니? 했을 때 엔진이 아니기 때문에 extends하면 안됨 -> 다형성이 성립하는지?

    엔진 engine; // extends 안될 때 상태변수로 (값은 안들고 있는 상태 has 관계)

    소나타(엔진 engine) { // has관계에서는 뭘 받아야 하는지 생성자에 써줘야 함.
        this.engine = engine;
    }
}

public class CompositeEx01 {
    public static void main(String[] args) {
        엔진 e = new 엔진();
        소나타 s = new 소나타(e);
        System.out.println(s.engine.power);

    }
}
