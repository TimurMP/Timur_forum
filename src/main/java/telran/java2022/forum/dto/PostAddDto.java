package telran.java2022.forum.dto;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
@Builder
public class PostAddDto {
    String title;
    String content;
    List<String> tags;


}
