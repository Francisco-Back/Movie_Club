/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controlador;

import ApiPeliculas.ApiCartelera;
import java.io.IOException;

import ListaEnlazada.ListaEnlazadaC;
import ListaEnlazada.Nodo;
import Modelo.Pelicula;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONException;
import java.io.BufferedReader;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

import java.net.URL;
import java.util.ArrayList;

/**
 *
 * @author Francisco Back
 */
@WebServlet(name = "ControlPrincipal", urlPatterns = {"/ControlPrincipal"})
public class ControlPrincipal extends HttpServlet {

    ListaEnlazadaC Pelicula = new ListaEnlazadaC();

    Nodo Aux = null;
    Pelicula mv = new Pelicula();

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
        HttpSession session = request.getSession(true);
        String accion = request.getParameter("accion");
        System.out.println(accion);
        switch (accion) {
            //funcion Correcta solo Para Ingreso manual de Datos
            /*case "Garchivo":
         
            //Metodo que Crea la ruta del archivo
            try {
                ArrayList<String> DT = new ArrayList<>();

                FileItemFactory file = new DiskFileItemFactory();

                ServletFileUpload fileUpload = new ServletFileUpload(file);

                List items = fileUpload.parseRequest(new ServletRequestContext(request));

                for (int i = 0; i < items.size(); i++) {

                    FileItem fileItem = (FileItem) items.get(i);

                    if (!fileItem.isFormField()) {
                        File f = new File("C:\\xampp\\htdocs\\img\\" + fileItem.getName());
                        fileItem.write(f);
                        Movie = ("http://localhost/img/" + fileItem.getName());
                        System.out.println("encontroimagen");
                    } else {
                        DT.add(fileItem.getString());
                        System.out.println(fileItem.getString());

                    }
                    if (i == 5) {
                        break;
                    }
                }
                Pelicula.Ingresar(new Pelicula(DT.get(0), DT.get(1), DT.get(2), DT.get(3), Movie));
// se crea una varaible de Session para la informacion 

                if (session.getAttribute("Session_Pelicula") != null) {
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
            break;*/
            case "Index":
                Pelicula.Recorrer();
                request.getRequestDispatcher("IngresoDatos.jsp").forward(request, response);

                break;
            case "Lista":

                System.out.println("Ingreso a Lista 1");

                if (session.getAttribute("Session_Pelicula") != null) {

                    //  request.setAttribute("Nodo", Pelicula.NuevoRecorrido_D(Pelicula.Actual));
                    request.setAttribute("Nodo", mv);
                    request.setAttribute("Nodo_Actual", Aux);

                } else {
                    request.setAttribute("Nodo", mv);
                    System.out.println("fallo");
                }
                request.getRequestDispatcher("index.jsp").forward(request, response);

                break;
            case "ListaP":
                System.out.println("Ingreso a Lista 2");

                if (session.getAttribute("Session_Pelicula") != null) {

                    //  request.setAttribute("Nodo", Pelicula.NuevoRecorrido_D(Pelicula.Actual));
                    request.setAttribute("Nodo", mv);
                    request.setAttribute("Nodo_Actual", Aux);

                } else {
                    request.setAttribute("Nodo", mv);
                    System.out.println("fallo");
                }
                request.getRequestDispatcher("index.jsp").forward(request, response);
                break;

            case "Regreso":
                request.setAttribute("Nodo", Pelicula.Recorrer_T());
                request.getRequestDispatcher("index.jsp").forward(request, response);

                break;

            case "ApiCartelera":
                ObjetoCartelera();
                System.out.println(ObjetoCartelera());
                
                break;

            case "ApiPopulares":
               ApiPopularesHT();

                break;
            case "ApiArtistas":
                ApiArtistasHT("500");
                

                break;

            default:
                throw new AssertionError();

        }
    }
    
public  String ApiCarteleraHT(){
    String ApiCarteleraS = "http://api.themoviedb.org/3/movie/now_playing?api_key=3279286a0b6c539866973dfa2740eeec";
    String ApiCarteleraDat="";
                 try {
                    URL url=new URL(ApiCarteleraS);
                    HttpURLConnection apiC=(HttpURLConnection)url.openConnection();
                    apiC.setRequestMethod("GET");
                    apiC.setRequestProperty("Accept", "application/json");
                    if(apiC.getResponseCode()==200){
                        InputStreamReader DatEn=new InputStreamReader(apiC.getInputStream());
                        BufferedReader Datlee=new BufferedReader(DatEn);
                        ApiCarteleraDat=Datlee.readLine();
                        
                    }else{
                        System.out.println("Conexion No realizada");
                    }
                    apiC.disconnect();
                } catch (Exception e) {
                     System.out.println(e);
                }
        return ApiCarteleraDat;
}
public String ApiPopularesHT(){
     String ApiPopulares = "http://api.themoviedb.org/3/movie/popular?api_key=3279286a0b6c539866973dfa2740eeec";
     String ApiPopularesDat="";
                try {
                    URL url=new URL(ApiPopulares);
                    HttpURLConnection apiC=(HttpURLConnection)url.openConnection();
                    apiC.setRequestMethod("GET");
                    apiC.setRequestProperty("Accept", "application/json");
                    if(apiC.getResponseCode()==200){
                        InputStreamReader DatEn=new InputStreamReader(apiC.getInputStream());
                        BufferedReader Datlee=new BufferedReader(DatEn);
                    ApiPopularesDat=Datlee.readLine();
                    }else{
                        System.out.println("Conexion No realizada");
                    }
                    apiC.disconnect();
                } catch (Exception e) {
                     System.out.println(e);
                }
                return ApiPopularesDat;
}

public String ApiArtistasHT(String IDP){
    String ApiArtistasDat="";
                String ApiArtistas = "http://api.themoviedb.org/3/movie/"+IDP+"/credits?api_key=3279286a0b6c539866973dfa2740eeec";
                try {
                    URL url=new URL(ApiArtistas);
                    HttpURLConnection apiC=(HttpURLConnection)url.openConnection();
                    apiC.setRequestMethod("GET");
                    apiC.setRequestProperty("Accept", "application/json");
                    if(apiC.getResponseCode()==200){
                        InputStreamReader DatEn=new InputStreamReader(apiC.getInputStream());
                        BufferedReader Datlee=new BufferedReader(DatEn);
                     ApiArtistasDat=Datlee.readLine();
                    }else{
                        System.out.println("Conexion No realizada");
                    }
                    apiC.disconnect();
                } catch (Exception e) {
                     System.out.println(e);
                     
                }
    return ApiArtistasDat;
}

public ApiCartelera ObjetoCartelera(){
     ApiCartelera DatPelicula=new ApiCartelera();
     ArrayList <ApiCartelera> prueba=new ArrayList<>();
    try {
        System.out.println("ingreso");
        System.out.println(ApiCarteleraHT());
                   
                JSONArray ArrApiDat=new JSONArray(ApiCarteleraHT());
                System.out.println("paso 2");
                for (int i = 0; i < ArrApiDat.length(); i++) {
                    System.out.println("Ingreso ya con datos" + ArrApiDat.getString(i));
                    JSONObject AtributeDat= ArrApiDat.getJSONObject(i);
                    
                    
                    
   boolean adult=AtributeDat.getBoolean("adult");
  String backdrop_path=AtributeDat.getString("backdrop_path");
   float id=  AtributeDat.getFloat("id");
   String original_language=AtributeDat.getString("original_language");
   String original_title=AtributeDat.getString("original_title");
   String overview=AtributeDat.getString("overview");
   float popularity=AtributeDat.getFloat("popularity");
   String poster_path=AtributeDat.getString("poster_path");
   String release_date=AtributeDat.getString("release_date");
   String title=AtributeDat.getString("title");
   boolean video=AtributeDat.getBoolean("video");
   float vote_average=AtributeDat.getFloat("vote_average");
   float vote_count=AtributeDat.getFloat("vote_count");
   DatPelicula.setAdult(adult);
   DatPelicula.setBackdrop_path(backdrop_path);
   DatPelicula.setId(id);
   DatPelicula.setOriginal_language(original_language);
   DatPelicula.setOriginal_title(original_title);
   DatPelicula.setOverview(overview);
   DatPelicula.setPopularity(popularity);
   DatPelicula.setPoster_path(poster_path);
   DatPelicula.setRelease_date(release_date);
   DatPelicula.setTitle(title);
   DatPelicula.setVideo(video);
   DatPelicula.setVote_average(vote_average);
   DatPelicula.setVote_count(vote_count);
   
prueba.add(DatPelicula);
   
                }
                for (int i = 0; i < prueba.size(); i++) {
                    System.out.println(prueba.get(i));
        }
                
            } catch (JSONException e) {
                    System.out.println("Error"+e);
            }
              
    return DatPelicula;
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
