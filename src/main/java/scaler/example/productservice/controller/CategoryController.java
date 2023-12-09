package scaler.example.productservice.controller;

import org.springframework.web.bind.annotation.*;
import scaler.example.productservice.dto.CreateCategoryRequestDTO;

@RestController
@RequestMapping("/category")
public class CategoryController {

    @PostMapping("/")
    public String CreateCategory(@RequestBody CreateCategoryRequestDTO dto){
        return "Category created";
    }

    @GetMapping("/")
    public String GetallCategory(){
        return "Categorys";
    }

    @GetMapping("/{id}")
    public String GetCategoryById(@PathVariable Integer id){
        return "Category";
    }

    @DeleteMapping("/{id}")
    public String DeleteCategoryById(@PathVariable Integer id){
        return "Category deleted";
    }
}
