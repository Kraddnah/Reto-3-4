/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.usa.ciclo3.Ciclo3.Service;

import co.usa.ciclo3.Ciclo3.Modelo.Cloud;
import co.usa.ciclo3.Ciclo3.Repository.CloudRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Julian Lizcano
 */
@Service
public class CloudService {
    @Autowired
    private CloudRepository metodosCrud;
    public List<Cloud> getAll(){
        return metodosCrud.getAll();
    }
    
    public Optional<Cloud> getCloud(int idCloud){
        return metodosCrud.getCloud(idCloud);
    }
    
    public Cloud save(Cloud Cloud){
        if(Cloud.getId()==null){
            return metodosCrud.save(Cloud);
        }else{
            Optional<Cloud> evt=metodosCrud.getCloud(Cloud.getId());
            if(evt.isEmpty()){
                return metodosCrud.save(Cloud);
            }else{
                return Cloud;
            }
        }
    }
    public Cloud update(Cloud Cloud){
        if(Cloud.getId()!=null){
            Optional<Cloud> e=metodosCrud.getCloud(Cloud.getId());
            if(!e.isEmpty()){
                if(Cloud.getName()!=null){
                    e.get().setName(Cloud.getName());
                }
                if(Cloud.getBrand()!=null){
                    e.get().setBrand(Cloud.getBrand());
                }
                if(Cloud.getYear()!=null){
                    e.get().setYear(Cloud.getYear());
                }
                if(Cloud.getDescription()!=null){
                    e.get().setDescription(Cloud.getDescription());
                }
                if(Cloud.getCategory()!=null){
                    e.get().setCategory(Cloud.getCategory());
                }
                metodosCrud.save(e.get());
                return e.get();
            }else{
                return Cloud;
            }
        }else{
            return Cloud;
        }
    }


    public boolean deleteCloud(int CloudId) {
        Boolean aBoolean = getCloud(CloudId).map(Cloud -> {
            metodosCrud.delete(Cloud);
            return true;
        }).orElse(false);
        return aBoolean;
    }
    
    
}
