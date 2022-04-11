/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controlador;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import org.apache.tomcat.util.http.fileupload.FileItem;
import org.apache.tomcat.util.http.fileupload.FileItemFactory;
import org.apache.tomcat.util.http.fileupload.RequestContext;
import org.apache.tomcat.util.http.fileupload.disk.DiskFileItemFactory;
import org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload;
import java.util.ArrayList;
import org.apache.tomcat.util.http.fileupload.servlet.ServletRequestContext;
import ListaEnlazada.ListaEnlazadaC;
import ListaEnlazada.Nodo;
import Modelo.Pelicula;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 *
 * @author Francisco Back
 */

@WebServlet(name = "ControlPrincipal", urlPatterns = {"/ControlPrincipal"})
public class ControlPrincipal extends HttpServlet {
  ListaEnlazadaC Pelicula=new ListaEnlazadaC();
 Nodo Aux=null;
  Pelicula mv=new Pelicula();

  String Movie;
  
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session= request.getSession(true);
    String accion=request.getParameter("accion");
        System.out.println(accion);
    switch(accion){
        case "Garchivo":
         
            //Metodo que Crea la ruta del archivo
            try {
                ArrayList <String> DT=new ArrayList<>();
                
                FileItemFactory file =new  DiskFileItemFactory();
               
                ServletFileUpload fileUpload=new ServletFileUpload(file);
             
              List items=fileUpload.parseRequest(new ServletRequestContext(request));
              
                for (int i = 0; i < items.size(); i++) {
                    
                    FileItem fileItem= (FileItem)items.get(i);
                    
                    if(!fileItem.isFormField()){
                        File f=new File("C:\\xampp\\htdocs\\img\\"+fileItem.getName());
                        fileItem.write(f);
                      Movie=("http://localhost/img/"+fileItem.getName());
                        System.out.println("encontroimagen");
                    }else{
                        DT.add(fileItem.getString());
                        System.out.println(fileItem.getString());
                       
                    }
                    if(i==5){
                        break;
                    }
                }
              Pelicula.Ingresar(new Pelicula(DT.get(0), DT.get(1), DT.get(2), DT.get(3),Movie));
// se crea una varaible de Session para la informacion 
           
                 
              if(session.getAttribute("Session_Pelicula")!=null){
                  System.out.println("borra lista al ingresar aqui");
              // Pelicula=(ListaEnlazada(Pelicula));
               session.getAttribute("Session_Pelicula");
              }
              // se manda los mensajes de los atributos
           session.setAttribute("Session_Pelicula", Pelicula);
           request.setAttribute("stmensaje", "Carga Exitosa");
           request.setAttribute("stipo", "success");
                  request.getRequestDispatcher("ControlPrincipal?accion=Index").forward(request, response);
                
        } catch (Exception e) {
            // se existe algun error
             request.setAttribute("stmensaje", e.getMessage());
           request.setAttribute("stipo", "Error");
                  request.getRequestDispatcher("ControlPrincipal?accion=Index").forward(request, response);
        }
            break;
        case "Index":
          Pelicula.Recorrer();
            request.getRequestDispatcher("IngresoDatos.jsp").forward(request, response);
           
            break;
        case "Lista": 

               System.out.println("Ingreso a Lista 1" );

            if(session.getAttribute("Session_Pelicula")!=null){
    
                
              //  request.setAttribute("Nodo", Pelicula.NuevoRecorrido_D(Pelicula.Actual));
                 request.setAttribute("Nodo",mv);
                 request.setAttribute("Nodo_Actual", Aux);
                
                
            }else{
                request.setAttribute("Nodo",mv);
                System.out.println("fallo");
            }
             request.getRequestDispatcher("index.jsp").forward(request, response);
        
            break;
        case "ListaP":
               System.out.println("Ingreso a Lista 2" );

            if(session.getAttribute("Session_Pelicula")!=null){
                
                
                
              //  request.setAttribute("Nodo", Pelicula.NuevoRecorrido_D(Pelicula.Actual));
                 request.setAttribute("Nodo",mv);
                 request.setAttribute("Nodo_Actual", Aux);
                
                
            }else{
                request.setAttribute("Nodo",mv);
                System.out.println("fallo");
            }
             request.getRequestDispatcher("index.jsp").forward(request, response);
            break;
            
                case "Regreso":
                      request.setAttribute("Nodo", Pelicula.Recorrer_T());
           request.getRequestDispatcher("index.jsp").forward(request, response);
        
            break;
            
            default:
                throw new AssertionError();
          
    }
    }
    
  


    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

   
}
