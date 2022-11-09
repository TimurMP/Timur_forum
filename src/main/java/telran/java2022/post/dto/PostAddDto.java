package telran.java2022.post.dto;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
@Builder
public class PostAddDto {
    String id;
    String title;
    String content;
    List<String> tags;


}
