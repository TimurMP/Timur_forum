package telran.java2022.post.service;


import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import telran.java2022.post.dao.PostRepository;
import telran.java2022.post.dto.*;
import telran.java2022.post.dto.exceptions.NotAvailableException;
import telran.java2022.post.dto.exceptions.PostNotFoundException;
import telran.java2022.post.model.Comment;
import telran.java2022.post.model.Post;

import java.util.List;
import java.util.stream.Collectors;

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
    public PostDto findPostById(String id) {
        Post post = postRepository.findById(id).orElseThrow(() -> new PostNotFoundException(id));
        return modelMapper.map(post, PostDto.class);
    }

    @Override
    public void addLike(String id) {
        Post post = postRepository.findById(id).orElseThrow(() -> new PostNotFoundException(id));
        post.addLike();
        postRepository.save(post);
    }

    @Override
    public List <PostDto> findPostByAuthor(String author) {
        return postRepository.findByAuthorIgnoreCase(author)
                .map(post -> modelMapper.map(post, PostDto.class))
                .collect(Collectors.toList());
    }

    @Override
    public PostDto addComment(String id, CommentDto commentDto, String user, String message) {
        Post post = postRepository.findById(id).orElseThrow(() -> new PostNotFoundException(id));
        Comment comment = modelMapper.map(commentDto, Comment.class);
        comment.setUser(user);
        comment.setMessage(message);
        post.addComment(comment);
        postRepository.save(post);
        return modelMapper.map(post, PostDto.class);
    }

    @Override
    public PostDto deletePost(String id) {
        if (postRepository.findById(id).isEmpty()){
            return null;
        }
        Post post = postRepository.findById(id).orElse(null);
        postRepository.deleteById(id);
       return modelMapper.map(post, PostDto.class);


    }

    @Override
    public List<PostDto> findPostsByTags(List<String> tags) {
        return postRepository.findPostsByTagsIn(tags)
                .map(post -> modelMapper.map(post, PostDto.class))
                .collect(Collectors.toList());
    }

    @Override
    public List<PostDto> findPostsByPeriod(DateDto dateDto) {
        throw  new NotAvailableException();
        //Will be available in the next version :)
//        return null;
    }

    @Override
    public PostDto updatePost(String id, PostUpdateDto postUpdateDto) {
        Post post = postRepository.findById(id).orElse(null);
        if (post==null){
            return null;
        }
        post.setTitle(postUpdateDto.getTitle());
        post.setTags(postUpdateDto.getTags());
        post.setContent(post.getContent());
        postRepository.save(post);
        return  modelMapper.map(post, PostDto.class);

    }
}
