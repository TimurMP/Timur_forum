package telran.java2022.post.dto.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)

public class PostNotFoundException extends RuntimeException {

    public PostNotFoundException(String id){
        super("Post " + id + " doesn't exist");
    }

}
