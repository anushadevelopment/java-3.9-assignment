package sg.edu.ntu.springintro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @Autowired
    private Product product;


    @GetMapping("/products/{productId}")
    public String getProducts(@PathVariable int productId){
        product.setId(productId);
        product.setProductName(null);
        String output ="";
        if (productId == 1){
            output = "This is detail for ID: " +productId+"and Product Name: Apple";
        }else if (productId ==2){
            output = "This is detail for ID: " +productId+"and Product Name: Banana";
        }
        else if (productId ==3){
            output = "This is detail for ID: " +productId+"and Product Name: Carrot";
        }
        else{
            output = "No Product found";
        }
        return output;
    }

    
}
