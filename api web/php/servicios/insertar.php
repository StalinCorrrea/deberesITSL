<?php
include("conexion.php");
$con=conectar();

$cod=$_POST['codigo'];
$nombre=$_POST['nombre'];
$telefono=$_POST['telefono'];
$direccion=$_POST['direccion'];


$sql="INSERT INTO alumnos VALUES('$cod','$nombre','$telefono','$direccion')";
$query= mysqli_query($con,$sql);

if($query){
    Header("Location: index.php");
    
}else {
}
?>