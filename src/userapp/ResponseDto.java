package userapp;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

//응답받는

@AllArgsConstructor
@Data

public class ResponseDto {
    private int code; // 1 성공, -1 실패, 0은 데이터 없음
    private String msg; // 실패의 원인을 알려줌
    private List<User> data; // 같은 패키지 안에 있기 때문에 import 할 필요 없다 import: 같은 패키지에 있는 것 처럼 해주는 것
}
