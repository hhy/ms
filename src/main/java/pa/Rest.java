package pa;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController("/rest")
public class Rest {
	//@RequestMapping("/index")
    public String index() {
        return "Greetings from Spring Boot!";
    }

}
