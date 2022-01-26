package ex11;

// 1. start 메서드에서 name을 출력해보세요!!
// 2. start 메서드에서 name 값을 변경해서 출력해보세요!! 변경하는 메서드 만들기
class 애완동물 {
    void sound() {
    }

    void printName() {

    }

    void changeName() {

    }
}

class 강아지 extends 애완동물 {

    String name = "강아지";

    void sound() {
        System.out.println("멍멍");
    }
}

class 고양이 extends 애완동물 {

    String name = "고양이";

    void printName() {
        System.out.println(name);
    }

    void sound() {
        System.out.println("야옹");
    }

    void changeName() {
        name = "변경된 고양이";
    }
}

public class ExtendsEx03 {

    static void start(애완동물 u1) {
        u1.sound();
        // System.out.println(u1.name);
        u1.printName();
        u1.changeName();
        u1.printName();
        System.out.println("===========");
    }

    public static void main(String[] args) {
        애완동물 cat = new 고양이();
        애완동물 dog = new 강아지();

        start(cat);
        start(dog);

    }
}