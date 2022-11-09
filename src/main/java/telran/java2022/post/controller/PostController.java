package telran.java2022.post.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import telran.java2022.post.dto.PostAddDto;
import telran.java2022.post.dto.PostDto;
import telran.java2022.post.service.PostService;

@RestController
@RequiredArgsConstructor
public class PostController {

    final PostService postService;

    @PostMapping("/post/{author}")
    public PostDto addPost(@RequestBody PostAddDto postAddDto, @PathVariable String author){
        return  postService.addPost(postAddDto, author);
    }


    @GetMapping("/post/{id}")
    public PostDto findPostById(@PathVariable Integer id){
        return postService.findPostById(id);
    }



}
