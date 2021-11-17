/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.usa.ciclo3.Ciclo3.Repository;

import co.usa.ciclo3.Ciclo3.Modelo.Category;
import co.usa.ciclo3.Ciclo3.Repository.crud.CategoryCrudRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Julian Lizcano
 */
@Repository
public class CategoryRepository {
    @Autowired
    private CategoryCrudRepository crud2;
    
     public List<Category> getAll(){
        return (List<Category>)crud2.findAll();       
    }
    
    public Optional <Category> getCategory(int id){
        return crud2.findById(id);
    }
    
    public Category save(Category category){
        return crud2.save(category);
    }
     public void delete(Category category){
        crud2.delete(category);
    }


}
