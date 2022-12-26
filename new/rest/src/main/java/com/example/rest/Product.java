package com.example.rest;
//import javax.persistence.*;

//@Entity
//@Table(name = "product")
public class Product {

//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    @Column(name="product_id")
    private String id;


    public Product() {
    }

    private String name;
    private String description;
    private double price;
    private String seller;


    public Product(String id , String name, String description, double price , String seller)
    {
        super();
        this.id=id;
        this.name=name;
        this.description=description;
        this.price=price;
        this.seller=seller;

    }
    public String getId(){
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public String getDescription()
    {
        return description;
    }
    public double getPrice()
    {
        return price;
    }
    public String getSeller()
    {
        return seller;

    }
}