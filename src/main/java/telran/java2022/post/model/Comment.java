package telran.java2022.post.model;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
public class Comment {
    @Setter
    String message;
    @Setter
    String user;

    LocalDateTime dateCreated = LocalDateTime.now();
    int likes;

    @Override
    public String toString() {
        return
                "message='" + message + '\'' +
                ", user='" + user + '\'' +
                ", dateCreated=" + dateCreated +
                ", likes=" + likes
                ;
    }
}
