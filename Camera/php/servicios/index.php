<?php 
    include("conexion.php");
    $con=conectar();

    $sql="SELECT *  FROM alumnos";
    $query=mysqli_query($con,$sql);
?>
<!DOCTYPE html>
<html ng-app="myApp" lang="es">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
        <title>http-request</title>


        <!-- Incluir Bootstrap -->
        <link rel="stylesheet" href="css/bootstrap.min.css">

        <!-- Animate.css -->
        <link rel="stylesheet" href="css/animate.css">

        <!-- Incluir AngularJS -->
        <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.9/angular.min.js"></script>

        <script src="js/app.js"></script>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">
        
    </head>    
    <body>

        <div class="container" ng-controller="customersCtrl">
            
            <h1>HTTP Request</h1>
            <h4>Data dinámica</h4>
            <hr>
            <div class="container mt-5">
                    <div class="row"> 
                        
                        <div class="col-md-3">
                            <h1>Ingrese datos</h1>
                                <form action="insertar.php" method="POST">

                                    <input type="text" class="form-control mb-3" name="codigo" placeholder="Codigo">
                                    <input type="text" class="form-control mb-3" name="nombre" placeholder="Nombres">
                                    <input type="text" class="form-control mb-3" name="telefono" placeholder="Telefono">
                                    <input type="text" class="form-control mb-3" name="direccion" placeholder="Direccion">
                                    
                                    <input type="submit" class="btn btn-primary">
                                </form>
                        </div>
                    </div>
            </div>

            
            <table class="table table-striped">
                <tr>
                    <th>Codigo</th>
                    <th>Nombre</th>
                    <th>Telefono</th>
                    <th>Direccion</th>

                </tr>

                <tbody>
                        <?php
                            while($row=mysqli_fetch_array($query)){
                        ?>
                            <tr>
                                <th><?php  echo $row['codigo']?></th>
                                <th><?php  echo $row['nombre']?></th>
                                <th><?php  echo $row['telefono']?></th>
                                <th><?php  echo $row['direccion']?></th>    
                                <th><a href="actualizar.php?id=<?php echo $row['codigo'] ?>" class="btn btn-info">Editar</a></th>
                                <th><a href="borrar.php?id=<?php echo $row['codigo'] ?>" class="btn btn-danger">Eliminar</a></th>                                        
                            </tr>
                        <?php 
                           }
                        ?>
                </tbody>

            </table>


        </div><!-- fin del listadoCtrl -->

      
    </body>
</html>
