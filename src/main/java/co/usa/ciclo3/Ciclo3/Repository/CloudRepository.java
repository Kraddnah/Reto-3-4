/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.usa.ciclo3.Ciclo3.Repository;

import co.usa.ciclo3.Ciclo3.Modelo.Cloud;
import co.usa.ciclo3.Ciclo3.Repository.crud.CloudCrudRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Julian Lizcano
 */
@Repository
public class CloudRepository {
    @Autowired
    private CloudCrudRepository crud;

    public List<Cloud> getAll(){
        return (List<Cloud>) crud.findAll();       
    }
    
    public Optional <Cloud> getCloud(int id){
        return crud.findById(id);
    }
    
    public Cloud save(Cloud Cloud){
        return crud.save(Cloud);
    }
      public void delete(Cloud Cloud){
        crud.delete(Cloud);
    }    
    
}
