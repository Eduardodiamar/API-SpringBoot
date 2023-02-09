/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.diaz.API.services;

import com.diaz.API.model.Category;
import com.diaz.API.repository.CategoryRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author eduardodiamar
 */
@Service
public class CategoryServices {
    @Autowired
   private CategoryRepository repository;
   public List<Category>listCategory(){
       return repository.findAll();
   }
   public void saveCategory(Category category){
       repository.save(category);
   }
   
   public Category getCategoryById(Integer id){
       return repository.findById(id).get();
   }
   
   public void editCategory(String name, Integer id){
       repository.existsById(id);
   }
   public void deleteCategory(Integer id){
       repository.deleteById(id);
   }
}
