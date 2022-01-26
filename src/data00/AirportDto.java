package data00;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AirportDto {

    public Response response;

}

@Data
@AllArgsConstructor
class Response {
    private Header header;// 변수명을 동일하게!!
    private Body body;// 변수명을 동일하게!!
}

@Data
@AllArgsConstructor
class Header {

    private String resultCode;
    private String resultMsg;

}

@Data
@AllArgsConstructor
class Body {

    private Items items;

    @Data
    @AllArgsConstructor
    class Items {

        private List<Item> item;

        @Data
        @AllArgsConstructor
        class Item {

            private String airportId;
            private String airportNm;

        }
    }

}