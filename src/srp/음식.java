package srp;

//음식은 설계도, 요리사가 만들어야 할 책임이 있음

public class 음식 {
    private String name;

    public 음식(String name) {
        this.name = name; // 초기화해주기!
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
