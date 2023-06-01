
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maricel.contactoservlet.jsp;

import com.maricel.dao.ContactoDao;
import com.maricel.dao.ContactoDAOImpl;
import com.maricel.model.Contacto;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 *
 * @author Usuario
 */
@WebServlet(urlPatterns="/ContactoServlet")
public class ContactoServlet extends HttpServlet{
    
    private ContactoDao ContactoDAO;
    
    public ContactoServlet(){
        super();
        ContactoDAO = new ContactoDAOImpl();   
    }
    
     @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        this.procesarSolicitud(req, resp);
                   
    }  
     @Override
     protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
         this.procesarSolicitud(req, resp);
              
     }
     protected void procesarSolicitud(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         switch (request.getParameter("action")){
             case "list":
                // this.list(request, response);
                 break;
             case "create":
                 this.create(request, response);
                 break;
             case "read":
                // this.read(request, response);
                 break;
             case "update":
                 //this.update(request, response);
                 break;
             case "delete":
                 //this.delete(request, response);
                 break;
             case "showRegister":
                 this.showRegister(request, response);
                 break;
             case "index":
                this.index(request, response);
                break;
            default:
               this.index(request, response);
                break;  
             
         }
     }
            
       

    private void index(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Se redirecciona al JSP "index.jsp", es decir la pagina principal.
        RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
        dispatcher.forward(request, response);
    }
        
        private void showRegister(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
               RequestDispatcher dispatcher = request.getRequestDispatcher("/view/create.jsp");
               dispatcher.forward(request, response);
        }    
               
               private void create(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
               //Recoger los datos desde la peticion
               String name =request.getParameter("nombre");
               String apellido =request.getParameter("apellido");
               String email =request.getParameter("email");
               String descripcion =request.getParameter("descripcion");
               //crear el objeto que se envia al BD
               Contacto objcontacto = new Contacto();
               objcontacto.setNombre(name);
               objcontacto.setApellido(apellido);
               objcontacto.setEmail(email);
               objcontacto.setDescripcion(descripcion);
               
              ContactoDAO.insert(objcontacto);
              
              //Redireccionar al "index"
              this.index(request, response);
              
               
               
} 
}
