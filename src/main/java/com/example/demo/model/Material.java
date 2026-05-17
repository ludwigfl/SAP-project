package com.example.demo.model;


public class Material {
    private Integer id;
    private String name;
    private Integer quantity;

    public Material(){}

    public Material( Integer id, String name, Integer quantity){
        this.id = id; this.name = name; this.quantity = quantity;
    }

    public Integer getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public Integer getQuantity(){
        return quantity;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
}
