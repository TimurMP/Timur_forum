package telran.java2022.post.service;

import telran.java2022.post.dto.*;

import java.util.List;

public interface PostService {

PostDto addPost(PostAddDto postAddDto, String author);

PostDto findPostById(String id);

void addLike(String id);

List <PostDto> findPostByAuthor(String author);

PostDto addComment(String id, CommentDto commentDto, String user, String Message);

PostDto deletePost(String id);

List<PostDto> findPostsByTags(List<String> tags);

List<PostDto> findPostsByPeriod(DateDto dateDto);

PostDto updatePost(String id, PostUpdateDto postUpdateDto);




}
