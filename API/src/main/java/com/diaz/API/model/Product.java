/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.diaz.API.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author eduardodiamar
 */

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Product implements java.io.Serializable{
    @Id @GeneratedValue
    private Integer id;
    private String name;
    private float price;
    @ManyToOne
    @JoinColumn(name = "category")
    private Category category;
}
