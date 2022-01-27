package postapp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import com.google.gson.Gson;

public class MainApp {
    public static void main(String[] args) {
        // 1.예외처리
        try {
            String addr = "http://lalacoding.site/init/post";
            URL url = new URL(addr);

            // 2.다운캐스팅
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();

            // 3.buffer
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(conn.getInputStream(), "utf-8"));

            String responseJson = br.readLine();
            Gson gson = new Gson();
            ResponseDto dto = gson.fromJson(responseJson, ResponseDto.class);

            // 통신 검증
            if (dto.getCode() != 1) {
                System.out.println("통신실패" + dto.getMsg());
                return;
            }

            // 프로그램 만들기
            for (int i = dto.getData().size() - 1; i >= 0; i--) {
                System.out.println("회원번호" + dto.getData().get(i).getId());
                System.out.println("유저네임" + dto.getData().get(i).getId());
                System.out.println("회원비밀번호" + dto.getData().get(i).getId());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
