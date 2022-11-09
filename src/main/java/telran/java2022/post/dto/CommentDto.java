package telran.java2022.post.dto;


import lombok.*;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder


public class CommentDto {

    String message;
    String user;
    LocalDateTime dateCreated = LocalDateTime.now();
    int likes;
}
