package com.ecommerce.microcommerce.model;

import com.fasterxml.jackson.annotation.JsonFilter;

import org.hibernate.annotations.Formula;
import org.hibernate.validator.constraints.Length;
import org.springframework.data.annotation.Transient;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Min;

@Entity
//@JsonFilter("monFiltreDynamique")
public class Product {

    @Id
    @GeneratedValue
    private int id;

    @Length(min=3, max=20, message = "Nom trop long ou trop court. Et oui messages sont plus stylés que ceux de Spring")
    private String name;

    @Min(value = 0)
    private int price;

    //information que nous ne souhaitons pas exposer
    //@Column(name = "purchase_price")
    private int purchasePrice;
    
    //@Transient
    @Formula("price - purchase_price")
    private int marge;

    //constructeur par défaut
    public Product() {
    }

    //constructeur pour nos tests
    public Product(int id, String name, int price, int purchasePrice) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.purchasePrice = purchasePrice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(int purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", purchasePrice=" + purchasePrice +
                '}';
    }
}
