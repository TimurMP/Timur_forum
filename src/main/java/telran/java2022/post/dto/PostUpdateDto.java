package telran.java2022.post.dto;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
@Builder
public class PostUpdateDto {
    String title;

    List<String> tags;

    String content;


}
