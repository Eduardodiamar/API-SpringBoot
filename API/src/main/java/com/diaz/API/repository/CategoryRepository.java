/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.diaz.API.repository;

import com.diaz.API.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author eduardodiamar
 */
public interface CategoryRepository extends JpaRepository<Category, Integer>{
    
}
