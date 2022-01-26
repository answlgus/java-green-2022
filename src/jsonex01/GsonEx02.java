package jsonex01;

import com.google.gson.Gson;

class SMSDto {
    private String gropId;
    private int successCount;
    private int errorCount;

    public SMSDto(String gropId, int successCount, int errorCount) {
        this.gropId = gropId;
        this.successCount = successCount;
        this.errorCount = errorCount;
    }

    public String getGropId() {
        return gropId;
    }

    public void setGropId(String gropId) {
        this.gropId = gropId;
    }

    public int getSuccessCount() {
        return successCount;
    }

    public void setSuccessCount(int successCount) {
        this.successCount = successCount;
    }

    public int getErrorCount() {
        return errorCount;
    }

    public void setErrorCount(int errorCount) {
        this.errorCount = errorCount;
    }

}

public class GsonEx02 {
    public static void main(String[] args) {
        // {"group_id":"R2GdEONszq64lNB9","success_count":1,"error_count":0}
        String SMSReturn = "{\"groupId\":\"R2GdEONszq64lNB9\",\"successCount\":1,\"errorCount\":0}";
        System.out.println();

        Gson gosn = new Gson();
        SMSDto javaDto = gosn.fromJson(SMSReturn, SMSDto.class);
        System.out.println(javaDto);
    }
}
