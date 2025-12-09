package com.pluralsight.NorthwindTradersAPI2.Controllers;

import com.pluralsight.NorthwindTradersAPI2.Models.Product;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductControllers {
    private List<Product> products;

    public ProductControllers() {
        products = new ArrayList<>();

        products.add(new Product(1,"Apple",1,1.00));
        products.add(new Product(2,"Banana",1,1.50));
        products.add(new Product(3,"Cake",2,3.00));
    }

    @RequestMapping(path = "/Product", method = RequestMethod.GET)
    public List<Product> getProducts (){
        return products;
    }

    @RequestMapping(path = "/Product", method = RequestMethod.GET)
    public Product getProducts(@PathVariable int productID) {
        for (Product product : products){
            if (product.getProductID() == productID){
                return product;
            }
        }
        return null;
    }
}
