<%-- 
    Document   : Gen_Pag
    Created on : 26/03/2022, 14:06:44
    Author     : Francisco Back
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
 
    <main>
        <div class="carousel slide" >

            <div class="carousel-inner">
                <div class="carousel-item active" >

                    <!-- Carga la Imagen -->
                    <a > <img src="Imagenes/Carte.png" class="bd-placeholder-img" width="100%" height="100%" aria-hidden="true" preserveAspectRatio="xMidYMid slice" focusable="false" ><rect width="100%" height="100%" fill="#777" />
                    </a>
                </div>
                    <div>
                        
                    </div>
             
            </div>
        </div>


        <!-- Marketing messaging and featurettes
        ================================================== -->
        <!-- Wrap the rest of the page in another container to center all the content. -->





        <div class="container marketing">

            <!-- Three columns of text below the carousel -->
            <div class="row">
                <div class="col-lg-4">
     <a > <img src="Imagenes/Carte.png" class="bd-placeholder-img" width="300" height="300" aria-hidden="true" preserveAspectRatio="xMidYMid slice" focusable="false" ><rect width="100%" height="100%" fill="#777" />
                    </a>
                    <h2>Nombre Pelicula</h2>
                    <p>Some representative placeholder content for the three columns of text below the carousel. This is the first column.</p>
                   
                </div><!-- /.col-lg-4 -->
                             
                <form class="col-md-6"  action="ControlPrincipal?accion=Regreso" method="POST">
                    <button  class="btn btn-outline-primary"  type="submit" value="Login" name="Inicio">Regreso</button>
                </form>
            </div><!-- /.row -->

            <body>

            </body>

    </main>


</body>
</html>

