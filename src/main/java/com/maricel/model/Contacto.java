/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maricel.model;

/**
 *
 * @author Usuario
 */
public class Contacto {
    //Atributos del modelo
     private String nombre;
      private String apellido;
       private String email;
        private String descripcion;
        private Integer id;
        
        //costructor vacio
        public Contacto(){
            
        }
         
           //getters y setters
        public String getNombre(){
            return nombre;
        }
        public void setNombre(String name){
            this.nombre= name;
            
        }
         public String getApellido(){
            return apellido;
        }
        public void setApellido(String apellido){
            this.apellido= apellido;
        }
            
             public String getEmail(){
            return email;
        }
        public void setEmail(String email){
            this.email= email;
        }
             public String getDescripcion(){
            return descripcion;
        }
        public void setDescripcion(String descripcion){
            this.descripcion= descripcion;
            
        }
         public Integer getId(){
            return id;
        }
        public void setId(Integer id){
            this.id= id;
        }
        
    
}
