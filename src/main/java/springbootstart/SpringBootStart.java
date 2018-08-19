package springbootstart;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
@EnableAutoConfiguration
public class SpringBootStart {
	
	@RequestMapping("/")
	@ResponseBody
	String home() {
		return "Keep On Rockin' In The Free World!";
	}
	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(SpringBootStart.class, args);
	}

}
