package ex24;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class StringEx02 {
    public static void main(String[] args) {
        InputStream in = System.in;

        // 고정된 길이의 문자를 받을 수 있다.
        InputStreamReader ir = new InputStreamReader(in);

        char[] data = new char[3];
        try {
            ir.read(data);
            System.out.println(data);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
