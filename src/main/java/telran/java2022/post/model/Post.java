package telran.java2022.post.model;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@EqualsAndHashCode(of = "id")
@NoArgsConstructor
@Document(collection = "forum")



public class Post {
    @Id
    String id;

    @Setter
    String title;

    @Setter
    String content;

    @Setter
    String author;
    LocalDateTime dateCreated = LocalDateTime.now();
    @Setter
    List<String> tags;
    @Setter
    Integer likes = 0;


    List<Comment> comments = new ArrayList<>();


    public Post(String id, String title, String content, String author, LocalDateTime dateCreated, List<String> tags, Integer likes, List<Comment> comments) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.author = author;
        this.dateCreated = dateCreated;
        this.tags = tags;
//        this.likes = likes;
//        this.comments = comments;
    }

    public void addLike(){
        likes++;
    }

    public boolean addComment(Comment comment){
        return comments.add(comment);
    }

}
