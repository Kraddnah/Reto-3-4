/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.usa.ciclo3.Ciclo3.Repository.crud;

import co.usa.ciclo3.Ciclo3.Modelo.Message;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Julian Lizcano
 */
public interface MessageCrudRepository extends CrudRepository<Message,Integer> {
    
}
