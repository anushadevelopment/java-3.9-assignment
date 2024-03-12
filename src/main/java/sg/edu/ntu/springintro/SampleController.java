package sg.edu.ntu.springintro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class SampleController {
   
    @Autowired
    private SampleItem item;
    
    @Autowired
    private Customer customer;


    @GetMapping("/hello")
	public String hello(){
		return "Hello World";
	}
	// @GetMapping("/greet")
	// public String greet(@RequestParam(defaultValue="world") String name){
	// 	return "Hello " + name + "!";

	// }
	@GetMapping("/greet")
	public String greet1(@RequestParam(defaultValue="world") String name, @RequestParam(defaultValue = "Doctor") String role){
		return "Hello " + name + "! You are " +role;

	}
	// @GetMapping("/products")
	// public String products(){
    // 	return "Products Page";
	// }


    // @GetMapping("/products/{id}")
    // public String getProducts(@PathVariable int id){
    //     return "You have requested for product with id : " +id;
    // }

    @GetMapping("/hayyo")
    public String searchProducts(@RequestParam(defaultValue = "Banana") String searchTerm){
        return "You have searched for " + searchTerm;
    }

    @Value("${spring.application.name : Demo Spring intro 3.9}")
    private String appName;

    @Value("${server.port:8080}")
    private String serverPort;

    @GetMapping("/app-info")
    public String getAppInfo(){
        return "App  " +appName + " is running in port " +serverPort;

    }

    @GetMapping("/item")
    public SampleItem getItem(){
    item.setId(1);
    item.setName("Apple");
    item.setPrice(10.06);
    item.setDesc("This is a Fruit");
    return item;
    }


    @GetMapping("/customer")
    public Customer getCustomer(){
        customer.setFirstName("anusha");
        customer.setLastName("Muthu");
        customer.setId(1);
        customer.setContactNo("1232442");
        customer.setEmail("abc@gmail.com");
        customer.setJobTitle("Software Engineer");

        return customer;
    }

    


    
}
