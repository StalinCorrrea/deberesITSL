<?php
header("Access-Control-Allow-Origin: *");
header("Content-Type: application/json; charset=UTF-8");

$conn = new mysqli("localhost", "univer_user", "123456", "univer_db");

$result = $conn->query("SELECT * FROM alumnos");

$outp = "";
while($rs = $result->fetch_array(MYSQLI_ASSOC)) {
  if ($outp != "") {$outp .= ",";}
  $outp .= '{"codigo":"'  . $rs["codigo"] . '",';
  $outp .= '"nombre":"'   . $rs["nombre"]        . '",';
  $outp .= '"telefono":"'   . $rs["telefono"]        . '",';
  $outp .= '"direccion":"'. $rs["direccion"]     . '"}';
}
$outp ='{"records":['.$outp.']}';
$conn->close();

echo($outp);
?>