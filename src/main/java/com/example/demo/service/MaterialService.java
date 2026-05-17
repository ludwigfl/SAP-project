package com.example.demo.service;

import com.example.demo.model.Material;

import jakarta.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class MaterialService {
    private final List<Material> materials = new ArrayList<>();

    public MaterialService(){
        materials.add(new Material(0, "Radio", 5));
        materials.add(new Material(1, "Screen", 2));
        materials.add(new Material(2, "Antenna", 1));
    }

    public List<Material> getAll(){
        return materials;
    }

    public Optional<Material> getById(Integer id){
        for(Material mat : materials){
            if(mat.getId().equals(id)){
                return Optional.of(mat);
            }
        }
        return Optional.empty();
    }

    private int nextId = 3;

    public Material add(Material material){
        material.setId(nextId++);
        materials.add(material);

        return material;
    }

    public void reduceStock(Integer id, Integer amount){
        for(Material mat : materials){
            if(mat.getId().equals(id)){
                mat.setQuantity(mat.getQuantity() - amount);
            }
        }
    }

     public void increaseStock(Integer id, Integer amount){
        for(Material mat : materials){
            if(mat.getId().equals(id)){
                mat.setQuantity(mat.getQuantity() + amount);
            }
        }
    }

}
