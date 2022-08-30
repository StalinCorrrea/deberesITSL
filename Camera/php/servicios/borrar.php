<?php

include("conexion.php");
$con=conectar();

$cod_estudiante=$_GET['id'];

$sql="DELETE FROM alumnos  WHERE codigo='$cod_estudiante'";
$query=mysqli_query($con,$sql);

    if($query){
        Header("Location: index.php");
    }
?>