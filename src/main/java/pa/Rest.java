package pa;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/rest")
public class Rest {
	
	@RequestMapping("/aa/{id}")
	//@Produces(XML)
    public List<String> aa(@PathVariable String id) {
		List<String> ss=new ArrayList<>();
		ss.add("Greetings from Spring Boot!");
		ss.add("Spring Boot!"+id);
		return ss;
        
    }

}
