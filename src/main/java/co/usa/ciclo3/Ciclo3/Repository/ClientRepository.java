/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.usa.ciclo3.Ciclo3.Repository;

import co.usa.ciclo3.Ciclo3.Modelo.Client;
import co.usa.ciclo3.Ciclo3.Repository.crud.ClientCrudRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Julian Lizcano
 */
@Repository

public class ClientRepository {
      @Autowired
    private ClientCrudRepository crud1;
    

    public List<Client> getAll(){
        return (List<Client>) crud1.findAll();       
    }
    
    public Optional <Client> getCliente(int id){
        return crud1.findById(id);
    }
    
    public Client save(Client client){
        return crud1.save(client);
    }
     public void delete(Client client){
        crud1.delete(client);
    }
}
