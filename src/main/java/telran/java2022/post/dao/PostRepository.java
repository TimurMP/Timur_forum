package telran.java2022.post.dao;

import org.springframework.data.repository.CrudRepository;
import telran.java2022.post.model.Post;

public interface PostRepository extends CrudRepository<Post, String> {



}
