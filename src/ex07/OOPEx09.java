package ex07;

//선언하고 생성자로 초기화

class Person3 {
    String name; // stack에 안들어 가는 변수 :멤버 변수
    int height;
    int weight;

    Person3(String name, int height, int weight) {
        this.name = name; // this. -> heap에 있는 변수 쓰고싶을 때
        this.height = height;
        this.weight = weight;
    }
}

public class OOPEx09 {
    public static void main(String[] args) {
        Person3 s1 = new Person3("홍길동", 170, 70);
        Person3 s2 = new Person3("임꺽정", 150, 200);
        System.out.println(s1.name);
        System.out.println(s2.name);
    }
}