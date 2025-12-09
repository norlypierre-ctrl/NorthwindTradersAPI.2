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

        products.add(new Product(1,"Apple",3,4));
        products.add(new Product(1,"Banana",3,4));
        products.add(new Product(1,"Cake",3,4));
    }

    @RequestMapping(path = "/Product", method = RequestMethod.GET)

}
