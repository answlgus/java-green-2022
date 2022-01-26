package ex07;

class Doctor {
    String name = "홍길동";
    int sal = 5000;
}

public class OOPEx02 {
    public static void main(String[] args) {
        Doctor ddd = new Doctor(); // 4Byte ddd=reference 변수
        System.out.println(ddd.name);
        System.out.println(ddd.sal);
    }

}