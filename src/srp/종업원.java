package srp;

//종업원 -요리사 (종업원이 요리사의 주소를 알아야 함)
public class 종업원 {

    // 주석!
    public 음식 주문받기(요리사 chef) { // 요리사의 매개변수 받는 이유: 의존성
        음식 jjajang = chef.음식생성(); // 메시지 전달 요리사는 누구에게도 의존성 없기 때문에 생성해서 return만 하면 됨
        return jjajang; // nulll = 아무것도 없음
    }
}
