package ex24;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Scanner;

class MyScanner {

    InputStream in; // 바이트 크기의
    InputStreamReader ir; // 고정된 길이의 문자를 받음
    BufferedReader br; // 가변 길이의 문자를 받음

    MyScanner(InputStream in) {
        this.in = in;
        this.ir = new InputStreamReader(in);
        this.br = new BufferedReader(ir);
    }

    public String readLine() throws IOException {
        String line = br.readLine();
        return line;
    }

}

public class StringEx04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // buffer 로 만들어짐 가변길이의 문자열을 받을 수 있기 때문
        String line = sc.nextLine();
        System.out.println(line);
    }
}
