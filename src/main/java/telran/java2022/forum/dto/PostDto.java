package telran.java2022.forum.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder

public class PostDto {
    int id;
    String title;
    String content;
    String author;
    LocalDateTime dateCreated;
    List<String> tags;
    Integer likes;
    List<String> comments;
}
