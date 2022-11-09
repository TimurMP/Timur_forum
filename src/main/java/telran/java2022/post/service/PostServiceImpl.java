package telran.java2022.post.service;


import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import telran.java2022.post.dao.PostRepository;
import telran.java2022.post.dto.CommentDto;
import telran.java2022.post.dto.PostAddDto;
import telran.java2022.post.dto.PostDto;
import telran.java2022.post.dto.PostUpdateDto;
import telran.java2022.post.model.Post;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PostServiceImpl implements PostService {

    final PostRepository postRepository;

    final ModelMapper modelMapper;



    @Override
    public PostDto addPost(PostAddDto postAddDto, String author) {
//        if (postRepository.findById(postAddDto.getId()).isPresent()){
//           return null;
//        }
        Post post = modelMapper.map(postAddDto, Post.class);
        post.setAuthor(author);
        postRepository.save(post);
        return modelMapper.map(post, PostDto.class);
    }

    @Override
    public PostDto findPostById(Integer id) {
        return null;
    }

    @Override
    public void addLike(Integer id) {

    }

    @Override
    public PostDto findPostByAuthor(String author) {
        return null;
    }

    @Override
    public PostDto addComment(CommentDto commentDto) {
        return null;
    }

    @Override
    public PostDto deletePost(Integer id) {
        return null;
    }

    @Override
    public List<PostDto> findPostsByTags(List<String> tags) {
        return null;
    }

    @Override
    public List<PostDto> findPostsByPeriod(LocalDateTime from, LocalDateTime to) {
        return null;
    }

    @Override
    public PostDto updatePost(PostUpdateDto postUpdateDto) {
        return null;
    }
}
