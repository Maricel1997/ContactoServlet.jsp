/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.maricel.dao;

import com.maricel.model.Contacto;
import java.util.List;

/**
 *
 * @author Usuario
 */
public interface ContactoDAO {
    
    //Metodo que devuelve el listado de objetos
    public List<Contacto> findAll();
    //Metodo que inserta un objeto en la BBDD
    
    public Contacto insert(Contacto objcontacto);
    //Metodo que devuelve un objeto en base asu ID
    public Contacto findById(Integer Id);
    //Metodo que modifica un objeto en la base de datos en base a su ID
    
    public Contacto updateById(Integer id, Contacto objcontacto);
    //Metodo que elimina un objeto en la base datos en base a su ID
    
    public Boolean daletById(Integer Id);
    
    
    
    
}
