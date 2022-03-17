<%-- 
    Document   : Login
    Created on : 16/03/2022, 22:35:37
    Author     : Francisco Back
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>MOVIE CLUB LOGIN</title>
        <link rel="stylesheet" type="text/css" href="Css/Estilos.css" media="screen" />
    </head>
    <body >
        <img  src="Imagenes/Fondo_Login.png" alt="Fondo" id="dg"/>

        <!-- Ingreso imagen logo -->
        <img src="Imagenes/Movie Club.png" alt="Panel" id="Logo"/>.
        <div class="box">

            <!-- ingreso de mensaje -->
            <h1>Login Here</h1>
            <form  action="Controlador" method="POST">
                <!-- creando Usuario -->
                <label for="Nombre Usuario"> Usuario </label>
                <input type="text" placeholder="Usuario" name="txtUser"/> 
                <!-- creando Password -->
                <label for="Password"> Contraseña </label>
                <input type="Password" placeholder="Password" name="txtpassword"/>
                <!-- Boton -->
                <input  type="submit" value="Login" name="accion">
                <!-- enlase -->
                <a href="#">Recuperacion de Contraseña</a>
                <%
             
               

                %>
            </form>
        </div>


    </body>


</html>
