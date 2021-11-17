package Meta;

import lombok.*;

import java.util.Date;

@Getter @AllArgsConstructor
public class FacebookUser {
    private String userMail;
    private String country;
    private String lastActiveTime;
}
