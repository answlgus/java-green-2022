package userapp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import com.google.gson.Gson;

public class MainApp {
    public static void main(String[] args) {
        // 1.예외처리 (통신은 항상 오류가 생길 수 있기 때문)
        try {
            String addr = "http://lalacoding.site/init/user";
            URL url = new URL(addr);

            // 2.다운캐스팅 conn은 ByteStream (아직 방향 안 정함)
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();

            // 3. 버퍼
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(conn.getInputStream(), "utf-8"));

            String responseJson = br.readLine();
            // System.out.println(responseJson); // 확인하기

            Gson gson = new Gson();
            ResponseDto dto = gson.fromJson(responseJson, ResponseDto.class);

            // 통신검증
            if (dto.getCode() != 1) {
                System.out.println("통신 실패" + dto.getMsg());
                return; // 원래 있던 queue로 돌아감
            }

            // 프로그램 만들기
            System.out.println(dto.getData().size()); // size 19바퀴 0~18
            for (int i = dto.getData().size() - 1; i >= 0; i--) {
                System.out.println("회원번호" + dto.getData().get(i).getId());
                System.out.println("유저네임" + dto.getData().get(i).getId());
                System.out.println("회원비밀번호" + dto.getData().get(i).getId());
                System.out.println("회원이메일" + dto.getData().get(i).getId());
                System.out.println("가입날짜" + dto.getData().get(i).getId());
                System.out.println("회원 로그인 날짜" + dto.getData().get(i).getId());
                System.out.println("=================");
            }

        } catch (Exception e) {
            e.printStackTrace(); // 오류를 추적 할 수 있는 로그를 콘솔에 보여줌.
        }
    }
}
