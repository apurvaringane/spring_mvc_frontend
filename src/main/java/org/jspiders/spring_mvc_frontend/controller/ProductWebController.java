package org.jspiders.spring_mvc_frontend.controller;

import org.hibernate.query.criteria.JpaCriteriaUpdate;
import org.jspiders.spring_mvc_frontend.model.Product;
import org.jspiders.spring_mvc_frontend.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProductWebController {

    @Autowired
    private ProductService service;
    @GetMapping("/")
    public String getAllProduct(Model model)
    {
        model.addAttribute("products",service.getAllProduct());
        return "producthome";
    }

    @GetMapping("/getproductform")
    public String getProductForm(Model model)
    {
        model.addAttribute("product",new Product());
        return "productform";
    }

    @PostMapping("/saveproduct")
    public String saveProduct(Product product)
    {
        service.addNewProduct(product);
        return "redirect:/";
    }

    @GetMapping("/searchProduct")
    public String searchDynamically(@RequestParam(name = "Search") String productName,Model model)
    {
        model.addAttribute("products",service.getProductByCategory(productName));
        return "producthome";
    }
}
