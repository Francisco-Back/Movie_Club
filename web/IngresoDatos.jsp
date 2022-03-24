<%-- 
    Document   : IngresoDatos
    Created on : 18/03/2022, 09:21:04
    Author     : Francisco Back
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="Css/Estilos.css" media="screen" />
        <link href="Css/bootstrap.min.css" rel="stylesheet">
        <title>INGRESO DATOS</title>
    </head>
    <body>
        <img  src="Imagenes/Fondo_Login.png" alt="Fondo" id="dg"/>
        <div class="container mt-4">
            <div class="form-group">
                <%-- Formulario manda datos a controlprincipal y enctype imagenes--%>
                <form class="col-md-6" action="ControlPrincipal?accion=Garchivo" method="POST" enctype="multipart/form-data">
                    <div class="card">
                        <div class="card-header text-center">
                            <h3>Ingreso de Datos Carrosuel</h3>
                        </div>
                        <div class="card-body">
                            <%-- Formulario --%>
                            <div class="card-body">
                                <%-- Nombre Pelicula --%>
                                <div class="form-group">
                                    <label>Nombre Pelicula</label>
                                    <input type="text" name="TxtNPelicula" class="form-control">
                                </div>
                                <%-- Nombre Pelicula Original --%>
                                <div class="form-group">
                                    <label>Original Pelicula</label>
                                    <input type="text" name="TxtNPelicula" class="form-control">
                                </div>
                                <%-- Reseña --%>
                                <div class="mb-3">
                                    <label for="exampleFormControlTextarea1" class="form-label">Reseña</label>
                                    <input type="text"  class="form-control"name="TxtResena"rows="3">
                                </div>
                                <div class="mb-3">
                                    <label for="exampleFormControlTextarea1" class="form-label">Sinopsis</label>
                                    <input type="text" class="form-control"name="TxtSinopsis" rows="3">
                                </div>

                                <%-- Ingreso de imagen --%>
                                <div class="form-group">
                                    <label> Imagen de Portada</label>
                                    <input type="file" name="ArchivoImagen" >
                                </div>

                            </div>
                            <div class="card-footer">
                                <button class="btn btn-outline-primary" name="envio" value="Garchivo" >Cargar Info</button>
                            </div>

                        </div>
                    </div> 
                </form>
                                
                <form class="col-md-6"  action="ControlPrincipal?accion=Regreso" method="POST">
                    <button  class="btn btn-outline-primary"  type="submit" value="Login" name="Inicio">Regreso</button>
                </form>


            </div>
        </div>
    </div>
    <div class="  container mt-4  ">
        <div class="form-group">
            <%-- Formulario manda datos a controlprincipal y enctype imagenes--%>
            <form class="col-md-6" action="ControlPrincipal?accion=GarchivoP" method="POST" enctype="multipart/form-data">
                <div class="card">
                    <div class="card-header text-center">
                        <h3>Ingreso de Datos Populares</h3>
                    </div>
                    <div class="card-body">
                        <%-- Formulario --%>
                        <div class="card-body">
                            <%-- Nombre Pelicula --%>
                            <div class="form-group">
                                <label>Nombre Pelicula</label>
                                <input type="text" name="TxtNPelicula" class="form-control">
                            </div>
                            <%-- Nombre Pelicula Original --%>
                            <div class="form-group">
                                <label>Original Pelicula</label>
                                <input type="text" name="TxtNPelicula" class="form-control">
                            </div>
                            <%-- Reseña --%>
                            <div class="mb-3">
                                <label for="exampleFormControlTextarea1" class="form-label">Reseña</label>
                                <textarea class="form-control" id="exampleFormControlTextarea1" rows="3"></textarea>
                            </div>
                            <div class="mb-3">
                                <label for="exampleFormControlTextarea1" class="form-label">Sinopsis</label>
                                <textarea class="form-control" id="exampleFormControlTextarea1" rows="3"></textarea>
                            </div>

                            <%-- Ingreso de imagen --%>
                            <div class="form-group">
                                <label> Imagen de Portada</label>
                                <input type="file" name="ArchivoImagen" >
                            </div>

                        </div>
                        <div class="card-footer">
                            <button class="btn btn-outline-primary" name="envio" value="GarchivoP" >Cargar Info</button>
                        </div>
                    </div> 
            </form>

        </div>
    </div>
</div>       

</body>

</html>
