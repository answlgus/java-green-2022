package covidtest;

import java.util.List;
import java.util.Scanner;

import covidtest.ResponseDto.Response.Body.Items.Item;

public class MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("======시작일을 입력하세요=======");
        System.out.println("ex) 20220110");
        String startCreateDt = sc.nextLine();

        System.out.println("======종료일을 입력하세요=======");
        System.out.println("ex) 20220115");
        String endCreateDt = sc.nextLine();

        List<Item> covidList = DownloadCovid.getCovidList(startCreateDt, endCreateDt);

        for (int i = 0; i < covidList.size(); i++) {
            System.out.println("=======================================================");
            System.out.println("누적 의심신고 검사자: " + covidList.get(i).getAccExamCnt());
            System.out.println("등록일시 분초: " + covidList.get(i).getCreateDt());
            System.out.println("사망자 수: " + covidList.get(i).getDeathCnt());
            System.out.println("확진자 수: " + covidList.get(i).getDecideCnt());
            System.out.println("게시글 번호(감염현황 고유값): " + covidList.get(i).getSeq());
            System.out.println("기준일: " + covidList.get(i).getStateDt());
            System.out.println("기준시간: " + covidList.get(i).getStateTime());
            System.out.println("수정일시분초: " + covidList.get(i).getUpdateDt());
            System.out.println("=======================================================");
        }
    }
}
