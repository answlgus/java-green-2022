package ex00;

/**
 * 메서드 규칙
 * 1.투입구와 출구가 있다. 단 출구(return키워드 사용)는 항상 필요하지 않다.
 * 2.메서드는 하나의 모듈(특정한 역할/목적을 수행하는)이 될 수 있다.
 * 3.출구가 없을 경우 void를 사용 출구가 있는 reutrn을 통해 내보내는 것과 타입을 동일하게 해준다.
 * 4.메서드 내부(queue)를 몰라도 사용할 수 있다. --> 캡슐화
 * 5.메서드는 1급 객체인가? No. 자바에서는 1급 객체가 class 밖에 없다.
 * 6.메서드 만드는 이유: 특정한 역할/목적을 수행하는 코드 꾸러미를 만들어 두기 위해
 * -캡슐화, 재사용, 코드관리의 편리, 메모리 관리에도 효과적
 * 7.static 메서드 내부에서는 heap에 있는 데이터(상태)를 찾을 수 없다.
 */
public class MethEx03 {

    int sum = 0;

    void start() {
        int n1 = 10; // 4Byte
        int n2 = 20; // 4Byte
        int result = n1 + n2; // 4Byte
        sum = result; // heap에 보관
    }

    public static void main(String[] args) {
        // Meth
        // start(); // 클래스명 생략 가능 (같은 클래스 내부에 있기 때문에)

    }
}
