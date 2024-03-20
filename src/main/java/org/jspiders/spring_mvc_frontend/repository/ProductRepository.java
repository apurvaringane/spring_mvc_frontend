package org.jspiders.spring_mvc_frontend.repository;

import org.jspiders.spring_mvc_frontend.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;



@Repository
public interface ProductRepository extends JpaRepository<Product,Integer> {

    @Query("select p from Product p where p.productCategory=:search or p.productName=:search")
    List<Product> getProductByCategoryOrName(@Param("search") String search);
}
