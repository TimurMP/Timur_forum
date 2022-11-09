package telran.java2022.post.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import telran.java2022.post.dto.CommentDto;
import telran.java2022.post.dto.PostAddDto;
import telran.java2022.post.dto.PostDto;
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





    }
