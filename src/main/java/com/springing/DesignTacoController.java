package com.springing;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

// Importing of the Model
import com.springing.Ingredient.*;

@Controller
@RequestMapping("/design")
public class DesignTacoController {
    @GetMapping
    @ModelAttribute
    public String showDesignForm(Model model) {
        // Demo Data from Database
        List<Ingredient> ingredients = Arrays.asList(
                new Ingredient("FLTO", "Flour Tortilla", Type.WRAP),
                new Ingredient("COTO", "Corn Tortilla", Type.WRAP),
                new Ingredient("GRBF", "Ground Beef", Type.PROTEIN),
                new Ingredient("CARN", "Carnitas", Type.PROTEIN),
                new Ingredient("TMTO", "Diced Tomatoes", Type.VEGGIES),
                new Ingredient("LETC", "Lettuce", Type.VEGGIES),
                new Ingredient("CHED", "Cheddar", Type.CHEESE),
                new Ingredient("JACK", "Monterrey Jack", Type.CHEESE),
                new Ingredient("SLSA", "Salsa", Type.SAUCE),
                new Ingredient("SRCR", "Sour Cream", Type.SAUCE)
        );
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    System.out.println(Arrays.toString(ingredients.toArray()));
        model.addAttribute("design", ingredients.toArray());
        return "design";
    }
}
