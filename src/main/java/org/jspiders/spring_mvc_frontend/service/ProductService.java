package org.jspiders.spring_mvc_frontend.service;

import org.jspiders.spring_mvc_frontend.model.Product;
import org.jspiders.spring_mvc_frontend.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repository;

    public List<Product> getAllProduct()
    {
        return repository.findAll();
    }
    public void addNewProduct(Product p)
    {
        repository.save(p);
    }

    public Product getProductById(int id)
    {
        return repository.findById(id).orElse(null);
    }

    public void updateProduct(Product p)
    {
        repository.save(p);
    }

   public void deleteProduct(int id)
   {
       repository.deleteById(id);
   }

   public List<Product> getProductByCategory(String search)
   {
       return repository.getProductByCategoryOrName(search);
   }

}
