package jsonex01;
//json은 중간언어!

import com.google.gson.Gson;

//Dto = Data Transper Object
class UserDto {
    private String username;
    private String password;

    public UserDto(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

public class GsonEx01 {
    public static void main(String[] args) {
        // JavaObject를 json 으로 변경 (데이터 전송 목적)
        UserDto userDto = new UserDto("ssar", "1234");
        Gson gson = new Gson(); // toJson(json으로 바꾸는 함수), fromJson
        String jsonUserDto = gson.toJson(userDto);

        System.out.println(jsonUserDto);

        // Json -> JavaObject로 변경(데이터 다운로드 목적)
        SMSDto javaSmsDto = gson.fromJson(jsonUserDto, SMSDto.class);
        System.out.println(javaSmsDto.getGropId());
        System.out.println(javaSmsDto.getSuccessCount());
        System.out.println(javaSmsDto.getErrorCount());
    }
}
