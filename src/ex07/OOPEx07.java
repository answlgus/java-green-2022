package ex07;

class person {
    String name;
    int height;
    int weight;

    // 클래스 설계도에 생성자를 직접 만들지 않으면 디폴트 생성자가 만들어진다.
    // 디폴트 생성자 -> 클래스명(){}

    // 디폴트 생성자 =객체의 초기화를 위해 필요
    person() {
        System.out.println("사람이 생성되었습니다");
        name = "홍길동";
        height = 170;
        weight = 70; // 이렇게 사용하지는 않는다. 매번 똑같은 사람이 생성될거니까
    }
}

public class OOPEx07 {
    public static void main(String[] args) {
        // person2 s1 = new person2();
        // System.out.println(s1.name);
    }
}
