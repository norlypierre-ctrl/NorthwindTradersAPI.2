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
            categories.add(new Category(2,"Deserts"));
            categories.add(new Category(3,"Drinks"));
        }

        @RequestMapping(path = "/Category", method = RequestMethod.GET)
        public List<Category> getCategories (){
            return categories;
        }

    @RequestMapping(path = "/Category", method = RequestMethod.GET)
    public Category getCategories(@PathVariable int categoryID) {
        for (Category category : categories){
            if (category.getCategoryID() == categoryID){
                return category;
            }
        }
        return null;
    }
}


