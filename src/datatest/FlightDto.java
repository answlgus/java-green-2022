package datatest;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class FlightDto {
    private Response response;

    @Data
    @AllArgsConstructor
    class Response {
        private Header header;
        private Body body;

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
            private int numOfRows;
            private int pageNo;
            private int totlaCount;

            @Data
            @AllArgsConstructor
            class Items {
                private List<Item> item;

                @Data
                @AllArgsConstructor
                class Item {
                    private String airlineNm;
                    private String arrAirpotNm;
                    private String arrPlandTime;
                    private String depAirportNm;
                    private String depPlandTime;
                    private String economyCharge;
                    private String prestigeCharge;
                    private String vihicld;
                }
            }
        }
    }
}
