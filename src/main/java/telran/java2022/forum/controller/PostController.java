package telran.java2022.forum.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import telran.java2022.forum.dto.PostAddDto;
import telran.java2022.forum.dto.PostDto;
import telran.java2022.forum.service.PostService;

@RestController
@RequiredArgsConstructor


public class PostController {

    final PostService postService;

    @PostMapping("/post/JavaFan")
    public PostDto addPost(@RequestBody  PostAddDto postAddDto){
        return  postService.addPost(postAddDto);
    }


    @GetMapping("/post/{id}")
    public PostDto findPostById(@PathVariable Integer id){
        return postService.findPostById(id);
    }



}
