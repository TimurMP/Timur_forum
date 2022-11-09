package telran.java2022.forum.service;

import telran.java2022.forum.dto.CommentDto;
import telran.java2022.forum.dto.PostAddDto;
import telran.java2022.forum.dto.PostDto;
import telran.java2022.forum.dto.PostUpdateDto;

import java.time.LocalDateTime;
import java.util.List;

public interface PostService {

PostDto addPost(PostAddDto postAddDto);

PostDto findPostById(Integer id);

void addLike(Integer id);

PostDto findPostByAuthor(String author);

PostDto addComment(CommentDto commentDto);

PostDto deletePost(Integer id);

List<PostDto> findPostsByTags(List<String> tags);

List<PostDto> findPostsByPeriod(LocalDateTime from, LocalDateTime to);

PostDto updatePost(PostUpdateDto postUpdateDto);




}
