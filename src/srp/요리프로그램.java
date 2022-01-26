package srp;

public class 요리프로그램 {
    public static void main(String[] args) {
        손님 customer = new 손님();
        종업원 manager = new 종업원();
        요리사 chef = new 요리사();

        customer.주문하기(manager, chef); // 주문하기를 시작해줘야 함. manger ,chef -> new 하지 않기위해, 의존성 때문에
    }
}
