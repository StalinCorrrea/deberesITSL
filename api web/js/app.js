var app = angular.module('myApp', []);
app.controller('customersCtrl', function($scope, $http) {
  
 
  $scope.myData = {};
  $scope.posicion = 3;

  $http.get("php/servicios/listar_alumnos.php").then(function(response) {
    
    $scope.myData = response.data.records;
    
    
  });
  
  $scope.siguientes= function(){

    let x=myData.length;
    console.log(x);
    
    if(x <= $scope.posicion){
      
      $scope.posicion += 3;
    }
  }
  $scope.anteriores=function(){
    if( $scope.posicion > 3){
        $scope.posicion-=3;
    }
  }
});
