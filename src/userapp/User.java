package userapp;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data // Getter, Setter. toString 자동생성
@AllArgsConstructor // user(int id, String name ... )

public class User {
    private int Id;
    private String username;
    private String password;
    private String email;
    private String created;
    private String updated;
}
