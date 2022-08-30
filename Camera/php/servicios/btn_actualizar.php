<?php

include("conexion.php");
$con=conectar();

//Se genera las variables con el mismo nombre de cada campo de la tabla. 
$cod_estudiante=$_POST['codigo'];
$nombre=$_POST['nombre'];
$telefono=$_POST['telefono'];
$direccion=$_POST['direccion'];

//editar los campos 
$sql="UPDATE alumnos SET  nombre='$nombre',telefono='$telefono',direccion='$direccion' WHERE codigo='$cod_estudiante'";
$query=mysqli_query($con,$sql);

    if($query){
        Header("Location: index.php");
    }
?>