package com.pluralsight.NorthwindTradersAPI2.Controllers;

import com.pluralsight.NorthwindTradersAPI2.Models.Category;
import org.springframework.web.bind.annotation.*;


import java.util.ArrayList;
import java.util.List;

@RestController
public class CategoryControllers {
    private List<Category> categories;

    public  CategoryControllers() {
            categories = new ArrayList<>();

            categories.add(new Category(1,"Fruits"));
            categories.add(new Category(1,"Deserts"));
            categories.add(new Category(1,"Drinks"));
        }

        @RequestMapping(path = "/Category", method = RequestMethod.GET)

    }