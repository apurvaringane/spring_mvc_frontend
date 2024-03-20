//package org.jspiders.spring_mvc_frontend.controller;
//
//import org.jspiders.spring_mvc_frontend.model.Product;
//import org.jspiders.spring_mvc_frontend.service.ProductService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//public class ProductController {
//    @Autowired
//    private ProductService service;
//
//
//    @GetMapping("/getproduct")
//    public List<Product> getAllProduct()
//    {
//        return service.getAllProduct();
//    }
//
//    @PostMapping("/addproduct")
//    public void addNewProduct(@RequestBody Product product)
//    {
//        service.addNewProduct(product);
//    }
//
//    @GetMapping("/getproduct/{id}")
//    public Product getProductById(@PathVariable(value = "id") int id)
//    {
//        return service.getProductById(id);
//    }
//    @PutMapping("/product/{id}")
//    public void updateProduct(@RequestBody Product product)
//    {
//        service.updateProduct(product);
//    }
//
//    @DeleteMapping("/deleteproduct/{id}")
//    public void deleteProduct(@PathVariable int id)
//    {
//        service.deleteProduct(id);
//    }
//}
//
//
////http://localhost:port/swagger-ui/index.html