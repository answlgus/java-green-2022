package ex22;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class CollectionEx03 {
    public static void main(String[] args) {
        Random r = new Random();

        Set<Integer> datas = new HashSet<>();

        while (true) { // HashSet의 size = 6 이 될 때 까지
            int n = r.nextInt(45) + 1; // 범위 0~1 , 0부터 나오기 때문에 +1해주기
            System.out.println(n);

            // HashSet에 n값을 add 해서 저장
            datas.add(n);

            // HashSet 데이터 크기가 6되면 break
            if (datas.size() == 6) {
                break;
            }

            // HashSet 데이터 출력
            System.out.println(datas);
        }
    }
}
