package telran.java2022.post.dao;

import org.springframework.data.repository.CrudRepository;
import telran.java2022.post.model.Post;

import java.util.List;
import java.util.stream.Stream;

public interface PostRepository extends CrudRepository<Post, String> {
    Stream<Post> findByAuthorIgnoreCase(String author);



//    @Query("{tags: {$in: [?0]}}")
    Stream<Post> findPostsByTagsIn(List<String> tags);



}
