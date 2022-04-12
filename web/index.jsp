<%-- 
    Document   : index
    Created on : 16/03/2022, 22:27:51
    Author     : Francisco Back
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="ListaEnlazada.ListaEnlazada" %>
<%@page import="Modelo.Pelicula" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <meta name="viewport" content="width=device-width, initial-scale=1.0">    
        <title>Movie Club</title>
        <link href="Css/bootstrap.min.css" rel="stylesheet">
        <link href="Css/Principall.css" rel="stylesheet">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
        <link rel="canonical" href="https://getbootstrap.com/docs/5.0/examples/carousel/">


        <style>
            .bd-placeholder-img {
                font-size: 1.125rem;
                text-anchor: middle;
                -webkit-user-select: none;
                -moz-user-select: none;
                user-select: none;
            }

            @media (min-width: 768px) {
                .bd-placeholder-img-lg {
                    font-size: 3.5rem;
                }
            }

        </style>
        <link href="Css/carousel.css" rel="stylesheet">

    </head>



    <body>
        <header>
            <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
                <a class="navbar-brand" href="index.jsp"> <img src="Imagenes/Logo Movie.png" width="119" height="80" alt="alt"/></a>
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>

                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul class="navbar-nav mr-auto">
                        <li class="nav-item active">
                            <a class="nav-link" href="#">Home <span class="sr-only">(current)</span></a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="#">Link</a>
                        </li>
                        <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                Dropdown
                            </a>
                            <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                                <a class="dropdown-item" href="#">Action</a>
                                <a class="dropdown-item" href="#">Another action</a>
                                <div class="dropdown-divider"></div>
                                <a class="dropdown-item" href="#">Something else here</a>
                            </div>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link disabled" href="#">Disabled</a>
                        </li>
                    </ul>

                    <form class="form-inline my-2 my-lg-0">
                        <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
                        <button class="btn btn-outline-success" type="submit">Search</button>
                    </form>
                    <form  class="form-inline my-2 my-lg-0" action="ControlVista" method="POST">
                        <button  class="btn btn-outline-primary"  type="submit" value="Login" name="Inicio">Login</button>
                    </form>
                </div>
            </nav>
        </header>
    <body ><!-- comment -->
        <h1 class="align-content-end">Cartelera</h1>

    </body>
    <main>
        <div class="carousel slide" >

            <div class="carousel-inner">
                <div class="carousel-item active" >

                    <%
                         String Imagen="t"; 
         
           Pelicula Vpeliculas=new Pelicula();
           
                        //se crea una variable de tipo listaEnlada que recibe mi lista de ingreso datos en variable de session
                   /*   ListaEnlazada Vista=new ListaEnlazada();
                        if(session.getAttribute("Session_Pelicula")!=null){
                            //asignamos el valor y le decimos de que tipo es
                            Vista=(ListaEnlazada)session.getAttribute("Session_Pelicula");
                        }
                        if(Vista!=null){
                            System.out.println("Lista de main index");
                         System.out.println(Vista.Recorrer_T());
                      
                        }*/
                          if(request.getAttribute("Nodo")!=null){  
                            System.out.println("Si regresa nodo" + request.getAttribute("Nodo"));
                           Vpeliculas=(Pelicula)request.getAttribute("Nodo");
                            System.out.println(Vpeliculas.getImagen());
                            System.out.println("Si funciona");
                            Imagen =Vpeliculas.getImagen();
                          
                   
                    %>
                    <!-- Carga la Imagen -->
                    <a href="Gen_Pag.jsp" > <img src="<%=Imagen%>" class="bd-placeholder-img" width="100%" height="100%" aria-hidden="true" preserveAspectRatio="xMidYMid slice" focusable="false" ><rect width="100%" height="100%" fill="#777" />
                    </a>
                </div>
                    <div>
                        
                    </div>
                
                 <form action="ControlPrincipal" method="post">
                <button class="carousel-control-next" type="submit" value="Lista" name="accion" >
                    <span class="carousel-control-next-icon" ></span>
                    <span class="visually-hidden">Next</span>
                </button>
              
                <button class="carousel-control-prev" type="submit" value="ListaP" name="accion" >
                    <span class="carousel-control-prev-icon" ></span>
                    <span class="visually-hidden">Previous</span>
                </button>
                    </form> 
                <%
                  }  
                %>
            </div>
            <h1 class="align-content-end"> Populares  </h1>
        </div>


        <!-- Marketing messaging and featurettes
        ================================================== -->
        <!-- Wrap the rest of the page in another container to center all the content. -->





        <div class="container marketing">

        </div><!-- /.container -->


        <!-- FOOTER -->
        <footer class="container">
            <p class="float-end"><a href="#">Back to top</a></p>
            <p>&copy; 2017–2021 Company, Inc. &middot; <a href="#">Privacy</a> &middot; <a href="#">Terms</a></p>
        </footer>



    </main>


</body>
</html>

