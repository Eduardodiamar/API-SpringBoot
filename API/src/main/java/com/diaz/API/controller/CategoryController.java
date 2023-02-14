/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.diaz.API.controller;

import com.diaz.API.model.Category;
import com.diaz.API.model.Product;
import com.diaz.API.services.CategoryServices;
import com.diaz.API.services.ProductServices;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author eduardodiamar
 */
@RestController
@RequiredArgsConstructor

public class CategoryController {
    private final CategoryServices categoryServices;
    
    @GetMapping("/category")
    public List<Category>listCategory(){
        return categoryServices.listCategory();
    }
    
    @GetMapping("/category/{id}")
    public ResponseEntity<Category>getProductById(@PathVariable Integer id){
        try{
            Category category = categoryServices.getCategoryById(id);
            return ResponseEntity.ok(category);
        }catch (Exception e){
            return ResponseEntity.notFound().build();
        }
    }
    
    @PostMapping("/category")
    public void newCategory(@RequestBody Category category){
        categoryServices.saveCategory(category);
    }
    
    @PutMapping("/category/{id}")
    public ResponseEntity<?> editCategory(@RequestBody Category category, @PathVariable Integer id){
        try {
            Category existentCategory = categoryServices.getCategoryById(id);
            existentCategory.setName(category.getName());
            categoryServices.saveCategory(existentCategory);
            return new ResponseEntity<Category>(category, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<Category>(HttpStatus.NOT_FOUND);
        }
    }
    @DeleteMapping("/category/{id}")
    public ResponseEntity deleteCategory(@PathVariable Integer id){
        try {
            categoryServices.deleteCategory(id);
             return new ResponseEntity( HttpStatus.OK);
        } catch (Exception e) {
                         return new ResponseEntity( HttpStatus.NOT_FOUND);

        }
        
    }
}
