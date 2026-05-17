package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.example.demo.model.Material;
import com.example.demo.service.MaterialService;

@RestController
@RequestMapping("/materials")
public class MaterialController {
    private final MaterialService service;

    public MaterialController(MaterialService service){
        this.service = service;
    }

    @GetMapping
    public List<Material> getAll(){
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Material getById(@PathVariable int id){
        return service.getById(id).orElse(null);
    }

    @PostMapping
    public Material add(@RequestBody Material mat){
        return service.add(mat);
    }

    @PostMapping("/{id}/in")
    public void addStock(@PathVariable int id, @RequestParam int quantity){
        if(id >= 0){
            service.increaseStock(id, quantity);
        }
    }

    @PostMapping("/{id}/out")
    public void removeStock(@PathVariable int id, @RequestParam int quantity){
        if(id >= 0){
            service.reduceStock(id, quantity);
        }
    }


}
