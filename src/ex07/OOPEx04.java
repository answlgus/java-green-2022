package ex07;

//1.자바는 모든 코드가 class 내부에 있어야 한다.
//2.자바는 class 만 1급
//3.class = 설계도
//4.클래스는 상태(변수)와 행위(메서드)를 가진다.
//5.static은 찾을 때 클래스명.변수명
//6.static 아닌 것들을 메모리에 띄우는 법 new

class Dog {
    int 배고픔 = 100;

    void 밥먹기() {
        배고픔 = 0;
    }
}

public class OOPEx04 {
    public static void main(String[] args) {
        Dog ss = new Dog();
        System.out.println(ss.배고픔);
        ss.밥먹기();
        System.out.println(ss.배고픔);
    }
}
