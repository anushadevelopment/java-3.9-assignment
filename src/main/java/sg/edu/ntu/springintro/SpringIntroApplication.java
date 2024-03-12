package sg.edu.ntu.springintro;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
// @RestController
public class SpringIntroApplication {
	private static final Logger logger = (Logger) LoggerFactory.getLogger(SpringIntroApplication.class);

	public static void main(String[] args) {
		logger.info("Starting SpringIntroApplication");
		logger.warn("Test warning");
		logger.error("Error Warning");

		
		SpringApplication.run(SpringIntroApplication.class, args);



	}

	// @GetMapping("/hello")
	// public String hello(){
	// 	return "Hello World";
	// }
	// // @GetMapping("/greet")
	// // public String greet(@RequestParam(defaultValue="world") String name){
	// // 	return "Hello " + name + "!";

	// // }
	// @GetMapping("/greet")
	// public String greet1(@RequestParam(defaultValue="world") String name, @RequestParam(defaultValue = "Doctor") String role){
	// 	return "Hello " + name + "! You are " +role;

	// }
	// @GetMapping("/products")
	// public String products(){
    // 	return "Products Page";
	// }


    // @GetMapping("/products/{id}")
    // public String getProducts(@PathVariable int id){
    //     return "You have requested for product with id : " +id;
    // }

    // @GetMapping("/hayyo")
    // public String searchProducts(@RequestParam(defaultValue = "Banana") String searchTerm){
    //     return "You have searched for " + searchTerm;
    // }
	

}

