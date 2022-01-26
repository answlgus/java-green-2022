package ex24;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class StringEx03 {
    // 버퍼
    public static void main(String[] args) {
        InputStream in = System.in; // 단점 : 한자 씩 숫자로 받는다.
        InputStreamReader ir = new InputStreamReader(in); // 단점: 고정된 길이를 받는다

        // buffer 생성시 위 의 두가지를 기반으로 만들기 때문에 같이 써줘야 함
        BufferedReader br = new BufferedReader(ir);// 장점: 가변길이의 문자열을 받는다.

        String line;
        try {
            line = br.readLine();
            System.out.println("받은 문자열" + line);

        } catch (IOException e) {
            e.printStackTrace();
        }

        // 한줄로 쓰면(참고)
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
    }
}
