package com.ecommerce.microcommerce.dao;

import com.ecommerce.microcommerce.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductDao extends JpaRepository<Product, Integer> {

    Product findById(int id);

    List<Product> findByPriceGreaterThan(int prixLimit);

    List<Product> findByNameLike(String recherche);

    @Query("SELECT id, name, price, purchasePrice  FROM Product p WHERE p.price > :prixLimit")
    List<Product>  chercherUnProduitCher(@Param("prixLimit") int prix);
    
    @Query("SELECT id, name, price, purchasePrice, marge FROM Product p")
    List<Product>  chercherMargeProduits();

	List<Product> findAllByOrderByName();
}
