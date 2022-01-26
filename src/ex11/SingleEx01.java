package ex11;

//패턴 -> 디자인 패턴 -> 설계도를 패턴으로 만드는 이유? 

//싱글톤 패턴
class 튜브 {
    private static 튜브 instance = new 튜브();

    private 튜브() {
    }

    public static 튜브 getlnstance() {
        System.out.println("만들어진 튜브를 가져옵니다");
        return instance;
    }
}

public class SingleEx01 {
    public static void main(String[] args) {
        튜브 t1 = 튜브.getlnstance(); // 자바의 모든 class 는 object class
        튜브 t2 = 튜브.getlnstance();

        System.out.println(t1.hashCode());
        System.out.println(t1.hashCode());
    }
}
