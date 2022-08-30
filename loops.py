#--------------------------------------------------------------------------------------------------
# Condicionales if else
#--------------------------------------------------------------------------------------------------
#ejercicio
#determinar si una persona puede ingresar o no a una discoteta y de ser el caso cual es el valor a pagar segun su sexo hombres=3$ mujeres 2$

# edad = 17
# sexo ="hombre"

# if edad >= 18:
#   print("puede ingresar")
#   if sexo=="hombre" :
#     print("Debe pagar 5$")
#   else:
#     print("Debe pagar 2$")
# else:
#     print("No puede ingresar")

#--------------------------------------------------------------------------------------------------
    
# # # LOOPS|CICLOS PYTHON
#--------------------------------------------------------------------------------------------------

# # # while
# # #ejercicio: calcular el promedio de un estudiante hasta que el usuario decida terminar



# print ("Introduzca la nota de un estudiante  ")
# nota = int(input())
# total=0
# contar=0
# while nota != -1:
#     total = total + nota
#     contar = contar + 1
#     print ("Introduzca la nota de un estudiante (-1 para terminar y calcular promedio): ")
#     nota = int(input())
# promedio = total / contar
# print ("Promedio de notas  es: " + str(promedio))
#--------------------------------------------------------------------------------------------------

# # # for
# # #ejercicio: Realizar una tabla de multiplicar

 
num = [1,2,3,4,5,6,7,8,9]
print('tabla del 2')
for x in num:
    resultado = 2 * x
    print(str(2) + '*' + str(x) + '=' + str(resultado))
    #--------------------------------------------------------------------------------------------------