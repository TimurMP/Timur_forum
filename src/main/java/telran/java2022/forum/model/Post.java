package telran.java2022.forum.model;


import lombok.*;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@EqualsAndHashCode(of = "id")
@NoArgsConstructor

public class Post {
    @Id
    int id;

    @Setter
    String title;

    @Setter
    String content;

    String author;
    LocalDateTime dateCreated;
    @Setter
    List<String> tags;
    Integer likes;
    List<String> comments;


    public Post(int id, String title, String content, String author, LocalDateTime dateCreated, List<String> tags, Integer likes, List<String> comments) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.author = author;
        this.dateCreated = dateCreated;
        this.tags = tags;
        this.likes = likes;
        this.comments = comments;
    }

    public void addLike(){
        likes++;
    }

}
