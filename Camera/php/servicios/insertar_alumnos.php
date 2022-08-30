<?php
$con = new mysqli("localhost", "univer_user", "123456", "univer_db");

 if ($con->connect_errno) {
    echo 'Error al conectar base de datos: ', $con->connect_error;
    exit();
 }
 $id = $_GET['id'];
 $nombre = htmlspecialchars($_GET['nombre']);
 $telefono = htmlspecialchars($_GET['telefono']); 
 
 $sql = $con->prepare('INSERT INTO alumnos VALUES (?,?, ?,null)');
 $sql->bind_param('iss',$id, $nombre,$telefono);
 $sql->execute();
 echo 'OK\n';
 $con->close();
?>