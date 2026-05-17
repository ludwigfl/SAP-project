package com.example.demo.service;

import com.example.demo.model.Material;
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

    public Optional<Material> getById(int id){
        for(Material mat : materials){
            if(mat.getId() == (id)){
                return Optional.of(mat);
            }
        }
        return Optional.empty();
    }

    public Material add(Material material){
        material.setId((materials.size()+1));

        return material;
    }

    public void reduceStock(int id, int amount){
        for(Material mat : materials){
            if(mat.getId() == id){
                mat.setQuantity(mat.getQuantity() - amount);
            }
        }
    }

     public void increaseStock(int id, int amount){
        for(Material mat : materials){
            if(mat.getId() == id){
                mat.setQuantity(mat.getQuantity() + amount);
            }
        }
    }

}
