<%-- 
    Document   : index
    Created on : 16/03/2022, 22:27:51
    Author     : Francisco Back
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <meta name="viewport" content="width=device-width, initial-scale=1.0">    
        <title>Movie Club</title>
          <link rel="stylesheet" type="text/css" href="Css/Estilos.css" media="screen" />
          <link rel="stylesheet" type="text/css" href="Css/bootstrap.min.css" media="screen" />
        
    </head>
    
    <body>
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

        <h1>Cartelera</h1>
            <form  class="form-inline my-2 my-lg-0" action="ControlPrincipal" method="POST">
            <button  class="btn btn-outline-primary"  type="submit" value="Login" name="Inicio">Peliculas</button>
           </form>
    </body>
</html>
