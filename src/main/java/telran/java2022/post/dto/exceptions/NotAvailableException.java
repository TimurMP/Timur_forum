package telran.java2022.post.dto.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.METHOD_NOT_ALLOWED)

public class NotAvailableException extends RuntimeException{

        public NotAvailableException(){
            super("Oops, this method will be implemented in the next version :)");
        }
}
