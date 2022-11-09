package telran.java2022.post.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import telran.java2022.post.dto.*;
import telran.java2022.post.service.PostService;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class PostController {

    final PostService postService;

    @PostMapping("/forum/post/{author}")
    public PostDto addPost(@RequestBody PostAddDto postAddDto, @PathVariable String author){
        return  postService.addPost(postAddDto, author);
    }


    @GetMapping("/forum/post/{id}")
    public PostDto findPostById(@PathVariable String id){
        return postService.findPostById(id);
    }

    @PutMapping("/forum/post/{id}/like")
    public void addLike(@PathVariable String id) {
        postService.addLike(id);
    }


    @GetMapping("/forum/posts/author/{author}")
    public List<PostDto> findPostByAuthor(@PathVariable String author) {
        return  postService.findPostByAuthor(author);
    }

    @PutMapping("/forum/post/{id}/comment/{user}")
    public PostDto addComment(@PathVariable String id, CommentDto commentDto, @PathVariable String user, @RequestBody String message) {
        return postService.addComment(id, commentDto, user, message);
    }


    @DeleteMapping("/forum/post/{id}")
    public PostDto deletePost(@PathVariable String id) {

        return postService.deletePost(id);
    }

    @PostMapping("/forum/posts/tags")
    public List<PostDto> findPostsByTags(@RequestBody List<String> tags) {
        return postService.findPostsByTags(tags);

    }

    @PostMapping("/forum/posts/period")
    public List<PostDto> findPostsByPeriod(DateDto dateDto) {
        return postService.findPostsByPeriod(dateDto);
    }


    @PutMapping("/forum/post/{id}")

    public PostDto updatePost(@PathVariable String id, @RequestBody PostUpdateDto postUpdateDto){
        return postService.updatePost(id, postUpdateDto);
    }


    }
