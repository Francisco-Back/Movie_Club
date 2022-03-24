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
import ListaEnlazada.ListaEnlazada;
import Modelo.Pelicula;

///*
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import org.apache.tomcat.util.http.fileupload.servlet.ServletRequestContext;
//*/
/*
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
*/

/**
 *
 * @author Francisco Back
 */

@WebServlet(name = "ControlPrincipal", urlPatterns = {"/ControlPrincipal"})
public class ControlPrincipal extends HttpServlet {
  ListaEnlazada Pelicula=new ListaEnlazada();
  Pelicula pelicula=new  Pelicula();
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
    String accion=request.getParameter("accion");
    switch(accion){
        case "Garchivo":
         
            //Metodo que Crea la ruta del archivo
            try {
                ArrayList <String> DT=new ArrayList<>();
                
                FileItemFactory file =new  DiskFileItemFactory();
               
                ServletFileUpload fileUpload=new ServletFileUpload(file);
                System.out.println("Aqui muere le programa ");
              List items=fileUpload.parseRequest(new ServletRequestContext(request));
               System.out.println("Aqui muere le programa ya no ");
                for (int i = 0; i < items.size(); i++) {
                     System.out.println("si ingreso for"+i);
                    FileItem fileItem= (FileItem)items.get(i);
                    
                    if(!fileItem.isFormField()){
                        File f=new File("C:\\Imagenes\\"+fileItem.getName());
                        fileItem.write(f);
                      pelicula.setImagen(f.getAbsolutePath());
                        System.out.println("encontroimagen");
                    }else{
                        DT.add(fileItem.getString());
                        System.out.println(fileItem.getString());
                       
                    }
                }
              
                pelicula.setNOriginal(DT.get(0));
                pelicula.setNPelicula(DT.get(1));
                pelicula.setResena(DT.get(2));
                pelicula.setSinopsis(DT.get(3));
                 Pelicula.AgregarPrimero(pelicula);
   
                  request.getRequestDispatcher("ControlPrincipal?accion=Index").forward(request, response);
                
        } catch (Exception e) {
        }
            break;
        case "Index":
            request.getRequestDispatcher("IngresoDatos.jsp").forward(request, response);
            break;
        case "Lista": 
                ListarP();
            break;
            
            default:
                throw new AssertionError();
    }
    }
    public ListaEnlazada ListarP(){
        return Pelicula;
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
