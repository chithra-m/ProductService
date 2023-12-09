package scaler.example.productservice.controller;

import org.springframework.web.bind.annotation.*;
import scaler.example.productservice.dto.CreateCategoryRequestDTO;
import scaler.example.productservice.dto.CreateProductRequestDTO;

@RestController
@RequestMapping("/products")
public class ProductController {

    @PostMapping("/")
    public String CreateProduct(@RequestBody CreateProductRequestDTO dto){
        return "Product created";
    }

    @GetMapping("/")
    public String GetallProduct(){
        return "Products";
    }

    @GetMapping("/{id}")
    public Integer GetProductById(@PathVariable Integer id){
        return id;
    }

    @DeleteMapping("/{id}")
    public String DeleteProductById(@PathVariable Integer id){
        return "Product deleted";
    }


}
