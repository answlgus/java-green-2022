package ex24;

import java.io.IOException;
import java.io.InputStream;

public class StringEx01 {
    public static void main(String[] args) {
        InputStream s = System.in;

        try {
            int n = s.read();
            System.out.println((char) n);

        } catch (IOException e) {
            System.out.println("에러");
        }
    }
}

// 단점: 한글자 씩만 가능
//
